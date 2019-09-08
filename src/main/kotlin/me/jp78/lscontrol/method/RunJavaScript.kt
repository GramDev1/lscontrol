package me.jp78.lscontrol.method

import me.jp78.lscontrol.method.api.Action

class RunJavaScript(private val code: String) : Method
{
    override fun action(): Action
    {
        return Action("runJavascript",code)
    }
}