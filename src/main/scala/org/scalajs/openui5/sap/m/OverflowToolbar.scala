package org.scalajs.openui5.sap.m

import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait OverflowToolbarSettings extends ToolbarSettings
object OverflowToolbarSettings extends OverflowToolbarSettingsBuilder(noSettings)

class OverflowToolbarSettingsBuilder(val dict: SettingsMap)
  extends Settings[OverflowToolbarSettings, OverflowToolbarSettingsBuilder](new OverflowToolbarSettingsBuilder(_))
    with OverflowToolbarSetters[OverflowToolbarSettings, OverflowToolbarSettingsBuilder]

trait OverflowToolbarSetters[T <: js.Object, B <: Settings[T, _]] extends ToolbarSetters[T, B]

/** The OverflowToolbar control is a container based on sap.m.Toolbar, that
  * provides overflow when its content does not fit in the visible area.
  *
  * Note: It is recommended that you use OverflowToolbar over sap.m.Toolbar,
  * unless you want to avoid overflow in favor of shrinking.
  */
@JSName("sap.m.OverflowToolbar")
@js.native
class OverflowToolbar(id: js.UndefOr[String] = js.native,
              settings: js.UndefOr[OverflowToolbarSettings] = js.native) extends Toolbar {
  def this(id: String) = this(id, js.undefined)
  def this(settings: OverflowToolbarSettings) = this(js.undefined, settings)
}
