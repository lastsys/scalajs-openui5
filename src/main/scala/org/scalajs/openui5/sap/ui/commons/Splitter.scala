package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap.ui.core.Control

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName


@JSName("sap.ui.commons.Splitter")
@js.native
class Splitter extends Control {
  /** Destroys all the firstPaneContent in the aggregation named
    * firstPaneContent.
    *
    * @return Reference to this in order to allow method chaining
    */
  def destroyFirstPaneContent(): this.type = js.native

  /** Destroys all the secondPaneContent in the aggregation named
    * secondPaneContent.
    *
    * @return Reference to this in order to allow method chaining
    */
  def destroySecondPaneContent(): Unit = js.native

  /** Adds some firstPaneContent into the aggregation named firstPaneContent.
    *
    * @return Reference to this in order to allow method chaining
    */
  def addFirstPaneContent(firstPaneContent: Control): this.type = js.native

  /** Adds some secondPaneContent into the aggregation named secondPaneContent.
    *
    * @return Reference to this in order to allow method chaining
    */
  def addSecondPaneContent(secondPaneContent: Control): this.type = js.native
}
