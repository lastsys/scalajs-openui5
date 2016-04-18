package org.scalajs.openui5.sap.ui.model

import org.scalajs.openui5.sap.ui.base.EventProvider

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName


/** The Binding is the object, which holds the necessary information for a data
  * binding, like the binding path and the binding context, and acts like an
  * interface to the model for the control, so it is the event provider for
  * changes in the data model and provides getters for accessing properties or
  * lists.
  */
@JSName("sap.ui.model.Binding")
@js.native
trait Binding extends EventProvider

