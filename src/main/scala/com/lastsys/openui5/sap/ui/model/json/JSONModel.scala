package com.lastsys.openui5.sap.ui.model.json

import com.lastsys.openui5.sap.ui.model.ClientModel

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("sap.ui.model.json.JSONModel")
@js.native
class JSONModel(data: js.UndefOr[js.Object] = js.undefined) extends ClientModel {
  def setData(data: js.Any,
              merge: Boolean = false): JSONModel = js.native
}
