package com.myRestFullApp.cotizacion.interfaces;

import java.nio.file.AccessDeniedException;

public interface ICotizacionStrategy {
	
	String darCotizacion()throws AccessDeniedException;

}
