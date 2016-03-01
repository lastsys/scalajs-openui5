package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}

@ScalaJSDefined
trait DatePickerSettings extends TextFieldSettings
object DatePickerSettings extends DatePickerSettingsBuilder(noSettings)

class DatePickerSettingsBuilder(val dict: SettingsMap)
  extends Settings[DatePickerSettings, DatePickerSettingsBuilder](new DatePickerSettingsBuilder(_))
    with DatePickerSetters[DatePickerSettings, DatePickerSettingsBuilder]

trait DatePickerSetters[T <: js.Object, B <: Settings[T,_]]
  extends TextFieldSetters[T, B] {

  def locale(v: String) = setting("locale", v)
  def yyyymmdd(v: String) = setting("yyyymmdd", v)
}

@JSName("sap.ui.commons.DatePicker")
@js.native
class DatePicker(id: js.UndefOr[String] = js.native,
                 settings: js.UndefOr[DatePickerSettings] = js.native)
  extends TextField {

  def this(id: String) = this(id, js.undefined)
  def this(settings: DatePickerSettings) = this(js.undefined, settings)

  def getYyyymmdd(): String = js.native
}
