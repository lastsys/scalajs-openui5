package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap.ui.core.Scrolling
import org.scalajs.openui5.util.{SettingsMap, Settings, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}

@ScalaJSDefined
trait TabSettings extends PanelSettings
object TabSettings extends TabSettingsBuilder(noSettings)

class TabSettingsBuilder(val dict: SettingsMap)
  extends Settings[TabSettings, TabSettingsBuilder](new TabSettingsBuilder(_))
    with TabSetters[TabSettings, TabSettingsBuilder]

trait TabSetters[T <: js.Object, B <: Settings[T,_]]
  extends PanelSetters[T, B] {

  def verticalScrolling(v: Scrolling) = setting("verticalScrolling", v)
  def horizontalScrolling(v: Scrolling) = setting("horizontalScrolling", v)
  def closable(v: Boolean) = setting("closable", v)
  def selected(v: Boolean) = setting("selected", v)
}

@JSName("sap.ui.commons.Tab")
@js.native
class Tab(id: js.UndefOr[String] = js.native,
          settings: js.UndefOr[TabSettings] = js.native) extends Panel {
  def this(id: String) = this(id, js.undefined)
  def this(settings: TabSettings) = this(js.undefined, settings)
}
