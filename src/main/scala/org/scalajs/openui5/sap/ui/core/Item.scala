package org.scalajs.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}

@ScalaJSDefined
trait ItemSettings extends ElementSettings
object ItemSettings extends ItemSettingsBuilder[ItemSettings]
class ItemSettingsBuilder[T <: js.Object] extends ElementSettingsBuilder[T] {
  def text(v: String) = setting("text", v)
  def enabled(v: Boolean) = setting("enabled", v)
  def textDirection(v: TextDirection) = setting("textDirection", v)
  def key(v: String) = setting("key", v)
}

@JSName("sap.ui.core.Item")
@js.native
class Item(id: js.UndefOr[String] = js.native,
           settings: js.UndefOr[ItemSettings] = js.native) extends Element {
  def this(id: String) = this(id, js.undefined)
  def this(settings: ItemSettings) = this(js.undefined, settings)

  def getKey(): String = js.native
  def getText(): String = js.native

}
