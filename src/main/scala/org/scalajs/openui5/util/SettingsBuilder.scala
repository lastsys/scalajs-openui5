package org.scalajs.openui5.util

import scala.scalajs.js
import scala.collection.mutable

import scala.language.implicitConversions

import js.JSConverters._


abstract class SettingsBuilder[T <: js.Object](dict: SettingsMap = mutable.Map()) {

  protected def setting(name: String, setting: Any): this.type = {
    dict += (name → setting)
    this
  }

  protected def result = dict.toJSDictionary.asInstanceOf[T]

  override def toString =
    s"""{\n${dict.keys.map{ key ⇒
      s"  $key = ${dict(key).toString}"}.mkString("\n")}\n}"""
}

object SettingsBuilder {
  implicit def builder2Settings[T <: js.Object](builder: SettingsBuilder[T]): T = builder.result
}
