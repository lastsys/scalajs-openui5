package org.scalajs.openui5.sap.ui.model.json

import org.scalajs.openui5.sap.ui.model.ClientModel

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

@JSName("sap.ui.model.json.JSONModel")
@js.native
class JSONModel(data: js.UndefOr[js.Object] = js.undefined) extends ClientModel {
  def setData(data: js.Any,
              merge: Boolean = false): this.type = js.native
  def loadData[T <: js.Object](url: String,
               parameters: js.UndefOr[js.Object | String] = js.undefined,
               async: js.UndefOr[Boolean] = js.undefined,
               `type`: js.UndefOr[String] = js.undefined,
               merge: js.UndefOr[Boolean] = js.undefined,
               cache: js.UndefOr[Boolean] = js.undefined,
               headers: js.UndefOr[js.Dictionary[String]] = js.undefined): T = js.native
}
