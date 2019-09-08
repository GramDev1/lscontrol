package me.jp78.lscontrol.method

import me.jp78.lscontrol.method.api.Action

class ClickToElement(val elName: String) : Method
{
    override fun action(): Action
    {
        return Action("clickToElement",elName)
    }
}