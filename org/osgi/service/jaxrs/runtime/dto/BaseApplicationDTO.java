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

import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

/**
 * Represents common information about a JAX-RS application service.
 *
 * @NotThreadSafe
 * @author $Id: 32814ca85e8ae5a452ddccb9178cd666ed9d5ebb $
 */
public abstract class BaseApplicationDTO extends BaseDTO {

	/**
	 * The base URI of the resource defined by
	 * {@link JaxrsWhiteboardConstants#JAX_RS_APPLICATION_BASE}.
	 */
	public String			base;

	/**
	 * Returns the representations of the dynamic JAX-RS resource services
	 * associated with this Application. The returned array may be empty if this
	 * application is currently not associated with any JAX-RS Resource
	 * services.
	 */
	public ResourceDTO[]	resourceDTOs;

	/**
	 * Returns the representations of the dynamic JAX-RS extension services
	 * associated with this Application. The returned array may be empty if this
	 * application is currently not associated with any JAX-RS extension
	 * services.
	 */
	public ExtensionDTO[]	extensionDTOs;
}
