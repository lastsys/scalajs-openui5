package org.scalajs.openui5.util

import scala.scalajs.js

import scala.language.implicitConversions

import js.JSConverters._

trait SettingsSetter[T <: js.Object, B <: Settings[T, _]] {
  protected def setting(name: String, setting: Any): B
}

abstract class Settings[T <: js.Object, B <: Settings[T,_]]
(copy: SettingsMap ⇒ B) extends SettingsSetter[T, B] {

  protected def dict: SettingsMap

  override protected def setting(name: String, setting: Any): B =
    copy(dict + (name → setting))

  private def result = dict.toJSDictionary.asInstanceOf[T]

  override def toString =
    s"""{\n${dict.keys.map{ key ⇒
      s"  $key = ${dict(key).toString}"}.mkString("\n")}\n}"""
}

object Settings {
  implicit def settings2Dict[T <: js.Object](settings: Settings[T, _]): T =
    settings.result
}
