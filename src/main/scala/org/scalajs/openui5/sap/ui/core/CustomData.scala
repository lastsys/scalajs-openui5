package org.scalajs.openui5.sap.ui.core

import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait CustomDataSettings extends ElementSettings
object CustomDataSettings extends CustomDataSettingsBuilder(noSettings)

class CustomDataSettingsBuilder(val dict: SettingsMap)
  extends Settings[CustomDataSettings, CustomDataSettingsBuilder](new CustomDataSettingsBuilder(_))
    with CustomDataSetters[CustomDataSettings, CustomDataSettingsBuilder]

trait CustomDataSetters[T <: js.Object, B <: Settings[T,_]]
  extends ElementSetters[T, B] {

  def key(v: String) = setting("key", v)
  def value(v: js.Any) = setting("value", v)
  def writeToDom(v: Boolean) = setting("writeToDom", v)
}

@JSName("sap.ui.core.CustomData")
@js.native
class CustomData(id: js.UndefOr[String] = js.native,
                 settings: js.UndefOr[CustomDataSettings] = js.native) extends Element {

  def this(id: String) = this(id, js.undefined)
  def this(settings: CustomDataSettings) = this(js.undefined, settings)

  def getKey(): String = js.native
  def getValue(): js.Any = js.native
  def getWriteToDom(): Boolean = js.native
  def setKey(key: String): this.type = js.native
  def setValue(value: js.Any): this.type = js.native
  def setWriteToDom(writeToDom: Boolean): this.type = js.native
}
