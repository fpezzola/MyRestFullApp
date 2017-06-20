package com.myRestFullApp.repository.wdao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.myRestFullApp.repository.interfaces.IDolarWDAO;

@Repository
public class DolarWDAO implements IDolarWDAO{
	
	@Value("${dolar.uri}")
	private String dolarUri;

	public String darCotizacion() {
		RestTemplate restTemplate = new RestTemplate();
        String cotizacion = restTemplate.getForObject(dolarUri, String.class);
        return cotizacion;
	}

}
