package me.jp78.lscontrol.method

import me.jp78.lscontrol.method.api.Action

/**
 * @property elemSelector Query selector
 */
class FormSubmit(private val elemSelector: String) : Method
{
    override fun action(): Action
    {
        return Action("formSubmit",elemSelector)
    }
}