package me.jp78.lscontrol.method.api

import java.util.stream.Collectors
import java.util.stream.Stream

/**
 * Action class for linkensphere control.
 * @property methodName The exact linkensphere methodname
 * @property params The exact method parameters
 */
class Action(val methodName : String, vararg methodParams : String?)
{
    val params: MutableList<String> = Stream.of(methodParams).filter { it != null }.collect(Collectors.toList()) as MutableList<String>

}