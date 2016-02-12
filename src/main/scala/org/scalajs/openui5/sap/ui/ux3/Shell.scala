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
                     destroyOldContent: Boolean = false): js.Array[Control] =
    js.native
}
