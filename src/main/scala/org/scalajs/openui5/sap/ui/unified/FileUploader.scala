package org.scalajs.openui5.sap.ui.unified

import org.scalajs.openui5.sap.ui.core._
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait FileUploaderSettings extends ControlSettings
object FileUploaderSettings extends FileUploaderSettingsBuilder(noSettings)

class FileUploaderSettingsBuilder(val dict: SettingsMap)
  extends Settings[FileUploaderSettings, FileUploaderSettingsBuilder](new FileUploaderSettingsBuilder(_))
    with ButtonSetters[FileUploaderSettings, FileUploaderSettingsBuilder]

trait ButtonSetters[T <: js.Object, B <: Settings[T,_]] extends ControlSetters[T, B] {
  def value(v: String) = setting("value", v)
  def enabled(v: Boolean) = setting("enabled", v)
  def uploadUrl(v: URI) = setting("uploadUrl", v)
  def name(v: String) = setting("name", v)
  def width(v: CSSSize) = setting("width", v)
  def uploadOnChange(v: Boolean) = setting("uploadOnChange", v)
  def additionalData(v: String) = setting("additionalData", v)
  def sameFilenameAllowed(v: Boolean) = setting("sameFilenameAllowed", v)
  def buttonText(v: String) = setting("buttonText", v)
  def fileType(v: js.Array[String]) = setting("fileType", v)
  def multiple(v: Boolean) = setting("multiple", v)
  def maximumFileSize(v: Float) = setting("maximumFileSize", v)
  def mimeType(v: js.Array[String]) = setting("mimeType", v)
  def sendXHR(v: Boolean) = setting("sendXHR", v)
  def placeholder(v: String) = setting("placeholder", v)
  def style(v: String) = setting("style", v)
  def buttonOnly(v: Boolean) = setting("buttonOnly", v)
  def useMultipart(v: Boolean) = setting("useMultipart", v)
  def maximumFilenameLength(v: Int) = setting("maximumFilenameLength", v)
  def valueState(v: ValueState) = setting("valueState", v)
  def icon(v: URI) = setting("icon", v)
  def iconHovered(v: URI) = setting("iconHovered", v)
  def iconSelected(v: URI) = setting("iconSelected", v)
  def iconFirst(v: Boolean) = setting("iconFirst", v)
  def iconOnly(v: Boolean) = setting("iconOnly", v)

  def parameters(v: js.Array[FileUploaderParameter]) = setting("parameters", v)
  def headerParameters(v: js.Array[FileUploaderParameter]) = setting("headerParameters", v)

  def change(v: js.Function) = setting("change", v)
  def uploadComplete(v: js.Function) = setting("uploadComplete", v)
  def typeMismatch(v: js.Function) = setting("typeMissmatch", v) // yeah, strange spelling
  def fileSizeExceeded(v: js.Function) = setting("fileSizeExceeded", v)
  def fileAllowed(v: js.Function) = setting("fileAllowed", v)
  def uploadProgress(v: js.Function) = setting("uploadProgress", v)
  def uploadAborted(v: js.Function) = setting("uploadAborted", v)
  def filenameLengthExceeded(v: js.Function) = setting("filenameLengthExceed", v)
  def uploadStart(v: js.Function) = setting("uploadStart", v)
}

