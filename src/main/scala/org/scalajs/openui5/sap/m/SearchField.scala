package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.{CSSSize, Control, ControlSetters, ControlSettings}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait SearchFieldSettings extends ControlSettings
object SearchFieldSettings extends SearchFieldSettingsBuilder(noSettings)

class SearchFieldSettingsBuilder(val dict: SettingsMap)
  extends Settings[SearchFieldSettings, SearchFieldSettingsBuilder](new SearchFieldSettingsBuilder(_))
    with SearchFieldSetters[SearchFieldSettings, SearchFieldSettingsBuilder]

trait SearchFieldSetters[T <: js.Object, B <: Settings[T,_]]
  extends ControlSetters[T, B] {

  def value(v: String) = setting("value", v)
  def width(v: CSSSize) = setting("width", v)
  def enabled(v: Boolean) = setting("enabled", v)
  def maxLength(v: Int) = setting("maxLength", v)
  def placeholder(v: String) = setting("placeholder", v)
  def showMagnifier(v: Boolean) = setting("showMagnifier", v)
  def showRefreshButton(v: Boolean) = setting("showRefreshButton", v)
  def refreshButtonTooltip(v: String) = setting("refreshButtonTooltip", v)
  def showSearchButton(v: Boolean) = setting("showSearchButton", v)
  def enableSuggestions(v: Boolean) = setting("enableSuggestions", v)
  def selectOnFocus(v: Boolean) = setting("selectOnFocus", v)

  def suggestionItems(v: js.Array[SuggestionItem]) = setting("suggestionItems", v)

  def search(v: js.Function) = setting("search", v)
  def liveChange(v: js.Function) = setting("liveChange", v)
  def suggest(v: js.Function) = setting("suggest", v)
}

@JSName("sap.m.SearchField")
@js.native
class SearchField(id: js.UndefOr[String] = js.native,
               settings: js.UndefOr[SearchFieldSettings] = js.native)
  extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: SearchFieldSettings) = this(js.undefined, settings)

  def getValue(): String = js.native

  def suggest(): Unit = js.native

  def attachSuggest(function: js.Function): this.type = js.native
  def attachSearch(function: js.Function): this.type = js.native
}
