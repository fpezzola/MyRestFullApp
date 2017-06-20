package com.myRestFullApp.enums;

import com.myRestFullApp.cotizacion.impl.CotizacionDolarStrategy;
import com.myRestFullApp.cotizacion.impl.CotizacionPesosStrategy;
import com.myRestFullApp.cotizacion.impl.CotizacionRealStrategy;
import com.myRestFullApp.cotizacion.interfaces.ICotizacionStrategy;

public enum EMoneda {
	
	DOLAR("Dolar",new CotizacionDolarStrategy()),
	PESOS("Pesos",new CotizacionPesosStrategy()),
	REAL("Real", new CotizacionRealStrategy());
	
	String name;
	ICotizacionStrategy strategy;
	private EMoneda(String name, ICotizacionStrategy strategy) {
		this.name = name;
		this.strategy = strategy;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public ICotizacionStrategy getStrategy() {
		return strategy;
	}
	public void setStrategy(ICotizacionStrategy strategy) {
		this.strategy = strategy;
	}
	
	

}
