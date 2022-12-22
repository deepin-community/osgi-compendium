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

import java.util.List;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * Metadata for a Map based value.
 * 
 * <p>
 * This is specified by the {@code map} element.
 * 
 * @ThreadSafe
 * @author $Id: 8636f9875e3ab1c0d03d2aeb6abb31cfcf4f48ac $
 */
@ConsumerType
public interface MapMetadata extends NonNullMetadata {
	/**
	 * Return the name of the type of the map keys.
	 * 
	 * This is specified by the {@code key-type} attribute of the map.
	 * 
	 * @return The name of the type of the map keys, or {@code null} if none is
	 *         specified.
	 */
	String getKeyType();

	/**
	 * Return the name of the type of the map values.
	 * 
	 * This is specified by the {@code value-type} attribute of the map.
	 * 
	 * @return The name of the type of the map values, or {@code null} if none
	 *         is specified.
	 */
	String getValueType();

	/**
	 * Return the entries for the map.
	 * 
	 * @return An immutable List of {@link MapEntry} objects for each entry in
	 *         the map. The List is empty if no entries are specified for the
	 *         map.
	 */
	List<MapEntry> getEntries();
}
