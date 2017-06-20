package com.myRestFullApp.cotizacion.impl;

import java.nio.file.AccessDeniedException;

import org.springframework.stereotype.Component;

import com.myRestFullApp.context.AppBeanDefinition;
import com.myRestFullApp.cotizacion.interfaces.ICotizacionStrategy;
@Component(AppBeanDefinition.PESOS_STRATEGY)
public class CotizacionPesosStrategy implements ICotizacionStrategy {

	public String darCotizacion() throws AccessDeniedException{
		throw new AccessDeniedException("No se encuentra autorizado para realizar esta operacion");
	}

}
