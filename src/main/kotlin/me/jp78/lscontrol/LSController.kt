package me.jp78.lscontrol

import io.ktor.application.call
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.post
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.channels.Channel

/**
 * A linken sphere controller class. This abstracts away most of the headache
 *
 * Uses Ktor
 */
abstract class LSController
{
    val commandStack = Channel<CommandSet>()
    val resultStack = Channel<CompletableDeferred<CommandSet.Result>>()
    /**
     * Run the controller. Please note this is a suspension method, and we will use the awesome power of coroutines.
     */
    abstract suspend fun run()

    suspend fun execute(commandSet: CommandSet): CompletableDeferred<CommandSet.Result>
    {
        val deferred = CompletableDeferred<CommandSet.Result>()
        commandStack.send(commandSet)
        resultStack.send(deferred)
        return deferred;
    }


}

fun Route.control(controller: LSController, path: String)
{
    post(path) {
        controller.resultStack.receive()
            .complete(CommandSet.Result(call.parameters["url"]!!, call.parameters["html"]!!))
        call.respondText(controller.commandStack.receive().serialize())
    }
}