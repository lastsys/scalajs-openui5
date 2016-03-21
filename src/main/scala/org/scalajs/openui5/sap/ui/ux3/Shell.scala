package org.scalajs.openui5.sap.ui.ux3

import org.scalajs.openui5.sap.ui.core.Control

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/** The Ux3 GoldReflection Shell, which is an application frame with
  * navigation capabilities. It is supposed to be added to a direct child of
  * the BODY tag of a page and there should be no other parts of the page
  * consuming space outside the Shell.
  *
  * @param id
  * @param settings
  */
@JSName("sap.ui.ux3.Shell")
@js.native
class Shell(id: js.UndefOr[String] = js.native,
            settings: js.UndefOr[js.Any] = js.native) extends Control {
  def this(id: String) = this(id, js.undefined)
  def this(settings: js.Any) = this(js.undefined, settings)

  /** Replaces the existing side pane content with the given Control(-Tree).
    * This method is optimized to only re-render the pane content (and not the
    * shell) which is faster and smoother than any other way of changing the
    * "paneContent" aggregation.
    *
    * By default, the old pane content is not destroyed and is returned by
    * this method in an array for further usage. To avoid memory leaks, the
    * old content should be destroyed (if not needed later), by setting the
    * "destroyOldContent" flag or by destroying it manually later on. If
    * "destroyOldContent" is set, an empty array is returned.
    *
    * @param content The new Pane content. In this method it must be exactly
    *                one control (-tree). This could likely be a layout or a
    *                specific ux3 Pane control. Use addPaneContent() to add
    *                more control (-trees) to the Pane.
    * @param destroyOldContent If set, the controls previously contained in
    *                          the pane will be destroyed, to avoid memory
    *                          leaks.
    * @return
    */
  def setPaneContent(content: Control,
                     destroyOldContent: Boolean = false): js.Array[Control] = js.native

  /** Gets content of aggregation notificationBar.
    *
    * The [[NotificationBar]] which should be integrated into the [[Shell]].
    *
    * @since 1.7.0
    * @return notification bar
    */
  def getNotificationBar(): NotificationBar = js.native

  /** Sets a new value for property showPane.
    *
    * Whether the pane bar should be displayed at all or not.
    *
    * When called with a value of null or undefined, the default value of the
    * property will be restored.
    *
    * Default value is true.
    *
    * @param showPane New value for property showPane
    * @return Reference to this in order to allow method chaining
    */
  def setShowPaneBar(showPane: Boolean): this.type = js.native

  /** Opens the side Pane.
    *
    * A valid ID of a paneBarItem must be given, so this item can be marked
    * as selected. A "paneBarItemSelected" event is then fired as if the
    * opening was triggered by the user by a click on the respective
    * PaneBarItem. This method can be called (with different IDs) even when
    * the Pane is already open. It has then the same effect as if the user
    * switches between PaneBarItems.
    *
    * Returns 'this' to allow method chaining.
    *
    * @param paneBarItemId The ID of the PaneBarItem which shoule be marked
    *                      as selected.
    * @return Referenced to this in order to allow method chaining
    */
  def openPane(paneBarItemId: String): this.type = js.native

  /** Sets a new value for property appTitle.
    *
    * The application title to appear in the left part of the header, usually
    * a company and/or product name. appIcon and appTitle are both optional
    * and can both be set; in this case the icon appears first.
    *
    * When called with a value of null or undefined, the default value of the
    * property will be restored.
    *
    * @param appTitle New value for property appTitle
    * @return Reference to this in order to allow method chaining
    */
  def setAppTitle(appTitle: String): this.type = js.native
}
