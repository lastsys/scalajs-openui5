package org.scalajs.openui5.sap.ui.core

import org.scalajs.dom
import org.scalajs.openui5.sap.ui.base.Object

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|


@JSName("sap.ui.core.RenderManager")
@js.native
/** RenderManager that will take care for rendering Controls.
  *
  * The RenderManager will be available from the sap.ui.core.Core instance (available via sap.ui.getCore()).
  * It can be used to render Controls and Control-Trees.
  *
  * The convention for renderers belonging to some controls is the following:
  *
  * - for a Control e.g. sap.ui.controls.InputField there shall be
  * - a renderer named sap.ui.controls.InputFieldRenderer
  */
trait RenderManager extends Object {
  /** Adds a class to the class collection if the name is not empty or null.
    *
    * The class collection is flushed if it is written to the buffer using
    * [[writeClasses]].
    *
    * @param name name of the class to be added; null values are ignored
    * @return this render manager instance to allow chaining
    */
  def addClass(name: String): this.type = js.native

  /** Adds a style property to the style collection if the value is not empty or null.
    *
    * The style collection is flushed if it is written to the buffer using
    * [[writeStyles]].
    *
    * @param name
    * @param value
    * @return
    */
  def addStyle(name: String, value: String): this.type = js.native

  /** Cleans up the rendering state of the given control with rendering it.
    *
    * A control is responsible for the rendering of all its child controls. But
    * in some cases it makes sense that a control does not render all its
    * children based on a filter condition. For example a Carousel control only
    * renders the current visible parts (and maybe some parts before and after
    * the visible area) for performance reasons. If a child was rendered but
    * should not be rendered anymore because the filter condition does not apply
    * anymore this child must be cleaned up correctly (e.g deregistering
    * eventhandlers, ...).
    *
    * The following example shows how [[renderControl]] and
    * [[cleanupControlWithoutRendering]] should be used:
    *
    * {{{
    * render = function(rm, ctrl){
    *   //...
    *   var aAggregatedControls =
    *   //...
    *   for(var i=0; i
    * }}}
    *
    * @note The method does not remove DOM of the given control.
    *       The callee of this method has to take over the responsibility to
    *       cleanup the DOM of the control afterwards. For parents which are
    *       rendered with the normal mechanism as shown in the example above
    *       this requirement is fulfilled, because the control is not added to
    *       the rendering buffer (renderControl is not called) and the DOM is
    *       replaced when the rendering cycle is finalized.
    * @param control the control that should be cleaned up
    */
  def cleanupControlWithoutRendering(control: Control): Unit = js.native

  /** Renders the content of the rendering buffer into the provided DOMNode.
    *
    * This function must not be called within control renderers.
    *
    * ==Usage==
    * {{{
    * // Create a new instance of the RenderManager
    * var rm = sap.ui.getCore().createRenderManager();
    * // Use the writer API to fill the buffers
    * rm.write(...);
    * rm.renderControl(oControl);
    * rm.write(...);
    * ...
    * // Finally flush the buffer into the provided DOM node (The current content is removed)
    * rm.flush(oDomNode);
    * // If the instance is not needed anymore, destroy it
    * rm.destroy();
    * }}}
    *
    * @param targetDomNode The node in the dom where the buffer should be flushed into.
    * @param doNotPreserve flag, whether to not preserve (true) the content or to preserve it (false).
    * @param insert flag, whether to append (true) or replace (false) the buffer of the target dom node or to insert at a certain position (int)
    */
  def flush(targetDomNode: dom.Element, doNotPreserve: Boolean,
            insert: Boolean | Int): Unit = js.native

  /** Returns the configuration object Shortcut for `sap.ui.getCore().getConfiguration()`
    *
    * @return the configuration object
    */
  def getConfiguration(): Configuration = js.native

  /** Returns the renderer class for a given control instance.
    *
    * @param control the control that should be rendered
    * @return renderer for control.
    */
  def getRenderer(control: Control): Renderer = js.native

