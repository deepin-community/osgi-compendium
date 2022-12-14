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

package org.osgi.service.jaxrs.runtime.dto;

/**
 * Represents common information about a JAX-RS extension service.
 *
 * @NotThreadSafe
 * @author $Id: 3cf2c65c552366863985e094d42b9aaa35e840c1 $
 */
public abstract class BaseExtensionDTO extends BaseDTO {

	/**
	 * The extension types recognized for this service.
	 */
	public String[] extensionTypes;
}
