package me.jp78.lscontrol.method

import me.jp78.lscontrol.method.api.Action

/**
 * A linkensphere Method/Action.
 *
 * This class has one function, [action], which builds and returns an Action to be sent to linkensphere.
 */
interface Method
{
    fun action() : Action
}