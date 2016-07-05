package org.scalajs.openui5.sap.ui.unified

import org.scalajs.openui5.sap.ui.core.{Element, ElementSetters, ElementSettings}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait FileUploaderParameterSettings extends ElementSettings
object FileUploaderParameterSettings extends FileUploaderParameterSettingsBuilder(noSettings)

class FileUploaderParameterSettingsBuilder(val dict: SettingsMap)
  extends Settings[FileUploaderParameterSettings, FileUploaderParameterSettingsBuilder](new FileUploaderParameterSettingsBuilder(_))
    with FileUploaderParameterSetters[FileUploaderParameterSettings, FileUploaderParameterSettingsBuilder]

trait FileUploaderParameterSetters[T <: js.Object, B <: Settings[T,_]]
  extends ElementSetters[T, B] {

  def name(v: String) = setting("name", v)
  def value(v: String) = setting("value", v)
}


@JSName("sap.ui.unified.FileUploaderParameter")
@js.native
class FileUploaderParameter(id: js.UndefOr[String] = js.native,
                            settings: js.UndefOr[FileUploaderParameterSettings]) extends Element {
  def this(id: String) = this(id, js.undefined)
  def this(settings: FileUploaderParameterSettings) = this(js.undefined, settings)

  def getName(): String = js.native
  def getValue(): String = js.native
  def setName(name: String): this.type = js.native
  def setValue(value: String): this.type = js.native
}
