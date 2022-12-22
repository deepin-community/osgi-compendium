/*
 * Copyright (c) OSGi Alliance (2018). All Rights Reserved.
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
 * Configurator Annotations Package Version 1.0.
 * <p>
 * This package contains annotations that can be used to require the
 * Configurator extender.
 * <p>
 * Bundles should not normally need to import this package as the annotations
 * are only used at build-time.
 * 
 * @author $Id: 5f545e7b8a4a5d2d33db6ed58eb0b1bc9fb5ec15 $
 */

@Version(CONFIGURATOR_SPECIFICATION_VERSION)
package org.osgi.service.configurator.annotations;

import static org.osgi.service.configurator.ConfiguratorConstants.CONFIGURATOR_SPECIFICATION_VERSION;

import org.osgi.annotation.versioning.Version;

