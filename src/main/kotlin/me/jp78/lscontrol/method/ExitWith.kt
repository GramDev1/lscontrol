package me.jp78.lscontrol.method

import me.jp78.lscontrol.method.api.Action

class ExitWith(private val status: Int) : Method
{
    override fun action(): Action
    {
        return Action("exitWith",status.toString())
    }
}