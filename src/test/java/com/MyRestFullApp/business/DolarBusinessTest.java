package com.MyRestFullApp.business;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.myRestFullApp.Application;
import com.myRestFullApp.business.interfaces.IDolarBusiness;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class DolarBusinessTest {
	
	@Autowired
	private IDolarBusiness dBusiness;
	@Test
	public void testCotizacion(){
		String cotizacion = dBusiness.darCotizacion();
		assertThat(cotizacion).isNotNull();
	}
	

}
