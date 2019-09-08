package me.jp78.lscontrol

import com.google.gson.Gson
import me.jp78.lscontrol.method.Method
import me.jp78.lscontrol.method.api.Action

/**
 * Represents a linkensphere comamndset set.
 * LinkenSphere will execute the commands in the set sequentially, and return the page markup at the end of the set.
 *
 * For instance: A form fillout should be entirely contained in one command set, as no new data would be needed.
 */
class CommandSet
{
    private val actions = mutableListOf<Action>()
    private val gson : Gson = Gson()
    fun serialize(): String
    {
        return gson.toJson(actions)
    }

    fun addAction(action: Action)
    {
        actions.add(action)
    }

    class Result(val url: String, val html: String)


    /**
     * Provides an easy to use interface to build a [CommandSet]
     */
    class Builder()
    {
        val set = CommandSet()
        fun add(method: Method): Builder
        {
            set.addAction(method.action())
            return this;
        }

        fun build(): CommandSet
        {
            return set;
        }
    }
}