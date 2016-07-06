package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.{Control, ControlSetters, ControlSettings, TextDirection}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait TokenSettings extends ControlSettings
object TokenSettings extends TokenSettingsBuilder(noSettings)

class TokenSettingsBuilder(val dict: SettingsMap)
  extends Settings[TokenSettings, TokenSettingsBuilder](new TokenSettingsBuilder(_))
    with TokenSetters[TokenSettings, TokenSettingsBuilder]

trait TokenSetters[T <: js.Object, B <: Settings[T,_]]
  extends ControlSetters[T, B] {

  def selected(v: Boolean) = setting("selected", v)
  def key(v: String) = setting("key", v)
  def text(v: String) = setting("text", v)
  def editable(v: Boolean) = setting("editable", v)
  def textDirection(v: TextDirection) = setting("textDirection", v)

  def delete(v: js.Function) = setting("delete", v)
  def press(v: js.Function) = setting("press", v)
  def select(v: js.Function) = setting("select", v)
}

@JSName("sap.m.Token")
@js.native
class Token(id: js.UndefOr[String] = js.native,
            settings: js.UndefOr[TokenSettings] = js.native) extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: TokenSettings) = this(js.undefined, settings)

  def getKey(): String = js.native
  def getText(): String = js.native
}
