/*
 * Copyright (c) OSGi Alliance (2016, 2017). All Rights Reserved.
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
package org.osgi.service.transaction.control;

import org.osgi.annotation.versioning.ProviderType;

/**
 * An Exception indicating that the active transaction was unexpectedly rolled
 * back
 */
@ProviderType
public class TransactionRolledBackException extends TransactionException {

	/**
	 * Create a new {@link TransactionRolledBackException} with the supplied
	 * message
	 * 
	 * @param message
	 */
	public TransactionRolledBackException(String message) {
		super(message);
	}

	/**
	 * Create a new {@link TransactionRolledBackException} with the supplied
	 * message
	 * 
	 * @param cause
	 * @param message
	 */
	public TransactionRolledBackException(String message, Throwable cause) {
		super(message, cause);

	}

	private static final long serialVersionUID = -4144455511452441543L;

}