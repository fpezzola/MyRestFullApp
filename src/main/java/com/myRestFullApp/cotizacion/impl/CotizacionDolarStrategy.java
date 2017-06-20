package com.myRestFullApp.cotizacion.impl;

import java.nio.file.AccessDeniedException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myRestFullApp.business.interfaces.IDolarBusiness;
import com.myRestFullApp.context.AppBeanDefinition;
import com.myRestFullApp.cotizacion.interfaces.ICotizacionStrategy;
@Component(AppBeanDefinition.DOLAR_STRATEGY)
public class CotizacionDolarStrategy implements ICotizacionStrategy {
	
	@Autowired
	private IDolarBusiness business;

	public String darCotizacion() throws AccessDeniedException{
		return business.darCotizacion();
	}

}
