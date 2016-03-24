package org.scalajs.openui5.sap.ui.core

import org.scalajs.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

// TODO: Not sure where to put this and at the same time being able to have Popup.Dock...

/** Popup Class is a helper class for controls that want themselves or parts
  * of themselves or even other aggregated or composed controls or plain HTML
  * content to popup on the screen like menues, dialogs, drop down boxes.
  *
  * It allows the controls to be aligned to other dom elements using the
  * sap.ui.core.Popup.Dock.html method. With it you can define where the popup
  * should be docked. One can dock the popup to the top bottom left or right
  * side of a dom ref.
  *
  * In the case that the popup has no space to show itself in the view port of
  * the current window it tries to open itself to the inverted direction.
  *
  * Since 1.12.3 it is possible to add further DOM-element-ids that can get the
  * focus when 'autoclose' is enabled. E.g. the RichTextEditor with running
  * TinyMCE uses this method to be able to focus the Popups of the TinyMCE if
  * the RichTextEditor runs within a Popup/Dialog etc.
  *
  * To provide an additional DOM-element that can get the focus the following
  * should be done:
  * {{{
  * // create an object with the corresponding DOM-id
  * var oObject = { id : "this_is_the_most_valuable_id_of_the_DOM_element" };
  * // add the event prefix for adding an element to the ID of the corresponding
  * // Popup
  * var sEventId = "sap.ui.core.Popup.addFocusableContent-" + oPopup.getId();
  *
  * // fire the event with the created event-id and the object with the DOM-id
  * sap.ui.getCore().getEventBus().publish("sap.ui", sEventId, oObject);
  * }}}
  */
@JSName("sap.ui.core.Popup")
@js.native
class Popup2 extends js.Object {
}
