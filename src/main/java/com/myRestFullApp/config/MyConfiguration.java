package com.myRestFullApp.config;

import java.util.EnumMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.myRestFullApp.context.AppBeanDefinition;
import com.myRestFullApp.cotizacion.interfaces.ICotizacionStrategy;
import com.myRestFullApp.enums.EMoneda;

@Configuration
public class MyConfiguration {
	
    @Autowired 
    @Qualifier(AppBeanDefinition.DOLAR_STRATEGY)
    private ICotizacionStrategy dolarStrategy;
    
    @Autowired 
    @Qualifier(AppBeanDefinition.REAL_STRATEGY)
    private ICotizacionStrategy realStrategy;
    
    @Autowired 
    @Qualifier(AppBeanDefinition.PESOS_STRATEGY)
    private ICotizacionStrategy pesosStrategy;
    
    @Bean
    public Map<EMoneda, ICotizacionStrategy> cotizacionStrategy() {
        Map<EMoneda, ICotizacionStrategy> map = new EnumMap<EMoneda, ICotizacionStrategy>(EMoneda.class);
        map.put(EMoneda.PESOS, pesosStrategy);
        map.put(EMoneda.REAL, realStrategy);
        map.put(EMoneda.DOLAR, dolarStrategy);
        return map;
    }
}

