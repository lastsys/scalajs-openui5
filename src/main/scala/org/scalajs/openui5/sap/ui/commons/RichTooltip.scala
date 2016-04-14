package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap.ui.core.{TooltipBase, TooltipBaseSetters, TooltipBaseSettings, URI}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait RichTooltipSettings extends TooltipBaseSettings

object RichTooltipSettings extends RichTooltipSettingsBuilder(noSettings)

class RichTooltipSettingsBuilder(val dict: SettingsMap)
  extends Settings[RichTooltipSettings, RichTooltipSettingsBuilder](new RichTooltipSettingsBuilder(_))
    with RichTooltipSetters[RichTooltipSettings, RichTooltipSettingsBuilder]

trait RichTooltipSetters[T <: js.Object, B <: Settings[T, _]]
  extends TooltipBaseSetters[T, B] {

  def title(v: String) = setting("title", v)

  def imageSrc(v: URI) = setting("imageSrc", v)

  def valueStateText(v: String) = setting("valueStateText", v)

  def imageAltText(v: String) = setting("imageAltText", v)
}

@JSName("sap.ui.commons.RichTooltip")
@js.native
class RichTooltip(id: js.UndefOr[String] = js.native,
                  settings: js.UndefOr[RichTooltipSettings])
  extends TooltipBase {

  def this(id: String) = this(id, js.undefined)

  def this(settings: RichTooltipSettings) = this(js.undefined, settings)
}
