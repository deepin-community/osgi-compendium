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
 * Component Property Type for the {@code osgi.jaxrs.extension.select} service
 * property.
 * <p>
 * This annotation can be used on a JAX-RS resource or extension to declare the
 * value of the
 * {@link org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants#JAX_RS_EXTENSION_SELECT}
 * service property.
 * 
 * @see "Component Property Types"
 * @author $Id: 6c81b4ea7a45c08aeeceaec418d356f67298cecc $
 */
@ComponentPropertyType
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface JaxrsExtensionSelect {
	/**
	 * Prefix for the property name. This value is prepended to each property
	 * name.
	 */
	String PREFIX_ = "osgi.";

	/**
	 * Service property providing one or more OSGi filters identifying the
	 * extension(s) or application features which this service requires to work.
	 * 
	 * @return The filters for selecting the extensions to require.
	 * @see org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants#JAX_RS_EXTENSION_SELECT
	 */
	String[] value();
}
