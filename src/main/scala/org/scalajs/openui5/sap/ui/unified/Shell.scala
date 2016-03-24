package org.scalajs.openui5.sap.ui.unified

import org.scalajs.openui5.sap.ui.core.{Control, URI}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait ShellSettings extends ShellLayoutSettings
object ShellSettings extends ShellSettingsBuilder(noSettings)

class ShellSettingsBuilder(val dict: SettingsMap)
  extends Settings[ShellSettings, ShellSettingsBuilder](new ShellSettingsBuilder(_))
    with ShellSetters[ShellSettings, ShellSettingsBuilder]

trait ShellSetters[T <: js.Object, B <: Settings[T, _]] extends ShellLayoutSetters[T, B] {
  def icon(v: URI) = setting("icon", v)
  def showCurtain(v: Boolean) = setting("showCurtain", v)
  def showCurtainPane(v: Boolean) = setting("showCurtainPane", v)
  def searchVisible(v: Boolean) = setting("searchVisible", v)

  @deprecated(message = "Curtain is deprecated and replaced by ShellOverlay " +
    "mechanism", since = "1.16.3")
  def curtainContent(v: js.Array[Control]) = setting("curtainContent", v)
  @deprecated(message = "Curtain is deprecated and replaced by ShellOverlay " +
    "mechanism", since = "1.16.3")
  def curtainPaneContent(v: js.Array[Control]) = setting("curtainPaneContent", v)
  def headItems(v: js.Array[ShellHeadItem]) = setting("headItems", v)
  def headEndItems(v: js.Array[ShellHeadItem]) = setting("headEndItems", v)
  def search(v: Control) = setting("search", v)
  def user(v: ShellHeadUserItem) = setting("user", v)
}

@JSName("sap.ui.unified.Shell")
@js.native
class Shell(id: js.UndefOr[String] = js.native,
            settings: js.UndefOr[ShellSettings] = js.native)
  extends ShellLayout {

  def this(id: String) = this(id, js.undefined)
  def this(settings: ShellSettings) = this(js.undefined, settings)
}
