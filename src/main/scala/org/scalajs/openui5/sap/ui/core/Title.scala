package org.scalajs.openui5.sap.ui.core

import org.scalajs.openui5.util.{SettingsMap, Settings, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}

@ScalaJSDefined
trait TitleSettings extends ElementSettings
object TitleSettings extends TitleSettingsBuilder(noSettings)

class TitleSettingsBuilder(val dict: SettingsMap)
  extends Settings[TitleSettings, TitleSettingsBuilder](new TitleSettingsBuilder(_))
    with TitleSetters[TitleSettings, TitleSettingsBuilder]

trait TitleSetters[T <: js.Object, B <: Settings[T,_]]
  extends ElementSetters[T, B] {

  def text(v: String) = setting("text", v)
  def icon(v: URI) = setting("icon", v)
  def level(v: TitleLevel) = setting("level", v)
  def emphasized(v: Boolean) = setting("emphasized", v)
}

@JSName("sap.ui.core.Title")
@js.native
class Title(id: js.UndefOr[String] = js.native,
            settings: js.UndefOr[TitleSettings]) extends Element {

  def this(id: String) = this(id, js.undefined)
  def this(settings: TitleSettings) = this(js.undefined, settings)
}
