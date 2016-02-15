/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.cache.query;

import javax.cache.Cache;
import javax.cache.event.CacheEntryEvent;
import javax.cache.event.EventType;

/**
 * A Cache continuous query entry event.
 *
 * @param <K> the type of key
 * @param <V> the type of value
 */
public abstract class CacheQueryEntryEvent<K, V> extends CacheEntryEvent<K, V> {
    /**
     * Constructs a cache entry event from a given cache as source.
     *
     * @param source the cache that originated the event
     * @param eventType Event type.
     */
    public CacheQueryEntryEvent(Cache source, EventType eventType) {
        super(source, eventType);
    }

    /**
     * On each update occurred to increment counter. For
     *
     * @return Value of counter for this event.
     */
    public abstract long getPartitionUpdateCounter();
}