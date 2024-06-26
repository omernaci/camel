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
package org.apache.camel.component.seda;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 */
public class SedaFromRouteIdTest extends ContextTestSupport {

    @Test
    public void testSedaFromRouteId() throws Exception {
        MockEndpoint foo = getMockEndpoint("mock:foo");
        foo.expectedMessageCount(1);

        MockEndpoint bar = getMockEndpoint("mock:bar");
        bar.expectedMessageCount(1);

        template.sendBody("seda:foo", "Hello World");

        assertMockEndpointsSatisfied();

        assertEquals("foo", foo.getReceivedExchanges().get(0).getFromRouteId());
        assertEquals("seda://foo", foo.getReceivedExchanges().get(0).getFromEndpoint().getEndpointUri());
        assertEquals("bar", bar.getReceivedExchanges().get(0).getFromRouteId());
        assertEquals("seda://bar", bar.getReceivedExchanges().get(0).getFromEndpoint().getEndpointUri());
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("seda:foo").routeId("foo").to("mock:foo").to("seda:bar");

                from("seda:bar").routeId("bar").to("mock:bar");
            }
        };
    }
}
