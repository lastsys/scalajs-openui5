package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.{Control, ControlSetters, ControlSettings}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait MessagePopoverSettings extends ControlSettings
object MessagePopoverSettings extends MessagePopoverSettingsBuilder(noSettings)

class MessagePopoverSettingsBuilder(val dict: SettingsMap)
  extends Settings[MessagePopoverSettings, MessagePopoverSettingsBuilder](new MessagePopoverSettingsBuilder(_))
    with MessagePopoverSetters[MessagePopoverSettings, MessagePopoverSettingsBuilder]

trait MessagePopoverSetters[T <: js.Object, B <: Settings[T, _]]
  extends ControlSetters[T, B] {

  def asyncDescriptionHandler(v: js.Any) = setting("asyncDescriptionHandler", v)
  def asyncURLHandler(v: js.Any) = setting("asyncURLHandler", v)
  def placement(v: VerticalPlacementType) = setting("placement", v)
  def initiallyExpanded(v: Boolean) = setting("initiallyExpanded", v)

  def items(v: js.Array[MessagePopoverItem]) = setting("items", v)

  def afterOpen(v: js.Function) = setting("afterOpen", v)
  def afterClose(v: js.Function) = setting("afterClose", v)
  def beforeOpen(v: js.Function) = setting("beforeOpen", v)
  def beforeClose(v: js.Function) = setting("beforeClose", v)
  def itemSelect(v: js.Function) = setting("itemSelect", v)
  def listSelect(v: js.Function) = setting("listSelect", v)
  def longtextLoaded(v: js.Function) = setting("longtextLoaded", v)
  def urlValidated(v: js.Function) = setting("urlValidated", v)
}

@JSName("sap.m.MessagePopover")
@js.native
class MessagePopover(id: js.UndefOr[String] = js.native,
                        settings: js.UndefOr[MessagePopoverSettings] = js.native)
  extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: MessagePopoverSettings) = this(js.undefined, settings)

  def addItem(item: MessagePopoverItem): this.type = js.native
  def close(): this.type = js.native
  def destroyItems(): this.type = js.native
  def isOpen(): Boolean = js.native
  def openBy(control: Control): this.type = js.native
}
