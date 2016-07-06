package org.scalajs.openui5.sap.m

import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait MultiInputSettings extends InputSettings
object MultiInputSettings extends MultiInputSettingsBuilder(noSettings)

class MultiInputSettingsBuilder(val dict: SettingsMap)
  extends Settings[MultiInputSettings, MultiInputSettingsBuilder](new MultiInputSettingsBuilder(_))
    with MultiInputSetters[MultiInputSettings, MultiInputSettingsBuilder]

trait MultiInputSetters[T <: js.Object, B <: Settings[T,_]]
  extends InputSetters[T, B] {

  def enableMultiLineMode(v: Boolean) = setting("enableMultiLineMode", v)
  def maxTokens(v: Int) = setting("maxTokens", v)

  def tokens(v: js.Array[Token]) = setting("tokens", v)

  def tokenChange(v: js.Function) = setting("tokenChange", v)
}

@JSName("sap.m.MultiInput")
@js.native
class MultiInput(id: js.UndefOr[String] = js.native,
                 settings: js.UndefOr[MultiInputSettings] = js.native) extends Input {

  def this(id: String) = this(id, js.undefined)
  def this(settings: MultiInputSettings) = this(js.undefined, settings)

  def addValidator(validator: js.Function): this.type = js.native
  def getTokens(): js.Array[Token] = js.native
}
