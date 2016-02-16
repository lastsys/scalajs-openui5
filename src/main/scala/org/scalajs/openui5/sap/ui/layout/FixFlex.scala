package org.scalajs.openui5.sap.ui.layout

import org.scalajs.openui5.sap.ui.core.Control

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/** The FixFlex control builds the container for a layout with a fixed and a
  * flexible part. The flexible container adapts its size to the fix
  * container. The fix container can hold any number of controls, while the
  * flexible container can hold only one.
  *
  * In order for the FixFlex to stretch properly, the parent element, in which
  * the control is placed, needs to have a specified height or needs to have an
  * absolute position.
  *
  * Warning: Avoid nesting FixFlex in other flexbox based layout controls
  * (FixFlex, FlexBox, Hbox, Vbox). Otherwise contents may be not accessible or
  * multiple scrollbars can appear.
  *
  * Note: If the child control of the flex or the fix container has
  * width/height bigger than the container itself, the child control will be
  * cropped in the view. If minFlexSize is set, then a scrollbar is shown in
  * the flexible part, depending on the vertical property.
  *
  * @since 1.25.0
  *
  * @param id id for the new control, generated automatically if no id is given
  * @param settings initial settings for the new control
  */
@JSName("sap.ui.layout.FixFlex")
@js.native
class FixFlex(id: js.UndefOr[String] = js.native,
              settings: js.UndefOr[js.Any] = js.native) extends Control {
  def this(id: String) = this(id, js.undefined)
  def this(settings: js.Any) = this(js.undefined, settings)
}
