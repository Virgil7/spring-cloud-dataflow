/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.acme.boot13;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Eric Bottard
 */
@ConfigurationProperties("boot13")
public class MyConfigProperties13 {

	private AnotherEnumClass13 level;

	public AnotherEnumClass13 getLevel() {
		return level;
	}

	public void setLevel(AnotherEnumClass13 level) {
		this.level = level;
	}
}
