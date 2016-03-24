package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.{Control, ControlSetters, ControlSettings}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait PageSettings extends ControlSettings
object PageSettings extends PageSettingsBuilder(noSettings)

class PageSettingsBuilder(val dict: SettingsMap)
  extends Settings[PageSettings, PageSettingsBuilder](new PageSettingsBuilder(_))
    with PageSetters[PageSettings, PageSettingsBuilder]

trait PageSetters[T <: js.Object, B <: Settings[T, _]] extends ControlSetters[T, B] {
  def title(v: String) = setting("title", v)
  // TODO: Add more.
}

@JSName("sap.m.Page")
@js.native
class Page(id: js.UndefOr[String] = js.native,
           settings: js.UndefOr[PageSettings] = js.native) extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: PageSettings) = this(js.undefined, settings)

  def destroyContent(): this.type = js.native
  def addContent(content: Control): this.type = js.native
}
