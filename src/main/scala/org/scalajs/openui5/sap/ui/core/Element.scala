package org.scalajs.openui5.sap.ui.core

import org.scalajs.openui5.sap.ui.base.{ManagedObject, ManagedObjectSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}
import scala.scalajs.js.|


@ScalaJSDefined
class ElementSettings extends ManagedObjectSettings {
  var tooltip: js.UndefOr[TooltipBase] = js.undefined
  var customData: js.UndefOr[js.Array[CustomData]] = js.undefined
  var layoutData: js.UndefOr[LayoutData] = js.undefined
  var dependents: js.UndefOr[js.Array[Control]] = js.undefined
}

/** Base Class for Elements. */
@JSName("sap.ui.core.Element")
@js.native
class Element(id: String = js.native,
              settings: js.Dynamic = js.native) extends ManagedObject {
  /** Sets a new tooltip for this object.
    *
    * The tooltip can either be a simple string (which in most cases will be
    * rendered as the title attribute of this Element) or an instance of
    * [[TooltipBase]].
    *
    * If a new tooltip is set, any previously set tooltip is deactivated.
    *
    * @param tooltip tooltip to set
    */
  def setTooltip(tooltip: String | TooltipBase): Unit = js.native
}
