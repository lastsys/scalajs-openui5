package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.{CSSSize, Control, ControlSetters, ControlSettings}
import org.scalajs.openui5.sap.ui.model.Context
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait ListBaseSettings extends ControlSettings
object ListBaseSettings extends ListBaseSettingsBuilder(noSettings)

class ListBaseSettingsBuilder(val dict: SettingsMap)
  extends Settings[ListBaseSettings, ListBaseSettingsBuilder](new ListBaseSettingsBuilder(_))
    with ListBaseSetters[ListBaseSettings, ListBaseSettingsBuilder]

trait ListBaseSetters[T <: js.Object, B <: Settings[T, _]] extends ControlSetters[T, B] {
  def inset(v: Boolean) = setting("inset", v)
  def headerText(v: String) = setting("headerText", v)
  def headerDesign(v: ListHeaderDesign) = setting("headerDesign", v)
  def footerText(v: String) = setting("footer", v)
  def mode(v: ListMode) = setting("mode", v)
  def width(v: CSSSize) = setting("width", v)
  def includeItemInSelection(v: Boolean) = setting("includeItemInSelection", v)
  def showUnread(v: Boolean) = setting("showUnread", v)
  def noDataText(v: String) = setting("noDataText", v)
  def showNoData(v: Boolean) = setting("showNoData", v)
  def enableBusyIndicator(v: Boolean) = setting("enableBusyIndicator", v)
  def modeAnimationOn(v: Boolean) = setting("modeAnimationOn", v)
  def showSeparators(v: ListSeparators) = setting("showSeparators", v)
  def swipeDirection(v: SwipeDirection) = setting("swipeDirection", v)
  def growing(v: Boolean) = setting("growing", v)
  def growingThreshold(v: Int) = setting("growingThreshold", v)
  def growingTriggerText(v: String) = setting("growingTriggerText", v)
  def growingScrollToLoad(v: Boolean) = setting("growingScrollToLoad", v)
  def rememberSelections(v: Boolean) = setting("rememberSelections", v)

  def items(v: js.Array[ListItemBase]) = setting("items", v)
  def swipeContent(v: Control) = setting("swipeContent", v)
  def headerToolbar(v: Toolbar) = setting("headerToolbar", v)
  def infoToolbar(v: Toolbar) = setting("infoToolbar", v)

  def select(v: js.Function) = setting("select", v)
  def selectionChange(v: js.Function) = setting("selectionChange", v)
  def delete(v: js.Function) = setting("delete", v)
  def swipe(v: js.Function) = setting("swipe", v)
  def growingStarted(v: js.Function) = setting("growingStarted", v)
  def growingFinished(v: js.Function) = setting("growingFinished", v)
  def updateStarted(v: js.Function) = setting("updateStarted", v)
  def updateFinished(v: js.Function) = setting("updateFinished", v)
  def itemPress(v: js.Function) = setting("itemPress", v)
}

@JSName("sap.m.ListBase")
@js.native
class ListBase(id: js.UndefOr[String] = js.native,
               settings: js.UndefOr[ListBaseSettings] = js.native)
  extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: ListBaseSettings) = this(js.undefined, settings)

  def bindItems(bindingInfo: js.Any): this.type = js.native

  def getSelectedContexts(all: Boolean): js.Array[Context] = js.native
  def getSelectedItem[T <: ListItemBase](): T = js.native
  def getSelectedItems[T <: ListItemBase](): js.Array[T] = js.native
  def removeSelections(all: Boolean): this.type = js.native
}
