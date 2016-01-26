package org.scalajs.openui5.sap.ui.base

import org.scalajs.openui5.sap.ui.core.ID
import org.scalajs.openui5.sap.ui.model.{Context, Model}

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}

@ScalaJSDefined
class ManagedObjectSettings extends js.Object {
  var id: js.UndefOr[ID] = js.undefined
  var models: js.UndefOr[js.Dictionary[Model]] = js.undefined
  var bindingContexts: js.UndefOr[js.Dictionary[Context]] = js.undefined
  var objectBindings: js.UndefOr[js.Dictionary[js.Dynamic]] = js.undefined
}


/** Base Class that introduces some basic concepts like state management or
  * databinding.
  *
  * New subclasses of [[ManagedObject]] are created with a call to
  * ManagedObject.extend and can make use of the following managed features:
  *
  * ==Properties==
  * Managed properties represent the state of a ManagedObject. They can store
  * a single value of a simple data type (like 'string' or 'int'). They have
  * a name (e.g. 'size') and methods to get the current value (getSize) or to
  * set a new value (setSize). When a property is modified, the ManagedObject
  * is marked as invalidated. A managed property can be bound against a
  * property in a sap.ui.model.Model by using the #bindProperty method.
  * Updates to the model property will be automatically reflected in the
  * managed property and - if TwoWay databinding is active, changes to the
  * managed property will be reflected in the model. An existing binding can
  * be removed by calling #unbindProperty.
  *
  * If a ManagedObject is cloned, the clone will have the same values for its
  * managed properties as the source of the clone - if the property wasn't
  * bound. If it is bound, the property in the clone will be bound to the
  * same model property as in the source.
  *
  * Details about the declaration of a managed property, the metadata that
  * describes it and the set of methods that are automatically generated to
  * access it, can be found in the documentation of the extend method.
  *
  * == Aggregations ==
  * Managed aggregations can store one or more references to other
  * ManagedObjects. They are a mean to control the lifecycle of the
  * aggregated objects: one ManagedObject can be aggregated by at most one
  * parent ManagedObject at any time. When a ManagedObject is destroyed, all
  * aggregated objects are destroyed as well and the object itself is removed
  * from its parent. That is, aggregations won't contain destroyed objects or
  * null/undefined.
  *
  * Aggregations have a name ('e.g 'header' or 'items'), a cardinality ('0.
  * .1' or '0..n') and are of a specific type (which must be a subclass of
  * ManagedObject as well or a UI5 interface). A ManagedObject will provide
  * methods to set or get the aggregated object for a specific aggregation of
  * cardinality 0..1 (e.g. setHeader, getHeader for an aggregation named
  * 'header'). For an aggregation of cardinality 0..n, there are methods to
  * get all aggregated objects (getItems), to locate an object in the
  * aggregation (e.g. indexOfItem), to add, insert or remove a single
  * aggregated object (addItem, insertItem, removeItem) or to remove or
  * destroy all objects from an aggregation (removeAllItems, destroyItems).
  *
  * Details about the declaration of a managed aggregation, the metadata that
  * describes it and the set of methods that are automatically generated to
  * access it, can be found in the documentation of the extend method.
  *
  * Aggregations of cardinality 0..n can be bound to a collection in a model
  * by using bindAggregation (and unbound again using #unbindAggregation. For
  * each context in the model collection, a corresponding object will be
  * created in the managed aggregation, either by cloning a template object
  * or by calling a factory function.
  *
  * Aggregations also control the databinding context of bound objects: by
  * default, aggregated objects inherit all models and binding contexts from
  * their parent object.
  *
  * When a ManagedObject is cloned, all aggregated objects will be cloned as
  * well - but only if they haven't been added by databinding. In that case, the
  * aggregation in the clone will be bound to the same model collection.
  *
  * ==Associations==
  * Managed associations also form a relationship between objects, but they
  * don't define a lifecycle for the associated objects. They even can
  * 'break' in the sense that an associated object might have been destroyed
  * already although it is still referenced in an association. For the same
  * reason, the internal storage for associations are not direct object
  * references but only the IDs of the associated target objects.
  *
  * Associations have a name ('e.g 'initialFocus'), a cardinality ('0..1' or
  * '0..n') and are of a specific type (which must be a subclass of
  * ManagedObject as well or a UI5 interface). A ManagedObject will provide
  * methods to set or get the associated object for a specific association of
  * cardinality 0..1 (e.g. setInitialFocus, getInitialFocus). For an
  * association of cardinality 0..n, there are methods to get all associated
  * objects (getRefItems), to add, insert or remove a single associated
  * object (addRefItem, insertRefItem, removeRefItem) or to remove all
  * objects from an association (removeAllRefItems).
  *
  * Details about the declaration of a managed association, the metadata that
  * describes it and the set of methods that are automatically generated to
  * access it, can be found in the documentation of the extend method.
  *
  * Associations can't be bound to the model.
  *
  * When a ManagedObject is cloned, the result for an association depends on
  * the relationship between the associated target object and the root of the
  * clone operation: if the associated object is part of the to-be-cloned
  * object tree (reachable via aggregations from the root of the clone
  * operation), then the cloned association will reference the clone of the
  * associated object. Otherwise it will reference the same object as in the
  * original tree. When a ManagedObject is destroyed, other objects that are
  * only associated, are not affected by the destroy operation.
  *
  * ==Events==
  * Managed events provide a mean for communicating important state changes
  * to an arbitrary number of 'interested' listeners. Events have a name and
  * (optionally) a set of parameters. For each event there will be methods to
  * add or remove an event listener as well as a method to fire the event.
  * (e.g. attachChange, detachChange, fireChange for an event named 'change').
  *
  * Details about the declaration of a managed events, the metadata that
  * describes it and the set of methods that are automatically generated to
  * access it, can be found in the documentation of the extend method.
  *
  * When a ManagedObject is cloned, all listeners registered for any event in
  * the clone source are also registered to the clone. Later changes are not
  * reflect in any direction (neither from source to clone nor vice versa).
  *
  * ==Low Level APIs:==
  * The prototype of ManagedObject provides several generic, low level APIs
  * to manage properties, aggregations, associations and events. These
  * generic methods are solely intended for implementing higher level,
  * non-generic methods that manage a single managed property etc. (e.g. a
  * function setSize(value) that sets a new value for property 'size').
  * sap.ui.base.ManagedObject.extend creates default implementations of those
  * higher level APIs for all managed aspects. The implementation of a
  * subclass then can override those default implementations with a more
  * specific implementation, e.g. to implement a side effect when a specific
  * property is set or retrieved. It is therefore important to understand
  * that the generic low-level methods ARE NOT SUITABLE FOR GENERIC ACCESS to
  * the state of a managed object, as that would bypass the overriding higher
  * level methods and their side effects.
  *
  * @note Since 1.11.2. ManagedObject as such is public and usable. Only the
  *       support for the optional parameter oScope in the constructor is
  *       still experimental and might change in future versions.
  *       Applications should not rely on it.
  */
@JSName("sap.ui.base.ManagedObject")
@js.native
class ManagedObject(id: String = js.native,
                    settings: js.Dynamic = js.native,
                    scope: js.Dynamic = js.native)
  extends EventProvider {
  def setBindingContext(context: Context, modelName: js.UndefOr[String] = js.undefined): ManagedObject = js.native
  def getBindingContext(modelName: js.UndefOr[String] = js.undefined): Context = js.native
  def setModel(model: Model, name: js.UndefOr[String] = js.undefined): ManagedObject = js.native
  def getModel(name: js.UndefOr[String] = js.undefined): Model = js.native
}

@JSName("sap.ui.base.ManagedObject")
@js.native
object ManagedObject extends Object {

}
