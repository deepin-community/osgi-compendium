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

package org.osgi.util.converter;

/**
 * This interface is the same as the {@link Converting} interface with the
 * addition that the current converter (which may include custom rules) can be
 * set on it. This allows the converter to be re-entrant and use itself for
 * sub-conversions if applicable.
 * 
 * @author $Id: 592ad93588739fafe640b01b85989a083b13d439 $
 */
interface InternalConverting extends Converting {
	/**
	 * Set the current converter.
	 * 
	 * @param c The current converter.
	 */
	void setConverter(Converter c);
}
