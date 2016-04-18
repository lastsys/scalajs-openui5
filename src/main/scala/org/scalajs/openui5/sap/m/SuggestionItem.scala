package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.{CSSSize, Control, ControlSetters, ControlSettings}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait SuggestionItemSettings extends ControlSettings
object SuggestionItemSettings extends SuggestionItemSettingsBuilder(noSettings)

class SuggestionItemSettingsBuilder(val dict: SettingsMap)
  extends Settings[SuggestionItemSettings, SuggestionItemSettingsBuilder](new SuggestionItemSettingsBuilder(_))
    with SuggestionItemSetters[SuggestionItemSettings, SuggestionItemSettingsBuilder]

trait SuggestionItemSetters[T <: js.Object, B <: Settings[T,_]]
  extends ControlSetters[T, B] {

  def icon(v: String) = setting("icon", v)
  def description(v: String) = setting("description", v)
}

@JSName("sap.m.SuggestionItem")
@js.native
class SuggestionItem(id: js.UndefOr[String] = js.native,
               settings: js.UndefOr[SuggestionItemSettings] = js.native)
  extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: SuggestionItemSettings) = this(js.undefined, settings)
}
