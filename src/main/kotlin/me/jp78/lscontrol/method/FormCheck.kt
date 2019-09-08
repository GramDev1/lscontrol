package me.jp78.lscontrol.method

import me.jp78.lscontrol.method.api.Action
/**
 * @property elemSelector Query selector
 */
class FormCheck(private val elemSelector: String, private val checked: Boolean) : Method
{
    override fun action(): Action
    {
        return Action("formCheck",elemSelector,checked.toString())
    }
}