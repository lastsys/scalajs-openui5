package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.{Control, ValueState}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("sap.m.ProgressIndicator")
@js.native
class ProgressIndicator extends Control {

  def setDisplayValue(displayValue: String): this.type = js.native
  def setPercentValue(percentValue: Float): this.type = js.native
  def setShowValue(showValue: Boolean): this.type = js.native
  def setState(state: ValueState): this.type = js.native
}
