package com.myRestFullApp.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myRestFullApp.business.interfaces.IDolarBusiness;
import com.myRestFullApp.repository.interfaces.IDolarWDAO;

@Component
public class DolarBusiness implements IDolarBusiness {
	
	@Autowired
	private IDolarWDAO wdao;

	public String darCotizacion() {
		return wdao.darCotizacion();
	}

}
