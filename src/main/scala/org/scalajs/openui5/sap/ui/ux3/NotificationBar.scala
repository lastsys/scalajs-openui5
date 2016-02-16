package org.scalajs.openui5.sap.ui.ux3

import org.scalajs.openui5.sap.ui.core.Control

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("sap.ui.ux3.NotificationBar")
@js.native
class NotificationBar(id: js.UndefOr[String] = js.native,
                      settings: js.UndefOr[js.Any] = js.native)
  extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: js.Any) = this(js.undefined, settings)

  /** Sets a new value for property visibleStatus.
    *
    * This property displays the bar corresponding to given status
    *
    * When called with a value of null or undefined, the default value of the
    * property will be restored.
    *
    * Default value is [[NotificationBarStatus.Default]].
    *
    * @param visibleStatus new valaue for property visibleStatus
    * @return referense to this in order to allow method chaining
    */
  def setVisibleStatus(visibleStatus: NotificationBarStatus): this.type = js.native

  /** Sets the aggregated messageNotifier.
    *
    * @param messageNotifier The messageNotifier to set
    * @return reference to this in order to allow method chaining
    */
  def setMessageNotifier(messageNotifier: Notifier): this.type = js.native
}
