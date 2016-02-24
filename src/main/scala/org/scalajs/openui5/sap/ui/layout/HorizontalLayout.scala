package org.scalajs.openui5.sap.ui.layout

import org.scalajs.openui5.sap.ui.core.{ControlSetters, ControlSettings, Control}
import org.scalajs.openui5.util.{SettingsMap, Settings, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}

@ScalaJSDefined
trait HorizontalLayoutSettings extends ControlSettings
object HorizontalLayoutSettings extends HorizontalLayoutSettingsBuilder(noSettings)

class HorizontalLayoutSettingsBuilder(val dict: SettingsMap)
  extends Settings[HorizontalLayoutSettings, HorizontalLayoutSettingsBuilder](new HorizontalLayoutSettingsBuilder(_))
    with HorizontalLayoutSetters[HorizontalLayoutSettings, HorizontalLayoutSettingsBuilder]

trait HorizontalLayoutSetters[T <: js.Object, B <: Settings[T,_]] extends ControlSetters[T, B] {
  def allowWrapping(v: Boolean) = setting("allowWrapping", v)

  def content(v: js.Array[Control]) = setting("content", v)
}

@JSName("sap.ui.layout.HorizontalLayout")
@js.native
class HorizontalLayout(id: js.UndefOr[String] = js.native,
                       settings: js.UndefOr[HorizontalLayoutSettings])
  extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: HorizontalLayoutSettings) = this(js.undefined, settings)
}
