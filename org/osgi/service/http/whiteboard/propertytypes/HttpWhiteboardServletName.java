/*
 * Copyright (c) OSGi Alliance (2017). All Rights Reserved.
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

package org.osgi.service.http.whiteboard.propertytypes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.osgi.service.component.annotations.ComponentPropertyType;
import org.osgi.service.http.whiteboard.annotations.RequireHttpWhiteboard;

/**
 * Component Property Type for the {@code osgi.http.whiteboard.servlet.name}
 * service property.
 * <p>
 * This annotation can be used on a {@link javax.servlet.Servlet} to declare the
 * value of the
 * {@link org.osgi.service.http.whiteboard.HttpWhiteboardConstants#HTTP_WHITEBOARD_SERVLET_NAME
 * HTTP_WHITEBOARD_SERVLET_NAME} service property.
 * 
 * @see "Component Property Types"
 * @author $Id: f669362b6bfaab17e439d2d7a18463a4911f61f9 $
 * @since 1.1
 */
@ComponentPropertyType
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
@RequireHttpWhiteboard
public @interface HttpWhiteboardServletName {
	/**
	 * Prefix for the property name. This value is prepended to each property
	 * name.
	 */
	String PREFIX_ = "osgi.";

	/**
	 * Service property identifying a servlet name.
	 * 
	 * @return The servlet name.
	 * @see org.osgi.service.http.whiteboard.HttpWhiteboardConstants#HTTP_WHITEBOARD_SERVLET_NAME
	 *      HTTP_WHITEBOARD_SERVLET_NAME
	 */
	String value();
}