  /** Renders the given control to the provided DOMNode.
    *
    * If the control is already rendered in the provided DOMNode the DOM of the
    * control is replaced. If the control is already rendered somewhere else
    * the current DOM of the control is removed and the new DOM is appended to
    * the provided DOMNode.
    *
    * This function must not be called within control renderers.
    *
    * @param control the [[Control]] that should be rendered.
    * @param targetDomNode the node in the DOM where the result of the rendering
    *                      should be inserted.
    */
  def render(control: Control, targetDomNode: dom.Element): Unit = js.native

  /** Turns the given control into its HTML representation and appends it to the
    * rendering buffer.
    *
    * If the given control is undefined or null, then nothing is rendered.
    *
    * @param control the control that should be rendered.
    */
  def renderControl(control: Control): Unit = js.native

  /** Write the given texts to the buffer.
    *
    * @param text (can be a number too)
    * @return this render manager instance to allow chaining
    */
  def write(text: String | Int): this.type = js.native

  /** Writes the attribute and its value into the HTML.
    *
    * @param name the name of the attribute
    * @param value the value of the attribute
    * @return this render manager instance to allow chaining
    */ def writeAttribute(name: String, value: String | Int | Boolean): this.type = js.native

  /** Writes the attribute and its value into the HTML.
    *
    * The value is properly escaped to avoid XSS attacks.
    *
    * @param name the name of the attribute
    * @param value the value of the attribute
    * @return this render manager instance to allow chaining
    */
  def writeAttributeEscaped(name: String, value: js.Any): this.type = js.native

  /** Writes and flushes the class collection.
    *
    * Writes and flushes the class collection (all CSS classes added by
    * "addClass()" since the last flush). Also writes the custom style classes
    * added by the application with "addStyleClass(...)". Custom classes are
    * added by default from the currently rendered control. If an oElement is
    * given, this Element's custom style classes are added instead.
    * If oElement === false, no custom style classes are added.
    *
    * @param element an Element from which to add custom style classes (instead
    *                of adding from the control itself)
    * @return this render manager instance to allow chaining
    */
  def writeClasses(element: js.UndefOr[Element | Boolean] = js.undefined): this.type = js.native
  /** Writes the controls data into the HTML.
    *
    * Control Data consists of at least the id of a control.
    *
    * @param control the control whose identifying information should be written
    *                to the buffer
    * @return this render manager instance to allow chaining
    */
  def writeControlData(control: Control): this.type = js.native

  /** Writes the elements data into the HTML.
    *
    * Element Data consists at least of the id of a element.
    *
    * @param element the element whose identifying information should be written
    *                to the buffer
    * @return this render manager instance to allow chaining
    */
  def writeElementData(element: Element): this.type = js.native

  /** Escape text for HTML and write it to the buffer.
    *
    * @param text text to escape
    * @param lineBreaks whether to convert linebreaks into tags
    * @return this render manager instance to allow chaining
    */
  def writeEscaped(text: String, lineBreaks: Boolean): this.type = js.native

  /** Writes necessary invisible control/element placeholder data into the HTML.
    *
    * Controls should only use this method if they can't live with the standard
    * 'visible=false' implementation of the RenderManager which renders dummy
    * HTMLSpanElement for better re-rendering performance. Even though HTML5
    * error tolerance accepts this for most of the cases and these dummy
    * elements are not in the render tree of the Browser, controls may need to
    * generate a valid and semantic HTML output when the rendered
    * HTMLSpanElement is not an allowed element(e.g. `<span>` element within
    * the `<tr>` or `<li>` group).
    *
    * The caller needs to start an opening HTML tag, then call this method, then
    * complete the opening and closing tag.
    *
    * {{{
    * oRenderManager.write("");
    * }}}
    *
    * @param element an instance of [[Element]]
    * @return this render manager instance to allow chaining
    */
  def writeInvisiblePlaceholderData(element: Element): this.type = js.native

  /** Writes and flushes the style collection.
    *
    * @return this render manager instance to allow chaining
    */
  def writeStyles(): this.type = js.native
}
