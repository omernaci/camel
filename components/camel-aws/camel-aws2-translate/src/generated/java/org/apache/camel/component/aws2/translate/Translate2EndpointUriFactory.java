/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.translate;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class Translate2EndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":label";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(22);
        props.add("accessKey");
        props.add("autodetectSourceLanguage");
        props.add("label");
        props.add("lazyStartProducer");
        props.add("operation");
        props.add("overrideEndpoint");
        props.add("pojoRequest");
        props.add("profileCredentialsName");
        props.add("proxyHost");
        props.add("proxyPort");
        props.add("proxyProtocol");
        props.add("region");
        props.add("secretKey");
        props.add("sessionToken");
        props.add("sourceLanguage");
        props.add("targetLanguage");
        props.add("translateClient");
        props.add("trustAllCertificates");
        props.add("uriEndpointOverride");
        props.add("useDefaultCredentialsProvider");
        props.add("useProfileCredentialsProvider");
        props.add("useSessionCredentials");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(3);
        secretProps.add("accessKey");
        secretProps.add("secretKey");
        secretProps.add("sessionToken");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
        MULTI_VALUE_PREFIXES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "aws2-translate".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "label", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public Set<String> multiValuePrefixes() {
        return MULTI_VALUE_PREFIXES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

