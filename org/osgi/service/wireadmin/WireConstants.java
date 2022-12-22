/*
 * Copyright (c) OSGi Alliance (2002, 2018). All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.osgi.service.wireadmin;

/**
 * Defines standard names for {@code Wire} properties, wire filter attributes,
 * Consumer and Producer service properties.
 * 
 * @noimplement
 * @author $Id: be86390d17513c0a370a0abb6b1bfcb159dfa5f0 $
 */
public interface WireConstants {
	/**
	 * {@code Wire} property key (named {@code wireadmin.pid}) specifying the
	 * persistent identity (PID) of this {@code Wire} object.
	 * 
	 * <p>
	 * Each {@code Wire} object has a PID to allow unique and persistent
	 * identification of a specific {@code Wire} object. The PID must be
	 * generated by the {@link WireAdmin} service when the {@code Wire} object
	 * is created.
	 * 
	 * <p>
	 * This wire property is automatically set by the Wire Admin service. The
	 * value of the property must be of type {@code String}.
	 */
	public final static String	WIREADMIN_PID					= "wireadmin.pid";
	/**
	 * A service registration property for a Producer service that is composite.
	 * It contains the names of the composite Consumer services it can
	 * interoperate with. Interoperability exists when any name in this array
	 * matches any name in the array set by the Consumer service. The type of
	 * this property must be {@code String[]}.
	 */
	public final static String	WIREADMIN_PRODUCER_COMPOSITE	= "wireadmin.producer.composite";
	/**
	 * A service registration property for a Consumer service that is composite.
	 * It contains the names of the composite Producer services it can cooperate
	 * with. Interoperability exists when any name in this array matches any
	 * name in the array set by the Producer service. The type of this property
	 * must be {@code String[]}.
	 */
	public final static String	WIREADMIN_CONSUMER_COMPOSITE	= "wireadmin.consumer.composite";
	/**
	 * Service registration property key (named {@code wireadmin.producer.scope}
	 * ) specifying a list of names that may be used to define the scope of this
	 * {@code Wire} object. A Producer service should set this service property
	 * when it can produce more than one kind of value. This property is only
	 * used during registration, modifying the property must not have any effect
	 * of the {@code Wire} object's scope. Each name in the given list mist have
	 * {@code WirePermission[name,PRODUCE]} or else is ignored. The type of this
	 * service registration property must be {@code String[]}.
	 * 
	 * @see Wire#getScope()
	 * @see #WIREADMIN_CONSUMER_SCOPE
	 */
	public final static String	WIREADMIN_PRODUCER_SCOPE		= "wireadmin.producer.scope";
	/**
	 * Service registration property key (named {@code wireadmin.consumer.scope}
	 * ) specifying a list of names that may be used to define the scope of this
	 * {@code Wire} object. A {@code Consumer} service should set this service
	 * property when it can produce more than one kind of value. This property
	 * is only used during registration, modifying the property must not have
	 * any effect of the {@code Wire} object's scope. Each name in the given
	 * list mist have {@code WirePermission[name,CONSUME]} or else is ignored.
	 * The type of this service registration property must be {@code String[]}.
	 * 
	 * @see Wire#getScope()
	 * @see #WIREADMIN_PRODUCER_SCOPE
	 */
	public final static String	WIREADMIN_CONSUMER_SCOPE		= "wireadmin.consumer.scope";
	/**
	 * Matches all scope names.
	 */
	public final static String	WIREADMIN_SCOPE_ALL[]			= {"*"};
	/**
	 * {@code Wire} property key (named {@code wireadmin.producer.pid})
	 * specifying the {@code service.pid} of the associated Producer service.
	 * 
	 * <p>
	 * This wire property is automatically set by the WireAdmin service. The
	 * value of the property must be of type {@code String}.
	 */
	public final static String	WIREADMIN_PRODUCER_PID			= "wireadmin.producer.pid";
	/**
	 * {@code Wire} property key (named {@code wireadmin.consumer.pid})
	 * specifying the {@code service.pid} of the associated Consumer service.
	 * 
	 * <p>
	 * This wire property is automatically set by the Wire Admin service. The
	 * value of the property must be of type {@code String}.
	 */
	public final static String	WIREADMIN_CONSUMER_PID			= "wireadmin.consumer.pid";
	/**
	 * {@code Wire} property key (named {@code wireadmin.filter}) specifying a
	 * filter used to control the delivery rate of data between the Producer and
	 * the Consumer service.
	 * 
	 * <p>
	 * This property should contain a filter as described in the {@code Filter}
	 * class. The filter can be used to specify when an updated value from the
	 * Producer service should be delivered to the Consumer service. In many
	 * cases the Consumer service does not need to receive the data with the
	 * same rate that the Producer service can generate data. This property can
	 * be used to control the delivery rate.
	 * <p>
	 * The filter can use a number of predefined attributes that can be used to
	 * control the delivery of new data values. If the filter produces a match
	 * upon the wire filter attributes, the Consumer service should be notified
	 * of the updated data value.
	 * <p>
	 * If the Producer service was registered with the
	 * {@link #WIREADMIN_PRODUCER_FILTERS} service property indicating that the
	 * Producer service will perform the data filtering then the {@code Wire}
	 * object will not perform data filtering. Otherwise, the {@code Wire}
	 * object must perform basic filtering. Basic filtering includes supporting
	 * the following standard wire filter attributes:
	 * <ul>
	 * <li>{@link #WIREVALUE_CURRENT} - Current value</li>
	 * <li>{@link #WIREVALUE_PREVIOUS} - Previous value</li>
	 * <li>{@link #WIREVALUE_DELTA_ABSOLUTE} - Absolute delta</li>
	 * <li>{@link #WIREVALUE_DELTA_RELATIVE} - Relative delta</li>
	 * <li>{@link #WIREVALUE_ELAPSED} - Elapsed time</li>
	 * </ul>
	 * 
	 * @see org.osgi.framework.Filter
	 */
	public final static String	WIREADMIN_FILTER				= "wireadmin.filter";
	/* Wire filter attribute names. */
	/**
	 * {@code Wire} object's filter attribute (named {@code wirevalue.current})
	 * representing the current value.
	 */
	public final static String	WIREVALUE_CURRENT				= "wirevalue.current";
	/**
	 * {@code Wire} object's filter attribute (named {@code wirevalue.previous})
	 * representing the previous value.
	 */
	public final static String	WIREVALUE_PREVIOUS				= "wirevalue.previous";
	/**
	 * {@code Wire} object's filter attribute (named
	 * {@code wirevalue.delta.absolute}) representing the absolute delta. The
	 * absolute (always positive) difference between the last update and the
	 * current value (only when numeric). This attribute must not be used when
	 * the values are not numeric.
	 */
	public final static String	WIREVALUE_DELTA_ABSOLUTE		= "wirevalue.delta.absolute";
	/**
	 * {@code Wire} object's filter attribute (named
	 * {@code wirevalue.delta.relative}) representing the relative delta. The
	 * relative difference is |{@code previous}-{@code current} |/|
	 * {@code current}| (only when numeric). This attribute must not be used
	 * when the values are not numeric.
	 */
	public final static String	WIREVALUE_DELTA_RELATIVE		= "wirevalue.delta.relative";
	/**
	 * {@code Wire} object's filter attribute (named {@code wirevalue.elapsed})
	 * representing the elapsed time, in ms, between this filter evaluation and
	 * the last update of the {@code Consumer} service.
	 */
	public final static String	WIREVALUE_ELAPSED				= "wirevalue.elapsed";
	/* Service registration property key names. */
	/**
	 * Service Registration property (named {@code wireadmin.producer.filters}).
	 * A {@code Producer} service registered with this property indicates to the
	 * Wire Admin service that the Producer service implements at least the
	 * filtering as described for the {@link #WIREADMIN_FILTER} property. If the
	 * Producer service is not registered with this property, the {@code Wire}
	 * object must perform the basic filtering as described in
	 * {@link #WIREADMIN_FILTER}.
	 * 
	 * <p>
	 * The type of the property value is not relevant. Only its presence is
	 * relevant.
	 */
	public final static String	WIREADMIN_PRODUCER_FILTERS		= "wireadmin.producer.filters";
	/**
	 * Service Registration property (named {@code wireadmin.consumer.flavors})
	 * specifying the list of data types understood by this Consumer service.
	 * 
	 * <p>
	 * The Consumer service object must be registered with this service
	 * property. The list must be in the order of preference with the first type
	 * being the most preferred. The value of the property must be of type
	 * {@code Class[]}.
	 */
	public final static String	WIREADMIN_CONSUMER_FLAVORS		= "wireadmin.consumer.flavors";
	/**
	 * Service Registration property (named {@code wireadmin.producer.flavors})
	 * specifying the list of data types available from this Producer service.
	 * 
	 * <p>
	 * The Producer service object should be registered with this service
	 * property.
	 * 
	 * <p>
	 * The value of the property must be of type {@code Class[]}.
	 */
	public final static String	WIREADMIN_PRODUCER_FLAVORS		= "wireadmin.producer.flavors";
	/**
	 * Service Registration property (named {@code wireadmin.events}) specifying
	 * the {@code WireAdminEvent} type of interest to a Wire Admin Listener
	 * service. The value of the property is a bitwise OR of all the
	 * {@code WireAdminEvent} types the Wire Admin Listener service wishes to
	 * receive and must be of type {@code Integer}.
	 * 
	 * @see WireAdminEvent
	 */
	public final static String	WIREADMIN_EVENTS				= "wireadmin.events";
}
