/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.pulsar.functions.api.metrics;

/**
 * Interface for building a {@link Gauge} metric to register. The caller can optionally provide an external gauge to
 * register. If no gauge is provided, a default gauge implementation will be built and returned for use.
 */
public interface GaugeBuilder extends MetricBuilder<GaugeBuilder, Gauge> {

    /**
     * Optionally supply a gauge metric to register. If no gauge is provided, a default implementation will be used.
     * @param gauge the gauge to register
     * @return {@code GaugeBuilder}
     */
    GaugeBuilder gauge(Gauge gauge);

}
