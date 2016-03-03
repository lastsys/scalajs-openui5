package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap.ui.commons.enums.{AreaDesign, BorderDesign}
import org.scalajs.openui5.sap.ui.core._
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}

@ScalaJSDefined
trait PanelSettings extends ControlSettings
object PanelSettings extends PanelSettingsBuilder(noSettings)

class PanelSettingsBuilder(val dict: SettingsMap)
  extends Settings[PanelSettings, PanelSettingsBuilder](new PanelSettingsBuilder(_))
    with PanelSetters[PanelSettings, PanelSettingsBuilder]

trait PanelSetters[T <: js.Object, B <: Settings[T,_]]
  extends ControlSetters[T, B] {

  // Properties
  def width(v: CSSSize) = setting("width", v)
  def height(v: CSSSize) = setting("height", v)
  def enabled(v: Boolean) = setting("enabled", v)
  def scrollLeft(v: Int) = setting("scrollLeft", v)
  def scrollTop(v: Int) = setting("scrollTop", v)
  def applyContentPadding(v: Boolean) = setting("applyContentPadding", v)
  def collapsed(v: Boolean) = setting("collapsed", v)
  def areaDesign(v: AreaDesign) = setting("areaDesign", v)
  def borderDesign(v: BorderDesign) = setting("borderDesign", v)
  def showCollapseIcon(v: Boolean) = setting("showCollapseIcon", v)

  // Aggregations
  def content(v: js.Array[Control]) = setting("content", v)
  def title(v: Title) = setting("title", v)
  def buttons(v: js.Array[Button]) = setting("buttons", v)
}

@JSName("sap.ui.commons.Panel")
@js.native
class Panel(id: js.UndefOr[String] = js.native,
            settings: js.UndefOr[PanelSettings] = js.native) extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: PanelSettings) = this(js.undefined, settings)

  def addContent(content: Control): this.type = js.native
  def destroyContent(): this.type = js.native
}
