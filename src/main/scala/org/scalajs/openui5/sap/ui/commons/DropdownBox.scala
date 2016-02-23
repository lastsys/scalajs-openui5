package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap.ui.core.URI
import org.scalajs.openui5.util.{SettingsMap, Settings, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait DropdownBoxSettings extends ComboBoxSettings
object DropdownBoxSettings extends DropdownBoxSettingsBuilder(noSettings)

class DropdownBoxSettingsBuilder(val dict: SettingsMap)
  extends Settings[DropdownBoxSettings, DropdownBoxSettingsBuilder](new DropdownBoxSettingsBuilder(_))
    with DropdownBoxSetters[DropdownBoxSettings, DropdownBoxSettingsBuilder]

trait DropdownBoxSetters[T <: js.Object, B <: Settings[T,_]]
  extends ComboBoxSetters[T, B] {

  def searchHelpEnabled(v: Boolean) = setting("searchHelpEnabled", v)
  def searchHelpText(v: String) = setting("searchHelpText", v)
  def searchHelpAdditionalText(v: String) = setting("searchHelpAdditionalText", v)
  def searchHelpIcon(v: URI) = setting("searchHelpIcon", v)
  def maxHistoryItems(v: Int) = setting("maxHistoryItems", v)

  def searchHelp(v: js.Function) = setting("searchHelp", v)
}


@JSName("sap.ui.commons.DropdownBox")
@js.native
class DropdownBox(id: js.UndefOr[String] = js.native,
                  settings: js.UndefOr[DropdownBoxSettings] = js.native)
  extends ComboBox {
  def this(id: String) = this(id, js.undefined)
  def this(settings: DropdownBoxSettings) = this(js.undefined, settings)
}
