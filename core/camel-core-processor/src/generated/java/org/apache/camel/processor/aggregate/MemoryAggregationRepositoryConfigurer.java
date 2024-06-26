/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.processor.aggregate;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.processor.aggregate.MemoryAggregationRepository;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateConfigurerMojo")
@SuppressWarnings("unchecked")
public class MemoryAggregationRepositoryConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.processor.aggregate.MemoryAggregationRepository target = (org.apache.camel.processor.aggregate.MemoryAggregationRepository) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "optimisticlocking":
        case "optimisticLocking": target.setOptimisticLocking(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "optimisticlocking":
        case "optimisticLocking": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.processor.aggregate.MemoryAggregationRepository target = (org.apache.camel.processor.aggregate.MemoryAggregationRepository) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "optimisticlocking":
        case "optimisticLocking": return target.isOptimisticLocking();
        default: return null;
        }
    }
}

