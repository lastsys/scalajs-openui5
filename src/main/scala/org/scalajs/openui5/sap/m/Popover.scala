package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.{CSSSize, Control, ControlSetters, ControlSettings}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait PopoverSettings extends ControlSettings
object PopoverSettings extends PopoverSettingsBuilder(noSettings)

class PopoverSettingsBuilder(val dict: SettingsMap)
  extends Settings[PopoverSettings, PopoverSettingsBuilder](new PopoverSettingsBuilder(_))
    with PopoverSetters[PopoverSettings, PopoverSettingsBuilder]

trait PopoverSetters[T <: js.Object, B <: Settings[T, _]] extends ControlSetters[T, B] {
  def placement(v: PlacementType) = setting("placement", v)
  def showHeader(v: Boolean) = setting("showHeader", v)
  def title(v: String) = setting("title", v)
  def modal(v: Boolean) = setting("modal", v)
  def offsetX(v: Int) = setting("offsetX", v)
  def offsetY(v: Int) = setting("offsetY", v)
  def showArrow(v: Boolean) = setting("showArrow", v)
  def contentWidth(v: CSSSize) = setting("contentWidth", v)
  def contentMinWidth(v: CSSSize) = setting("contentMinWidth", v)
  def contentHeight(v: CSSSize) = setting("contentHeight", v)
  def enableScrolling(v: Boolean) = setting("enableScrolling", v)
  def verticalScrolling(v: Boolean) = setting("verticalScrolling", v)
  def horizontalScrolling(v: Boolean) = setting("horizontalScrolling", v)
  def bounce(v: Boolean) = setting("bounce", v)

  def content(v: js.Array[Control]) = setting("content", v)
  def customHeader(v: Control) = setting("customHeader", v)
  def subHeader(v: Control) = setting("subHeader", v)
  def footer(v: Control) = setting("footer", v)
  def beginButton(v: Control) = setting("beginButton", v)
  def endButton(v: Control) = setting("endButton", v)

  def afterOpen(v: js.Function) = setting("afterOpen", v)
  def afterClose(v: js.Function) = setting("afterClose", v)
  def beforeOpen(v: js.Function) = setting("beforeOpen", v)
  def beforeClose(v: js.Function) = setting("beforeClose", v)
}

/** Common Control control that opens a menu when clicked by the user. The
  * control provides an API for configuring the docking position of the menu.
  */
@JSName("sap.m.Popover")
@js.native
class Popover(id: js.UndefOr[String] = js.native,
              settings: js.UndefOr[PopoverSettings] = js.native) extends Control {
  def this(id: String) = this(id, js.undefined)
  def this(settings: PopoverSettings) = this(js.undefined, settings)

  def openBy(control: Control,
             skipInstanceManager: js.UndefOr[Boolean] = js.native): this.type = js.native

  def setFooter(footer: Control): this.type = js.native
}
