/*
 * Copyright (c) OSGi Alliance (2008, 2013). All Rights Reserved.
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
 * A common interface for managed components that can be used as a direct target
 * for method calls. These are {@code bean}, {@code reference}, and {@code ref},
 * where the {@code ref} must refer to a bean or reference component.
 * 
 * @see BeanMetadata
 * @see ReferenceMetadata
 * @see RefMetadata
 * @ThreadSafe
 * @author $Id: c1f6e5601b1af84122418e0f475f6e0f53cf9cb5 $
 */
@ConsumerType
public interface Target extends NonNullMetadata {
	// marker interface
}
