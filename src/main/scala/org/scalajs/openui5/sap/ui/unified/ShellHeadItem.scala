package org.scalajs.openui5.sap.ui.unified

import org.scalajs.openui5.sap.ui.core.{Element, ElementSetters, ElementSettings, URI}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait ShellHeadItemSettings extends ElementSettings
object ShellHeadItemSettings extends ShellHeadItemSettingsBuilder(noSettings)

class ShellHeadItemSettingsBuilder(val dict: SettingsMap)
  extends Settings[ShellHeadItemSettings, ShellHeadItemSettingsBuilder](new ShellHeadItemSettingsBuilder(_))
    with ShellHeadItemSetters[ShellHeadItemSettings, ShellHeadItemSettingsBuilder]

trait ShellHeadItemSetters[T <: js.Object, B <: Settings[T, _]]
  extends ElementSetters[T, B] {

  def startsSection(v: Boolean) = setting("startsSection", v)
  def showSeparator(v: Boolean) = setting("showSeparator", v)
  def selected(v: Boolean) = setting("selected", v)
  def toggleEnabled(v: Boolean) = setting("toggleEnabled", v)
  def showMarker(v: Boolean) = setting("showMarker", v)
  def icon(v: URI) = setting("icon", v)
  def visible(v: Boolean) = setting("visible", v)

  def press(v: js.Function) = setting("press", v)
}

/** Header Action item of the Shell.
  *
  * @since 1.15.1
  * @param id
  * @param settings
  */
@JSName("sap.ui.unified.ShellHeadItem")
@js.native
class ShellHeadItem(id: js.UndefOr[String] = js.native,
                    settings: js.UndefOr[ShellHeadItemSettings] = js.native)
  extends Element {

  def this(id: String) = this(id, js.undefined)
  def this(settings: ShellHeadItemSettings) = this(js.undefined, settings)

  def attachPress(function: js.Function): this.type = js.native
  def setVisible(visible: Boolean): this.type = js.native
}