@JSName("sap.ui.unified.FileUploader")
@js.native
class FileUploader(id: js.UndefOr[String] = js.native,
                   settings: js.UndefOr[FileUploaderSettings] = js.native) extends Control {
  def this(id: String) = this(id, js.undefined)
  def this(settings: FileUploaderSettings) = this(js.undefined, settings)

  def abort(): Unit = js.native

  def addHeaderParameter(headerParameter: FileUploaderParameter): this.type = js.native
  def addParameter(parameter: FileUploaderParameter): this.type = js.native
  def attachChange(function: js.Function): this.type = js.native
  def attachFileAllowed(function: js.Function): this.type = js.native
  @JSName("attachFilenameLengthExceed")
  def attachFilenameLengthExceeded(function: js.Function): this.type = js.native
  @JSName("attachFileSizeExceed")
  def attachFileSizeExceeded(function: js.Function): this.type = js.native
  @JSName("attachTypeMissmatch")
  def attachTypeMismatch(function: js.Function): this.type = js.native
  def attachUploadAborted(function: js.Function): this.type = js.native
  def attachUploadComplete(function: js.Function): this.type = js.native
  def attachUploadProgress(function: js.Function): this.type = js.native
  def attachUploadStart(function: js.Function): this.type = js.native

  def clear(): Unit = js.native

  def destroyHeaderParameters(): this.type = js.native
  def destroyParameters(): this.type = js.native
  def detachChange(function: js.Function, listener: js.Any): this.type = js.native
  def detachFileAllowed(function: js.Function, listener: js.Any): this.type = js.native
  @JSName("detachFilenameLengthExceed")
  def detachFilenameLengthExceeded(function: js.Function, listener: js.Any): this.type = js.native
  @JSName("detachFileSizeExceed")
  def detachFileSizeExceeded(function: js.Function, listener: js.Any): this.type = js.native
  @JSName("detachTypeMissmatch")
  def detachTypeMismatch(function: js.Function, listener: js.Any): this.type = js.native
  def detachUploadAborted(function: js.Function, listener: js.Any): this.type = js.native
  def detachUploadComplete(function: js.Function, listener: js.Any): this.type = js.native
  def detachUploadProgress(function: js.Function, listener: js.Any): this.type = js.native
  def detachUploadStart(function: js.Function, listener: js.Any): this.type = js.native

  def getAdditionalData(): String = js.native
  def getButtonOnly(): Boolean = js.native
  def getButtonText(): String = js.native
  def getEnabled(): Boolean = js.native
  def getFileType(): js.Array[String] = js.native
  def getHeaderParameters(): js.Array[FileUploaderParameter] = js.native
  def getIcon(): URI = js.native
  def getIconFirst(): Boolean = js.native
  def getIconHovered(): URI = js.native
  def getIconOnly(): Boolean = js.native
  def getIconSelected(): URI = js.native
  def getMaximumFilenameLength(): Int = js.native
  def getMaximumFileSize(): Float = js.native
  def getMimeType(): js.Array[String] = js.native
  def getMultiple(): Boolean = js.native
  def getName(): String = js.native
  def getParameters(): js.Array[FileUploaderParameter] = js.native
  def getPlaceholder(): String = js.native
  def getSameFilenameAllowed(): Boolean = js.native
  def getSendXHR(): Boolean = js.native
  def getStyle(): String = js.native
  def getUploadOnChange(): Boolean = js.native
  def getUploadUrl(): URI = js.native
  def getUseMultipart(): Boolean = js.native
  def getValue(): String = js.native
  def getValueState(): ValueState = js.native
  def getWidth(): CSSSize = js.native

  def indexOfHeaderParameter(headerParametere: FileUploaderParameter): Int = js.native
  def indexOfParameter(parameter: FileUploaderParameter): Int = js.native
  def insertHeaderParameter(headerParameter: FileUploaderParameter, index: Int): this.type = js.native
  def insertParameter(parameter: FileUploaderParameter, index: Int): this.type = js.native

  def removeAllHeaderParameters(): this.type = js.native
  def removeAllParameters(): this.type = js.native
  def removeHeaderParameter(headerParameter: FileUploaderParameter): this.type = js.native
  def removeParameter(parameter: FileUploaderParameter): this.type = js.native
  def setAdditionalData(additionalData: String): this.type = js.native
  def setButtonOnly(buttonOnly: Boolean): this.type = js.native
  def setButtonText(buttonText: String): this.type = js.native
  def setEnabled(enabled: Boolean): this.type = js.native
  def setFileType(fileType: js.Array[String]): this.type = js.native
  def setIcon(icon: String): this.type = js.native
  def setIconFirst(iconFirst: Boolean): this.type = js.native
  def setIconHovered(iconHovered: URI): this.type = js.native
  def setIconOnly(iconOnly: Boolean): this.type = js.native
  def setIconSelected(iconSelected: URI): this.type = js.native
  def setMaximumFilenameLength(maximumFilenameLength: Int): this.type = js.native
  def setMaximumFileSize(maximumFileSize: Float): this.type = js.native
  def setMimeType(mimeType: js.Array[String]): this.type = js.native
  def setMultiple(multiple: Boolean): this.type = js.native
  def setName(name: String): this.type = js.native
  def setPlaceholder(placeholder: String): this.type = js.native
  def setSameFilenameAllowed(sameFilenameAllowed: Boolean): this.type = js.native
  def setSendXHR(sendXHR: Boolean): this.type = js.native
  def setStyle(style: String): this.type = js.native
  def setUploadOnChange(uploadOnChange: Boolean): this.type = js.native
  def setUploadUrl(uploadUrl: URI): this.type = js.native
  def setUseMultipart(useMultipart: Boolean): this.type = js.native
  def setValue(value: String): this.type = js.native
  def setValueState(valueState: ValueState): this.type = js.native
  def setWidth(width: CSSSize): this.type = js.native

  def upload(): Unit = js.native
}
