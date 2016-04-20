package org.scalajs.openui5.sap.ui.model

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import org.scalajs.openui5.sap.ui.base.Object

import scala.scalajs.js.Dynamic.{literal ⇒ L}
import scala.scalajs.js.|

@JSName("sap.ui.model.Filter")
@js.native
class Filter(filterInfo: js.Any | String | js.Array[Filter],
             operator: js.UndefOr[FilterOperator | js.Function1[js.Any, Boolean] | Boolean] = js.undefined,
             value1: js.UndefOr[js.Any | String] = js.undefined,
             value2: js.UndefOr[js.Any | String] = js.undefined) extends Object {

//  def this(path: String,
//           operator: FilterOperator,
//           value1: js.Any,
//           value2: js.Any) = this(path, operator, value1, value2)

  def this(path: String, test: js.Function1[js.Any, Boolean]) =
    this(path, test, js.undefined, js.undefined)

  def this(filters: js.Array[Filter], and: Boolean) = this(filters, and, js.undefined, js.undefined)
}
