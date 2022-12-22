/*
 * Copyright (c) OSGi Alliance (2012, 2017). All Rights Reserved.
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

package org.osgi.service.http.runtime.dto;

/**
 * Represents a {@code javax.servlet.Servlet} for handling errors and currently
 * being used by a servlet context.
 *
 * @NotThreadSafe
 * @author $Id: 19baaa9c3b30514d63a6203d8b1a05930ec3b92b $
 */
public class ErrorPageDTO extends BaseServletDTO {
	/**
	 * The exceptions the error page is used for. This array might be
	 * empty.
	 */
	public String[]	exceptions;

	/**
	 * The error codes the error page is used for. This array might be
	 * empty.
	 */
	public long[]	errorCodes;
}
