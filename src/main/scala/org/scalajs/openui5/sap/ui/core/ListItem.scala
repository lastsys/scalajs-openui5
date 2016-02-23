package org.scalajs.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}

@ScalaJSDefined
trait ListItemSettings extends ItemSettings
object ListItemSettings extends ListItemSettingsBuilder[ListItemSettings]
class ListItemSettingsBuilder[T <: js.Object] extends ItemSettingsBuilder[T] {
  def icon(v: String) = setting("icon", v)
  def additionalText(v: String) = setting("additionalText", v)
}

@JSName("sap.ui.core.ListItem")
@js.native
class ListItem(id: js.UndefOr[String] = js.native,
               settings: js.UndefOr[ListItemSettings] = js.native)
  extends Item {

  def this(id: String) = this(id, js.undefined)
  def this(settings: ListItemSettings) = this(js.undefined, settings)
}
