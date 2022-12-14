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

import java.lang.reflect.Type;

import org.osgi.util.function.Function;

/**
 * @author $Id: d5cd46ce2bbeb377b37200d89f4076451a7cf01a $
 */
class FunctioningImpl extends AbstractSpecifying<Functioning>
		implements Functioning {
	InternalConverter converter;

	FunctioningImpl(InternalConverter converterImpl) {
		converter = converterImpl;
	}

	@Override
	public <T> Function<Object,T> to(Class<T> cls) {
		Type type = cls;
		return to(type);
	}

	@Override
	public <T> Function<Object,T> to(TypeReference<T> ref) {
		return to(ref.getType());
	}

	@Override
	public <T> Function<Object,T> to(final Type type) {
		return new Function<Object,T>() {
			@Override
			public T apply(Object t) {
				InternalConverting ic = converter.convert(t);
				return applyModifiers(ic).to(type);
			}
		};
	}

	InternalConverting applyModifiers(InternalConverting ic) {
		if (hasDefault)
			ic.defaultValue(defaultValue);
		if (liveView)
			ic.view();
		if (keysIgnoreCase)
			ic.keysIgnoreCase();
		if (sourceAsClass != null)
			ic.sourceAs(sourceAsClass);
		if (sourceAsDTO)
			ic.sourceAsDTO();
		if (sourceAsJavaBean)
			ic.sourceAsBean();
		if (targetAsClass != null)
			ic.targetAs(targetAsClass);
		if (targetAsDTO)
			ic.targetAsBean();
		if (targetAsJavaBean)
			ic.targetAsBean();

		return ic;
	}
}
