/*
 * Copyright (c) OSGi Alliance (2010, 2018). All Rights Reserved.
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

/**
 * Http Whiteboard Annotations Package Version 1.1.
 * <p>
 * This package contains annotations that can be used to require the Http
 * Whiteboard implementation.
 * <p>
 * Bundles should not normally need to import this package as the annotations
 * are only used at build-time.
 * <p>
 * 
 * @author $Id: 815c6fc1ea54e80dbf8db2553a6695d44ae5f633 $
 */

@Version(HTTP_WHITEBOARD_SPECIFICATION_VERSION)
package org.osgi.service.http.whiteboard.annotations;

import static org.osgi.service.http.whiteboard.HttpWhiteboardConstants.HTTP_WHITEBOARD_SPECIFICATION_VERSION;

import org.osgi.annotation.versioning.Version;

