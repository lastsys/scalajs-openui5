package org.scalajs.openui5.sap.ui.base

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/** Base class for all SAPUI5 Objects. */
@JSName("sap.ui.base.Object")
@js.native
class Object extends js.Object {
  def destroy(): Unit = js.native
  def getInterface(): Interface = js.native
  def getMetadata(): js.Dynamic = js.native
}

@JSName("sap.ui.base.Object")
@js.native
object Object extends js.Object {
  @JSName("sap.ui.base.Object.extend")
  def extend(className: String,
             classInfo: js.UndefOr[js.Dynamic] = js.undefined,
             metaImpl: js.UndefOr[js.Function] = js.undefined): Object = js.native
}
