package org.scalajs.openui5.sap.ui.model

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("sap.ui.model.ClientModel")
@js.native
class ClientModel(data: js.UndefOr[js.Object] = js.undefined) extends Model {
  /** Returns the current data of the model. Be aware that the returned object
    * is a reference to the model data so all changes to that data will also change the model data.
    *
    * @return Data object.
    */
  def getData(): js.Dynamic = js.native
}
