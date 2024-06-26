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
package org.apache.camel.component.kamelet;

import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KameletLocalBeanInitDestroyTest extends CamelTestSupport {

    private static final AtomicBoolean CLOSED = new AtomicBoolean();

    @Test
    public void testOne() throws Exception {
        getMockEndpoint("mock:result").expectedBodiesReceived("Hi John we are going to Joes");

        template.sendBody("direct:start", "John");

        MockEndpoint.assertIsSatisfied(context);

        context.stop();

        Assertions.assertTrue(CLOSED.get(), "Should call destroy method on local bean");
    }

    // **********************************************
    //
    // test set-up
    //
    // **********************************************

    @Override
    protected RoutesBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                routeTemplate("whereTo")
                        .templateBean("myBar").typeClass(MyBar.class).initMethod("startupMe").destroyMethod("destroyMe").end()
                        .from("kamelet:source")
                        // must use {{myBar}} to refer to the local bean
                        .to("bean:{{myBar}}");

                from("direct:start")
                        .kamelet("whereTo")
                        .to("mock:result");
            }
        };
    }

    public static class MyBar {

        private String bar;

        public void startupMe() {
            this.bar = "Joes";
        }

        public void destroyMe() {
            this.bar = "closed";
            CLOSED.set(true);
        }

        public String where(String name) {
            return "Hi " + name + " we are going to " + bar;
        }
    }
}
