package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.base.Event
import org.scalajs.openui5.sap.ui.core._
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait DialogSettings extends ControlSettings
object DialogSettings extends DialogSettingsBuilder(noSettings)

class DialogSettingsBuilder(val dict: SettingsMap)
  extends Settings[DialogSettings, DialogSettingsBuilder](new DialogSettingsBuilder(_))
    with DialogSetters[DialogSettings, DialogSettingsBuilder]

trait DialogSetters[T <: js.Object, B <: Settings[T, _]] extends ControlSetters[T, B] {
  def icon(v: URI) = setting("icon", v)
  def title(v: String) = setting("title", v)
  def showHeader(v: String) = setting("showHeader", v)
  def `type`(v: DialogType) = setting("type", v)
  def state(v: ValueState) = setting("state", v)
  def stretch(v: Boolean) = setting("stretch", v)
  def contentWidth(v: CSSSize) = setting("contentWidth", v)
  def contentHeight(v: CSSSize) = setting("contentHeight", v)
  def horizontalScrolling(v: Boolean) = setting("horizontalScrolling", v)
  def verticalScrolling(v: Boolean) = setting("verticalScrolling", v)
  def resizable(v: Boolean) = setting("resizable", v)
  def draggable(v: Boolean) = setting("draggable", v)

  def content(v: js.Array[_ <: Control]) = setting("content", v)
  def subHeader(v: IBar) = setting("subHeader", v)
  def customHeader(v: IBar) = setting("customHeader", v)
  def beginButton(v: Button) = setting("beginButton", v)
  def endButton(v: Button) = setting("endButton", v)
  def buttons(v: js.Array[_ <: Button]) = setting("buttons", v)

  def beforeOpen(v: js.Function) = setting("beforeOpen", v)
  def afterOpen(v: js.Function) = setting("afterOpen", v)
  def beforeClose(v: js.Function) = setting("beforeClose", v)
  def afterClose(v: js.Function) = setting("afterClose", v)
}


@JSName("sap.m.Dialog")
@js.native
class Dialog(id: js.UndefOr[String] = js.native,
             settings: js.UndefOr[DialogSettings] = js.native) extends Control with PopupInterface {

  def this(id: String) = this(id, js.undefined)
  def this(settings: DialogSettings) = this(js.undefined, settings)

  def close(): Unit = js.native
  def open(): Unit = js.native

  def getButtons(): js.Array[Button] = js.native
  def getBeginButton(): Button = js.native
  def getEndButton(): Button = js.native
  def setBeginButton(): this.type = js.native
  def setEndButton(): this.type = js.native

  def addContent(content: Control): this.type = js.native

  def setTitle(title: String): this.type = js.native
}
