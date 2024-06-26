/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.etcd3;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointSchemaGeneratorMojo")
@SuppressWarnings("unchecked")
public class Etcd3ComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.etcd3.Etcd3Configuration getOrCreateConfiguration(Etcd3Component target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.etcd3.Etcd3Configuration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Etcd3Component target = (Etcd3Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authheaders":
        case "authHeaders": getOrCreateConfiguration(target).setAuthHeaders(property(camelContext, java.util.Map.class, value)); return true;
        case "authority": getOrCreateConfiguration(target).setAuthority(property(camelContext, java.lang.String.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.etcd3.Etcd3Configuration.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": getOrCreateConfiguration(target).setConnectionTimeout(property(camelContext, java.time.Duration.class, value)); return true;
        case "endpoints": getOrCreateConfiguration(target).setEndpoints(property(camelContext, java.lang.String[].class, value)); return true;
        case "fromindex":
        case "fromIndex": getOrCreateConfiguration(target).setFromIndex(property(camelContext, long.class, value)); return true;
        case "headers": getOrCreateConfiguration(target).setHeaders(property(camelContext, java.util.Map.class, value)); return true;
        case "keepalivetime":
        case "keepAliveTime": getOrCreateConfiguration(target).setKeepAliveTime(property(camelContext, java.time.Duration.class, value)); return true;
        case "keepalivetimeout":
        case "keepAliveTimeout": getOrCreateConfiguration(target).setKeepAliveTimeout(property(camelContext, java.time.Duration.class, value)); return true;
        case "keycharset":
        case "keyCharset": getOrCreateConfiguration(target).setKeyCharset(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "loadbalancerpolicy":
        case "loadBalancerPolicy": getOrCreateConfiguration(target).setLoadBalancerPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "maxinboundmessagesize":
        case "maxInboundMessageSize": getOrCreateConfiguration(target).setMaxInboundMessageSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "namespace": getOrCreateConfiguration(target).setNamespace(property(camelContext, java.lang.String.class, value)); return true;
        case "password": getOrCreateConfiguration(target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "prefix": getOrCreateConfiguration(target).setPrefix(property(camelContext, boolean.class, value)); return true;
        case "retrydelay":
        case "retryDelay": getOrCreateConfiguration(target).setRetryDelay(property(camelContext, long.class, value)); return true;
        case "retrymaxdelay":
        case "retryMaxDelay": getOrCreateConfiguration(target).setRetryMaxDelay(property(camelContext, long.class, value)); return true;
        case "retrymaxduration":
        case "retryMaxDuration": getOrCreateConfiguration(target).setRetryMaxDuration(property(camelContext, java.time.Duration.class, value)); return true;
        case "servicepath":
        case "servicePath": getOrCreateConfiguration(target).setServicePath(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontext":
        case "sslContext": getOrCreateConfiguration(target).setSslContext(property(camelContext, io.netty.handler.ssl.SslContext.class, value)); return true;
        case "username":
        case "userName": getOrCreateConfiguration(target).setUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "valuecharset":
        case "valueCharset": getOrCreateConfiguration(target).setValueCharset(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authheaders":
        case "authHeaders": return java.util.Map.class;
        case "authority": return java.lang.String.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "configuration": return org.apache.camel.component.etcd3.Etcd3Configuration.class;
        case "connectiontimeout":
        case "connectionTimeout": return java.time.Duration.class;
        case "endpoints": return java.lang.String[].class;
        case "fromindex":
        case "fromIndex": return long.class;
        case "headers": return java.util.Map.class;
        case "keepalivetime":
        case "keepAliveTime": return java.time.Duration.class;
        case "keepalivetimeout":
        case "keepAliveTimeout": return java.time.Duration.class;
        case "keycharset":
        case "keyCharset": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "loadbalancerpolicy":
        case "loadBalancerPolicy": return java.lang.String.class;
        case "maxinboundmessagesize":
        case "maxInboundMessageSize": return java.lang.Integer.class;
        case "namespace": return java.lang.String.class;
        case "password": return java.lang.String.class;
        case "prefix": return boolean.class;
        case "retrydelay":
        case "retryDelay": return long.class;
        case "retrymaxdelay":
        case "retryMaxDelay": return long.class;
        case "retrymaxduration":
        case "retryMaxDuration": return java.time.Duration.class;
        case "servicepath":
        case "servicePath": return java.lang.String.class;
        case "sslcontext":
        case "sslContext": return io.netty.handler.ssl.SslContext.class;
        case "username":
        case "userName": return java.lang.String.class;
        case "valuecharset":
        case "valueCharset": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        Etcd3Component target = (Etcd3Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authheaders":
        case "authHeaders": return getOrCreateConfiguration(target).getAuthHeaders();
        case "authority": return getOrCreateConfiguration(target).getAuthority();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "configuration": return target.getConfiguration();
        case "connectiontimeout":
        case "connectionTimeout": return getOrCreateConfiguration(target).getConnectionTimeout();
        case "endpoints": return getOrCreateConfiguration(target).getEndpoints();
        case "fromindex":
        case "fromIndex": return getOrCreateConfiguration(target).getFromIndex();
        case "headers": return getOrCreateConfiguration(target).getHeaders();
        case "keepalivetime":
        case "keepAliveTime": return getOrCreateConfiguration(target).getKeepAliveTime();
        case "keepalivetimeout":
        case "keepAliveTimeout": return getOrCreateConfiguration(target).getKeepAliveTimeout();
        case "keycharset":
        case "keyCharset": return getOrCreateConfiguration(target).getKeyCharset();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "loadbalancerpolicy":
        case "loadBalancerPolicy": return getOrCreateConfiguration(target).getLoadBalancerPolicy();
        case "maxinboundmessagesize":
        case "maxInboundMessageSize": return getOrCreateConfiguration(target).getMaxInboundMessageSize();
        case "namespace": return getOrCreateConfiguration(target).getNamespace();
        case "password": return getOrCreateConfiguration(target).getPassword();
        case "prefix": return getOrCreateConfiguration(target).isPrefix();
        case "retrydelay":
        case "retryDelay": return getOrCreateConfiguration(target).getRetryDelay();
        case "retrymaxdelay":
        case "retryMaxDelay": return getOrCreateConfiguration(target).getRetryMaxDelay();
        case "retrymaxduration":
        case "retryMaxDuration": return getOrCreateConfiguration(target).getRetryMaxDuration();
        case "servicepath":
        case "servicePath": return getOrCreateConfiguration(target).getServicePath();
        case "sslcontext":
        case "sslContext": return getOrCreateConfiguration(target).getSslContext();
        case "username":
        case "userName": return getOrCreateConfiguration(target).getUserName();
        case "valuecharset":
        case "valueCharset": return getOrCreateConfiguration(target).getValueCharset();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authheaders":
        case "authHeaders": return java.lang.String.class;
        case "headers": return java.lang.String.class;
        default: return null;
        }
    }
}

