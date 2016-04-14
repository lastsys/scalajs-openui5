package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.CalendarType
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait DatePickerSettings extends InputBaseSettings
object DatePickerSettings extends DatePickerSettingsBuilder(noSettings)

class DatePickerSettingsBuilder(val dict: SettingsMap)
  extends Settings[DatePickerSettings, DatePickerSettingsBuilder](new DatePickerSettingsBuilder(_))
    with DatePickerSetters[DatePickerSettings, DatePickerSettingsBuilder]

trait DatePickerSetters[T <: js.Object, B <: Settings[T,_]]
  extends InputBaseSetters[T, B] {

  def displayFormat(v: String) = setting("displayFormat", v)
  def valueFormat(v: String) = setting("valueFormat", v)
  def dateValue(v: js.Date) = setting("dateValue", v)
  def displayFormatType(v: String) = setting("displayFormatType", v)
  def secondaryCalendarType(v: CalendarType) = setting("secondaryCalendarType", v)
}

@JSName("sap.ui.commons.DatePicker")
@js.native
class DatePicker(id: js.UndefOr[String] = js.native,
                  settings: js.UndefOr[DatePickerSettings])
  extends InputBase {

  def this(id: String) = this(id, js.undefined)
  def this(settings: DatePickerSettings) = this(js.undefined, settings)
}
