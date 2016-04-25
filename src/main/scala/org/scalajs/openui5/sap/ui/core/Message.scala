package org.scalajs.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

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
