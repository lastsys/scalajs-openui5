package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core._
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait BusyDialogSettings extends ControlSettings
object BusyDialogSettings extends BusyDialogSettingsBuilder(noSettings)

class BusyDialogSettingsBuilder(val dict: SettingsMap)
  extends Settings[BusyDialogSettings, BusyDialogSettingsBuilder](new BusyDialogSettingsBuilder(_))
    with BusyDialogSetters[BusyDialogSettings, BusyDialogSettingsBuilder]

trait BusyDialogSetters[T <: js.Object, B <: Settings[T, _]] extends ControlSetters[T, B] {
  def text(v: String) = setting("text", v)
  def title(v: String) = setting("title", v)
  def customIcon(v: URI) = setting("customIcon", v)
  def customIconRotationSpeed(v: Int) = setting("customIconRotationSpeed", v)
  def customIconDensityAware(v: Boolean) = setting("customIconDensityAware", v)
  def customIconWidth(v: CSSSize) = setting("customIconWidth", v)
  def customIconHeight(v: CSSSize) = setting("customIconHeight", v)
  def cancelButtonText(v: String) = setting("cancelButtonText", v)
  def showCancelButton(v: Boolean) = setting("showCancelButton", v)

  def close(v: js.Function) = setting("close", v)
}

/** Common Control control that opens a menu when clicked by the user. The
  * control provides an API for configuring the docking position of the menu.
  */
@JSName("sap.m.BusyDialog")
@js.native
class BusyDialog(id: js.UndefOr[String] = js.native,
                 settings: js.UndefOr[BusyDialogSettings] = js.native) extends Control {
  def this(id: String) = this(id, js.undefined)
  def this(settings: BusyDialogSettings) = this(js.undefined, settings)

  def open(): this.type = js.native
  def close(): this.type = js.native
}
