package org.scalajs.openui5.sap.ui.base

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/** Provides eventing capabilities for objects like attaching or detaching
  * event handlers for events which are notified when events are fired.
  */
@JSName("sap.ui.base.EventProvider")
@js.native
class EventProvider extends Object {
  def attachEvent(eventId: String,
                  data: js.UndefOr[js.Dynamic],
                  function: js.Function,
                  listener: js.UndefOr[js.Dynamic]): EventProvider = js.native
}
