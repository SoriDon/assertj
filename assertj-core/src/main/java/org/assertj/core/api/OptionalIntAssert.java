/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2024 the original author or authors.
 */
package org.assertj.core.api;

import java.util.OptionalInt;

/**
 * Assertions for {@link java.util.OptionalInt}.
 *
 * @author Jean-Christophe Gay
 * @author Alexander Bischof
 */
public class OptionalIntAssert extends AbstractOptionalIntAssert<OptionalIntAssert> {

  protected OptionalIntAssert(OptionalInt actual) {
    super(actual, OptionalIntAssert.class);
  }
}
