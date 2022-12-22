/*
 * Copyright (c) OSGi Alliance (2008, 2015). All Rights Reserved.
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

package org.osgi.service.blueprint.reflect;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * Metadata for a reference that will bind to a single matching service in the
 * service registry.
 * 
 * <p>
 * This is specified by the {@code reference} element.
 * 
 * @ThreadSafe
 * @author $Id: c10843ee7b5fe6672185437f47ff222717f6997b $
 */
@ConsumerType
public interface ReferenceMetadata extends Target, ServiceReferenceMetadata {

	/**
	 * Return the timeout for service invocations when a backing service is
	 * unavailable.
	 * 
	 * This is specified by the {@code timeout} attribute of the reference.
	 * 
	 * @return The timeout, in milliseconds, for service invocations when a
	 *         backing service is unavailable.
	 */
	long getTimeout();
}
