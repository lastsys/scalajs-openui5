package org.scalajs.openui5.sap.ui.core.routing

import org.scalajs.openui5.sap.ui.base.EventProvider

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}
import scala.scalajs.js.|

@ScalaJSDefined
trait RoutesSettings extends js.Any

@ScalaJSDefined
trait ConfigSettings extends js.Any

@ScalaJSDefined
trait OwnerSettings extends js.Any

@ScalaJSDefined
trait TargetsConfigSettings extends js.Any

@JSName("sap.ui.core.routing.Router")
@js.native
class Router(routes: js.UndefOr[RoutesSettings|js.Array[RoutesSettings]] = js.native,
             config: js.UndefOr[ConfigSettings] = js.native,
             owner: js.UndefOr[OwnerSettings] = js.native,
             targetsConfig: js.UndefOr[TargetsConfigSettings] = js.native)
  extends EventProvider {

  def this(routes: RoutesSettings|js.Array[RoutesSettings],
           config: ConfigSettings,
           targetsConfig: TargetsConfigSettings) =
    this(routes, config, js.undefined, targetsConfig)

  def this(routes: RoutesSettings|js.Array[RoutesSettings],
           owner: OwnerSettings,
           targetsConfig: TargetsConfigSettings) =
    this(routes, js.undefined, owner, targetsConfig)

  def this(config: ConfigSettings,
           owner: OwnerSettings,
           targetsConfig: TargetsConfigSettings) =
    this(js.undefined, config, owner, targetsConfig)

  def this(routes: RoutesSettings|js.Array[RoutesSettings],
           owner: OwnerSettings) =
    this(routes, js.undefined, owner)

  def this(routes: RoutesSettings|js.Array[RoutesSettings],
           targetsConfig: TargetsConfigSettings) =
    this(routes, js.undefined, js.undefined, targetsConfig)

  def this(config: ConfigSettings, owner: OwnerSettings) =
    this(js.undefined, config, owner)

  def this(config: ConfigSettings, targetsConfig: TargetsConfigSettings) =
    this(js.undefined, config, js.undefined, targetsConfig)

  def this(owner: OwnerSettings, targetsConfig: TargetsConfigSettings) =
    this(js.undefined, js.undefined, owner, targetsConfig)

  def this(config: ConfigSettings) = this(js.undefined, config)

  def this(owner: OwnerSettings) = this(js.undefined, js.undefined, owner)

  def this(targetsConfig: TargetsConfigSettings) =
    this(js.undefined, js.undefined, js.undefined, targetsConfig)


  def register(name: String): Unit = js.native
  def stop(): Unit = js.native

  def attachBypassed(data: js.UndefOr[js.Any],
                     function: js.Function,
                     listener: js.UndefOr[Any]): this.type = js.native
  def attachBypassed(function: js.Function): this.type = js.native
  def attachBypassed(function: js.Function,
                     listener: js.UndefOr[js.Any]): this.type = js.native

  def attachRouteMatched(data: js.UndefOr[js.Any],
                         function: js.Function,
                         listener: js.UndefOr[Any]): this.type = js.native
  def attachRouteMatched(function: js.Function): this.type = js.native
  def attachRouteMatched(function: js.Function,
                         listener: js.UndefOr[js.Any]): this.type = js.native

  def attachRoutePatternMatched(data: js.UndefOr[js.Any],
                                function: js.Function,
                                listener: js.UndefOr[Any]): this.type = js.native
  def attachRoutePatternMatched(function: js.Function): this.type = js.native
  def attachRoutePatternMatched(function: js.Function,
                                listener: js.UndefOr[js.Any]): this.type = js.native
}


@JSName("sap.ui.core.routing.Router")
@js.native
object Router extends EventProvider {
  def getRouter(name: String): Unit = js.native
}
