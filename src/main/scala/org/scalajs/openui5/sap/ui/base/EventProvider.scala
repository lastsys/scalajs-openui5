package org.scalajs.openui5.sap.ui.base

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

/** Provides eventing capabilities for objects like attaching or detaching
  * event handlers for events which are notified when events are fired.
  */
@JSName("sap.ui.base.EventProvider")
@js.native
class EventProvider extends Object {
  /** Attaches an event handler to the event with the given identifier.
    *
    * @param eventId The identifier of the event to listen for
    * @param data An object that will be pass to the handler along with the
    *             event object when the event is fired
    * @param function The handler function to call when the event occurs. This
    *                 function will be called in the context of the oListener
    *                 instance (if present) or on the event provider instance.
    *                 The event object (sap.ui.base.Event) is provided as first
    *                 argument of the handler. Handlers must not change the
    *                 content of the event. The second argument is the specified
    *                 oData instance (if present).
    * @param listener The handler function to call when the event occurs. This
    *                 function will be called in the context of the oListener
    *                 instance (if present) or on the event provider instance.
    *                 The event object (sap.ui.base.Event) is provided as first
    *                 argument of the handler. Handlers must not change the
    *                 content of the event. The second argument is the specified
    *                 oData instance (if present).
    * @return Returns this to allow method chaining
    */
  def attachEvent(eventId: String,
                  data: js.UndefOr[js.Dynamic] = js.undefined,
                  function: js.Function,
                  listener: js.UndefOr[js.Dynamic] = js.undefined): this.type = js.native

  /** Fires an event with the given settings and notifies all attached event handlers.
    *
    * @param eventId The identifier of the event to fire
    * @param parameters The parameters which should be carried by the event
    * @param allowPreventDefault Defines whether function preventDefault is
    *                            supported on the fired event
    * @param enableEventBubbling Defines whether event bubbling is enabled on
    *                            the fired event. Set to true the event is also
    *                            forwarded to the parent(s) of the event
    *                            provider (#getEventingParent) until the
    *                            bubbling of the event is stopped or no parent
    *                            is available anymore.
    * @return Returns this to allow method chaining. When preventDefault is
    *         supported on the fired event the function returns true if the
    *         default action should be executed, false otherwise.
    */
  def fireEvent(eventId: String,
                parameters: js.UndefOr[js.Dynamic] = js.undefined,
                allowPreventDefault: js.UndefOr[Boolean] = js.undefined,
                enableEventBubbling: js.UndefOr[Boolean] = js.undefined): this.type | Boolean = js.native
}
