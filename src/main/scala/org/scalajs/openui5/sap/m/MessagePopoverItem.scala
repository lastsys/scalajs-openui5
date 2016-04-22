package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core._
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait MessagePopoverItemSettings extends ElementSettings
object MessagePopoverItemSettings extends MessagePopoverItemSettingsBuilder(noSettings)

class MessagePopoverItemSettingsBuilder(val dict: SettingsMap)
  extends Settings[MessagePopoverItemSettings, MessagePopoverItemSettingsBuilder](new MessagePopoverItemSettingsBuilder(_))
    with MessagePopoverItemSetters[MessagePopoverItemSettings, MessagePopoverItemSettingsBuilder]

trait MessagePopoverItemSetters[T <: js.Object, B <: Settings[T, _]]
  extends ElementSetters[T, B] {

  def `type`(v: MessageType) = setting("type", v)
  def title(v: String) = setting("title", v)
  def description(v: String) = setting("description", v)
  def markupDescription(v: Boolean) = setting("markupDescription", v)
  def longtextUrl(v: URI) = setting("longtextUrl", v)
}

@JSName("sap.ui.unified.MessagePopoverItem")
@js.native
class MessagePopoverItem(id: js.UndefOr[String] = js.native,
                     settings: js.UndefOr[MessagePopoverItemSettings] = js.native)
  extends Element {

  def this(id: String) = this(id, js.undefined)
  def this(settings: MessagePopoverItemSettings) = this(js.undefined, settings)

}
