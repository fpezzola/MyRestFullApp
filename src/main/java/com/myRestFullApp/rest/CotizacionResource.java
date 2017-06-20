package com.myRestFullApp.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.myRestFullApp.cotizacion.interfaces.ICotizacionStrategy;
import com.myRestFullApp.enums.EMoneda;

@RestController
@RequestMapping("/Cotizacion")
public class CotizacionResource {
	

	@Autowired
	private Map<EMoneda, ICotizacionStrategy> strategies;
	
	@RequestMapping(path="/{moneda}",method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<String> cotizacion(@PathVariable("moneda")String moneda)throws Exception{
		EMoneda currency = EMoneda.valueOf(moneda.toUpperCase());
		return ResponseEntity.ok(strategies.get(currency).darCotizacion());
	}
	
}
