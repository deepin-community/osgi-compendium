/*
 * Copyright (c) OSGi Alliance (2017, 2018). All Rights Reserved.
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

package org.osgi.service.jaxrs.whiteboard.propertytypes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.osgi.service.component.annotations.ComponentPropertyType;

/**
 * Component Property Type for the {@code osgi.jaxrs.name} service property.
 * <p>
 * This annotation can be used on a JAX-RS service to declare the value of the
 * {@link org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants#JAX_RS_NAME}
 * service property.
 * 
 * @see "Component Property Types"
 * @author $Id: 7ea3bb5b6f2c0676ca94cc5d054d1406268ba37e $
 */
@ComponentPropertyType
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface JaxrsName {
	/**
	 * Prefix for the property name. This value is prepended to each property
	 * name.
	 */
	String PREFIX_ = "osgi.";

	/**
	 * Service property identifying the name of a JAX-RS service for processing
	 * by the whiteboard.
	 * 
	 * @return The JAX-RS service name.
	 * @see org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants#JAX_RS_NAME
	 */
	String value();
}
