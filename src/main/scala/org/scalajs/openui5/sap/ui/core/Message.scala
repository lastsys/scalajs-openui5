package org.scalajs.openui5.sap.ui.core

import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait MessageSettings extends ElementSettings
object MessageSettings extends MessageSettingsBuilder(noSettings)

class MessageSettingsBuilder(val dict: SettingsMap)
  extends Settings[MessageSettings, MessageSettingsBuilder](new MessageSettingsBuilder(_))
    with MessageSetters[MessageSettings, MessageSettingsBuilder]

trait MessageSetters[T <: js.Object, B <: Settings[T, _]]
  extends ElementSetters[T, B] {

  def text(v: String) = setting("text", v)
  def timestamp(v: String) = setting("timestamp", v)
  def icon(v: URI) = setting("icon", v)
  def level(v: MessageType) = setting("level", v)
  def readOnly(v: Boolean) = setting("readOnly", v)
}

@JSName("sap.ui.core.Message")
@js.native
class Message(id: js.UndefOr[String] = js.native,
              settings: js.UndefOr[js.Any] = js.native) extends Element {
  def this(id: String) = this(id, js.undefined)
  def this(settings: js.Any) = this(js.undefined, settings)

  def compareByType(other: Message): Int = js.native
  def getDefaultIcon(size: String): URI = js.native
  def getIcon(): URI = js.native
  def getLevel(): MessageType = js.native
  def getReadOnly(): Boolean = js.native
  def getText(): String = js.native
  def getTimestamp(): String = js.native
  def setIcon(icon: URI): this.type = js.native
  def setLevel(level: MessageType): this.type = js.native
  def setReadOnly(readOnly: Boolean): this.type = js.native
  def setText(text: String): this.type = js.native
  def setTimestamp(timestamp: String): this.type = js.native
}
