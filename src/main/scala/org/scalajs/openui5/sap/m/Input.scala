package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.{CSSSize, Item}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait InputSettings extends InputBaseSettings
object InputSettings extends InputSettingsBuilder(noSettings)

class InputSettingsBuilder(val dict: SettingsMap)
  extends Settings[InputSettings, InputSettingsBuilder](new InputSettingsBuilder(_))
    with InputSetters[InputSettings, InputSettingsBuilder]

trait InputSetters[T <: js.Object, B <: Settings[T,_]]
  extends InputBaseSetters[T, B] {

  def `type`(v: InputType) = setting("type", v)
  def maxLength(v: Int) = setting("maxLength", v)
  def dateFormat(v: String) = setting("dateFormat", v)
  def showValueHelp(v: Boolean) = setting("showValueHelp", v)
  def showSuggestion(v: Boolean) = setting("showSuggestion", v)
  def valueHelpOnly(v: Boolean) = setting("valueHelpOnly", v)
  def filterSuggest(v: Boolean) = setting("filterSuggest", v)
  def maxSuggestionWidth(v: CSSSize) = setting("maxSuggestionWidth", v)
  def startSuggestion(v: Int) = setting("startSuggestion", v)
  def showTableSuggestionValueHelp(v: Boolean) = setting("showTableSuggestionValueHelp", v)
  def description(v: String) = setting("description", v)
  def fieldWidth(v: CSSSize) = setting("fieldWidth", v)
  def valueLiveUpdate(v: Boolean) = setting("valueLiveUpdate", v)

  def suggestionItems(v: js.Array[Item]) = setting("suggestionItems", v)
  def suggestionColumns(v: js.Array[Column]) = setting("suggestionColumns", v)
  def suggestionRows(v: js.Array[ColumnListItem]) = setting("suggestionRows", v)

  def liveChange(v: js.Function) = setting("liveChange", v)
  def valueHelpRequest(v: js.Function) = setting("valueHelpRequest", v)
  def suggest(v: js.Function) = setting("suggest", v)
  def suggestionItemSelected(v: js.Function) = setting("suggestionItemSelected", v)
  def submit(v: js.Function) = setting("submit", v)
}

@JSName("sap.m.Input")
@js.native
class Input(id: js.UndefOr[String] = js.native,
            settings: js.UndefOr[InputSettings] = js.native) extends InputBase {

  def this(id: String) = this(id, js.undefined)
  def this(settings: InputSettings) = this(js.undefined, settings)

  def setEnabled(enabled: Boolean): this.type = js.native
}
