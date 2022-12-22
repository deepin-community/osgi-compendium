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

import org.osgi.dto.DTO;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

/**
 * Represents common information about a JAX-RS service.
 *
 * @NotThreadSafe
 * @author $Id: 5ab1057aabb9fb11115f63491ebf64736801a9f3 $
 */
public abstract class BaseDTO extends DTO {
	/**
	 * The name of the service if it set one using
	 * {@link JaxrsWhiteboardConstants#JAX_RS_NAME}, otherwise this value will
	 * contain the generated name for this service
	 */
	public String					name;

	/**
	 * Service property identifying the JAX-RS service
	 */
	public long						serviceId;
}
