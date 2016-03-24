package org.scalajs.openui5.sap.ui.unified

import org.scalajs.openui5.sap.ui.core.{Control, ControlSetters, ControlSettings}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait ShellLayoutSettings extends ControlSettings
object ShellLayoutSettings extends ShellLayoutSettingsBuilder(noSettings)

class ShellLayoutSettingsBuilder(val dict: SettingsMap)
  extends Settings[ShellLayoutSettings, ShellLayoutSettingsBuilder](new ShellLayoutSettingsBuilder(_))
    with ShellLayoutSetters[ShellLayoutSettings, ShellLayoutSettingsBuilder]

trait ShellLayoutSetters[T <: js.Object, B <: Settings[T, _]] extends ControlSetters[T, B] {
  def showPane(v: Boolean) = setting("showPane", v)
  def headerHiding(v: Boolean) = setting("headerHiding", v)
  def headerVisible(v: Boolean) = setting("headerVisible", v)

  def content(v: js.Array[Control]) = setting("content", v)
  def paneContent(v: js.Array[Control]) = setting("paneContent", v)
  def header(v: Control) = setting("header", v)
}

@JSName("sap.ui.unified.ShellLayout")
@js.native
class ShellLayout(id: js.UndefOr[String] = js.native,
                  settings: js.UndefOr[ShellLayoutSettings] = js.native)
  extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: ShellLayoutSettings) = this(js.undefined, settings)

  def addContent(content: Control): this.type = js.native
  def addPaneContent(content: Control): this.type = js.native

  def destroyContent(): this.type = js.native
  def destroyPaneContent(): this.type = js.native

  def getShowPane(): Boolean = js.native
  def setShowPane(showPane: Boolean): this.type = js.native
}
