package org.scalajs.openui5.sap.ui.commons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("sap.ui.commons.DatePicker")
@js.native
class DatePicker(id: String = js.native,
                 settings: js.Dynamic = js.native) extends TextField {
  def getYyyymmdd(): String = js.native
}
