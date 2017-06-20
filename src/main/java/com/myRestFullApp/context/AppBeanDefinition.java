package com.myRestFullApp.context;

public interface AppBeanDefinition {
	
	//business
	public static final String DOLAR_BUSINESS = "DolarBusiness";
	
	//strategy
	public static final String DOLAR_STRATEGY = "CotizacionDolarStrategy";
	public static final String PESOS_STRATEGY = "CotizacionPesosStrategy";
	public static final String REAL_STRATEGY = "CotizacionRealStrategy";

}
