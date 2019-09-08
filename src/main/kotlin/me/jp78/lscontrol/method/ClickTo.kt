package me.jp78.lscontrol.method

import me.jp78.lscontrol.method.api.Action

/**
 * If [x] and [y] are null, click here.
 */
class ClickTo(private val x: Int?, private val y: Int?) : Method
{
    override fun action(): Action
    {
        return Action("clickTo", x?.toString(), y?.toString())
    }
}