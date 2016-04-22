package org.scalajs.openui5.sap.ui.unified

import org.scalajs.openui5.sap.ui.core.{Element, ElementSetters, ElementSettings, URI}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait ShellHeadUserItemSettings extends ElementSettings
object ShellHeadUserItemSettings extends ShellHeadUserItemSettingsBuilder(noSettings)

class ShellHeadUserItemSettingsBuilder(val dict: SettingsMap)
  extends Settings[ShellHeadUserItemSettings, ShellHeadUserItemSettingsBuilder](new ShellHeadUserItemSettingsBuilder(_))
    with ShellHeadUserItemSetters[ShellHeadUserItemSettings, ShellHeadUserItemSettingsBuilder]

trait ShellHeadUserItemSetters[T <: js.Object, B <: Settings[T, _]]
  extends ElementSetters[T, B] {

  def username(v: String) = setting("username", v)
  def showPopupIndicator(v: Boolean) = setting("showPopupIndicator", v)
  def image(v: URI) = setting("image", v)

  def press(v: js.Function) = setting("press", v)
}

@JSName("sap.ui.unified.ShellHeadUserItem")
@js.native
class ShellHeadUserItem(id: js.UndefOr[String] = js.native,
                        settings: js.UndefOr[ShellHeadUserItemSettings] = js.native)
  extends Element {

  def this(id: String) = this(id, js.undefined)
  def this(settings: ShellHeadUserItemSettings) = this(js.undefined, settings)

  def setUsername(username: String): this.type = js.native
}
