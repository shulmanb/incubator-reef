/**
 * Copyright (C) 2014 Microsoft Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.microsoft.reef.webserver;

import com.microsoft.tang.formats.ConfigurationModule;
import com.microsoft.tang.formats.ConfigurationModuleBuilder;
import com.microsoft.wake.time.Clock;

/**
 * Configuration Module Builder for HttpRuntime
 */
public final class HttpRuntimeConfiguration extends ConfigurationModuleBuilder {

    /**
     *  HttpRuntimeConfiguration
     */
    public static final ConfigurationModule CONF = new HttpRuntimeConfiguration()
        .bindSetEntry(Clock.RuntimeStartHandler.class, HttpRuntimeStartHandler.class)
        .bindSetEntry(Clock.RuntimeStopHandler.class, HttpRuntimeStopHandler.class)
        .build();
}
