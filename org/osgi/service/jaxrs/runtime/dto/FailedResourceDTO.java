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
 * Represents a JAX-RS resource service which is currently not being used due to
 * a problem.
 * 
 * @NotThreadSafe
 * @author $Id: 818bfd1f665f9bbfa31ae1e1738070c4e2522d8b $
 */
public class FailedResourceDTO extends BaseDTO {

	/**
	 * The reason why the resource represented by this DTO is not used.
	 * 
	 * @see DTOConstants#FAILURE_REASON_UNKNOWN
	 * @see DTOConstants#FAILURE_REASON_SERVICE_NOT_GETTABLE
	 * @see DTOConstants#FAILURE_REASON_VALIDATION_FAILED
	 * @see DTOConstants#FAILURE_REASON_REQUIRED_EXTENSIONS_UNAVAILABLE
	 */
	public int	failureReason;
}
