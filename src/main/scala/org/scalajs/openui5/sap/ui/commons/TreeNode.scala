package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap.ui.base.Event
import org.scalajs.openui5.sap.ui.core.{Element, ElementSetters, ElementSettings, URI}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait TreeNodeSettings extends ElementSettings
object TreeNodeSettings extends TreeNodeSettingsBuilder(noSettings)

class TreeNodeSettingsBuilder(val dict: SettingsMap)
  extends Settings[TreeNodeSettings, TreeNodeSettingsBuilder](new TreeNodeSettingsBuilder(_))
    with TreeNodeSetters[TreeNodeSettings, TreeNodeSettingsBuilder]

trait TreeNodeSetters[T <: js.Object, B <: Settings[T,_]]
  extends ElementSetters[T, B] {

  def text(v: String) = setting("text", v)
  def expanded(v: Boolean) = setting("expanded", v)
  def hasExpander(v: Boolean) = setting("hasExpander", v)
  def icon(v: URI) = setting("icon", v)
  def isSelected(v: Boolean) = setting("isSelected", v)
  def selectable(v: Boolean) = setting("selectable", v)

  def nodes(v: js.Array[TreeNode]) = setting("nodes", v)

  def toggleOpenState(v: js.Function) = setting("toggleOpenState", v)
  def selected(v: js.Function) = setting("selected", v)
}

@JSName("sap.ui.commons.TreeNode")
@js.native
class TreeNode(id: js.UndefOr[String] = js.native,
               settings: js.UndefOr[TreeNodeSettings] = js.native) extends Element {
  def this(id: String) = this(id, js.undefined)
  def this(settings: TreeNodeSettings) = this(js.undefined, settings)

  def getNodes(): js.Array[TreeNode] = js.native
  def getExpanded(): Boolean = js.native
  def setExpanded(expanded: Boolean): this.type = js.native

  def attachSelected(data: js.Any,
                     function: js.Function1[Event, Unit],
                     listener: js.Any): this.type = js.native
  def attachSelected(function: js.Function1[Event, Unit],
                     listener: js.Any): this.type = js.native
  def attachSelected(function: js.Function1[Event, Unit]): this.type = js.native
  def attachSelected(data: js.Any,
                     function: js.Function1[Event, Unit]): this.type = js.native
}
