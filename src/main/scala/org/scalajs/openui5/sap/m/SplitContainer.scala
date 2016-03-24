package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.{Control, ControlSetters, ControlSettings, URI}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait SplitContainerSettings extends ControlSettings
object SplitContainerSettings extends SplitContainerSettingsBuilder(noSettings)

class SplitContainerSettingsBuilder(val dict: SettingsMap)
  extends Settings[SplitContainerSettings, SplitContainerSettingsBuilder](new SplitContainerSettingsBuilder(_))
    with SplitContainerSetters[SplitContainerSettings, SplitContainerSettingsBuilder]

trait SplitContainerSetters[T <: js.Object, B <: Settings[T, _]] extends ControlSetters[T, B] {
  def defaultTransitionNameDetail(v: String) = setting("defaultTransitionNameDetail", v)
  def defaultTransitionNameMaster(v: String) = setting("defaultTransitionNameMaster", v)
  def mode(v: SplitAppMode) = setting("mode", v)
  def masterButtonText(v: String) = setting("masterButtonText", v)
  def backgroundColor(v: String) = setting("backgroundColor", v)
  def backgroundImage(v: URI) = setting("backgroundImage", v)
  def backgroundRepeat(v: Boolean) = setting("backgroundRepeat", v)
  def backgroundOpacity(v: Float) = setting("backgroundOpacity", v)

  def masterPages(v: js.Array[Control]) = setting("masterPages", v)
  def detailPages(v: js.Array[Control]) = setting("detailPages", v)

  def masterNavigate(v: js.Function) = setting("masterNavigate", v)
  def afterMasterNavigate(v: js.Function) = setting("afterMasterNavigate", v)
  def masterButton(v: js.Function) = setting("masterButton", v)
  def beforeMasterButton(v: js.Function) = setting("beforeMasterButton", v)
  def afterMasterOpen(v: js.Function) = setting("afterMasterOpen", v)
  def beforeMasterClose(v: js.Function) = setting("beforeMasterClose", v)
  def afterMasterClose(v: js.Function) = setting("afterMasterClose", v)
  def detailNavigate(v: js.Function) = setting("detailNavigate", v)
  def afterDetailNavigate(v: js.Function) = setting("afterDetailNavigate", v)
}

@JSName("sap.m.SplitContainer")
@js.native
class SplitContainer(id: js.UndefOr[String] = js.native,
                     settings: js.UndefOr[SplitContainerSettings] = js.native)
  extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: SplitContainerSettings) = this(js.undefined, settings)

  def addDetailPage(detailPage: Control): this.type = js.native
  def destroyDetailPages(): this.type = js.native
  def setInitialDetail(initialDetail: Control): this.type = js.native

  def to(pageId: String): this.type = js.native
  def to(page: Control): this.type = js.native
  def toDetail(pageId: String): this.type = js.native

  def getMode(): SplitAppMode = js.native
  def hideMaster(): this.type = js.native
  def showMaster(): this.type = js.native
  def isMasterShown(): Boolean = js.native
}
