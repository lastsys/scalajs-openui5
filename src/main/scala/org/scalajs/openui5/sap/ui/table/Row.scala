package org.scalajs.openui5.sap.ui.table

import org.scalajs.openui5.sap.ui.core.{Control, ElementSetters, ElementSettings, Element}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}

@ScalaJSDefined
trait RowSettings extends ElementSettings
object RowSettings extends RowSettingsBuilder(noSettings)

class RowSettingsBuilder(val dict: SettingsMap)
  extends Settings[RowSettings, RowSettingsBuilder](new RowSettingsBuilder(_))
    with RowSetters[RowSettings, RowSettingsBuilder]

trait RowSetters[T <: js.Object, B <: Settings[T,_]] extends ElementSetters[T, B] {
  def cells(v: js.Array[Control]) = setting("cells", v)
}

@JSName("sap.ui.table.Row")
@js.native
class Row(id: js.UndefOr[String] = js.native,
          settings: js.UndefOr[RowSettings]) extends Element {

  def this(id: String) = this(id, js.undefined)
  def this(settings: RowSettings) = this(js.undefined, settings)
}
