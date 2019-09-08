package me.jp78.lscontrol.method

import me.jp78.lscontrol.method.api.Action

class GoToURL(private val url: String, private val referer: String?) : Method
{
    override fun action(): Action
    {
        return Action("gotoUrl", url, referer)
    }
}