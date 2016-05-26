package org.scalajs.openui5.sap.ui.layout

import org.scalajs.openui5.sap.ui.core.{CSSSize, Control, ControlSetters, ControlSettings}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait VerticalLayoutSettings extends ControlSettings
object VerticalLayoutSettings extends VerticalLayoutSettingsBuilder(noSettings)

class VerticalLayoutSettingsBuilder(val dict: SettingsMap)
  extends Settings[VerticalLayoutSettings, VerticalLayoutSettingsBuilder](new VerticalLayoutSettingsBuilder(_))
    with VerticalLayoutSetters[VerticalLayoutSettings, VerticalLayoutSettingsBuilder]

trait VerticalLayoutSetters[T <: js.Object, B <: Settings[T,_]] extends ControlSetters[T, B] {
  def width(v: CSSSize) = setting("width", v)
  def enabled(v: Boolean) = setting("enabled", v)

  def content(v: js.Array[Control]) = setting("content", v)
}

@JSName("sap.ui.layout.VerticalLayout")
@js.native
class VerticalLayout(id: js.UndefOr[String] = js.native,
                       settings: js.UndefOr[VerticalLayoutSettings])
  extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: VerticalLayoutSettings) = this(js.undefined, settings)

  def addContent(content: Control): this.type = js.native
  def destroyContent(): this.type = js.native
  def getContent(): js.Array[Control] = js.native
  def getEnabled(): Boolean = js.native
  def getWidth(): CSSSize = js.native
  def indexOfContent(content: Control): Int = js.native
  def insertContent(content: Control, index: Int): this.type = js.native
  def removeAllContent(): js.Array[Control] = js.native
  def setEnabled(enabled: Boolean): this.type = js.native
}
