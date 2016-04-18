package org.scalajs.openui5.sap.ui.model

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import org.scalajs.openui5.sap.ui.base.Object

import scala.scalajs.js.|

@JSName("sap.ui.model.Filter")
@js.native
class Filter(filterInfo: js.Any | String | js.Array[Filter],
             operator: js.UndefOr[FilterOperator | js.Function | Boolean],
             value1: js.UndefOr[js.Any],
             value2: js.UndefOr[js.Any]) extends Object
