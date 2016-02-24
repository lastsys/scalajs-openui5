package org.scalajs.openui5.sap.ui.layout

import org.scalajs.openui5.sap.ui.core.{ControlSetters, ControlSettings, Control}
import org.scalajs.openui5.util.{SettingsMap, noSettings, Settings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

/** The BlockLayout is used to display several objects in a section-based
  * manner. It features horizontal and vertical subdivisions, and full-width
  * banners seen frequently in contemporary web design. Background colors are
  * attached directly to these “blocks” of the layout. Special full-width
  * sections of the BlockLayout allow horizontal scrolling through a set of
  * blocks. Example use cases are SAP HANA Cloud Integration and the SAPUI5
  * Demo Kit. In SAP HANA Cloud Integration the BlockLayout serves as a
  * banner-like presentation of illustrative icons with associated text. By
  * placing pictorial and textual elements side by side in different blocks,
  * a relation of content is established. In the SAPUI5 Demo Kit the
  * BlockLayout serves as a flexible container for diverging content, such as
  * headings, explanatory texts, code snippets, remarks, and examples. The
  * BlockLayout comes in three types: Layout only (default), Bright, and
  * Mixed background colors.
  *
  * @since 1.34
  */
@ScalaJSDefined
trait BlockLayoutSettings extends ControlSettings
object BlockLayoutSettings extends BlockLayoutSettingsBuilder(noSettings)

class BlockLayoutSettingsBuilder(val dict: SettingsMap)
  extends Settings[BlockLayoutSettings, BlockLayoutSettingsBuilder](new BlockLayoutSettingsBuilder(_))
    with BlockLayoutSetters[BlockLayoutSettings, BlockLayoutSettingsBuilder]

trait BlockLayoutSetters[T <: js.Object, B <: Settings[T,_]] extends ControlSetters[T, B] {
  def background(v: BlockBackgroundType) = setting("background", v)

  def content(v: js.Array[BlockLayoutRow]) = setting("content", v)
}

@JSName("sap.ui.layout.BlockLayout")
@js.native
class BlockLayout(id: js.UndefOr[String] = js.native,
                  settings: js.UndefOr[BlockLayoutSettings]) extends Control {
  def this(id: String) = this(id, js.undefined)
  def this(settings: BlockLayoutSettings) = this(js.undefined, settings)
}
