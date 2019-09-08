package me.jp78.lscontrol.method

import me.jp78.lscontrol.method.api.Action

class ScrollTo(private val x: Int, private val y: Int) : Method
{
    override fun action(): Action
    {
        return Action("scrollTo", x.toString(), y.toString())
    }
}