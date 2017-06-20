package com.MyRestFullApp.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.myRestFullApp.Application;
import com.myRestFullApp.domain.user.User;
import com.myRestFullApp.service.interfaces.IUserService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class UserServiceTest {
	
	 @Autowired
	 private IUserService userService;
	 
	 /**
	  * Test save del usuario
	  */
	 @Test
	 public void testGuardar(){
		 User user = userService.save(new User("Facundo", "Pezzola", "123", "facupezzola@gmail.com"));
		 assertThat(user).isNotNull();
		 userService.delete(user);
	 }
	 
	 /**
	  * Guardo un usuario asi el find no devuelve vacio.
	  * Luego elimino el usuario.
	  */
	 @Test
	 public void testFind(){
		 User user = userService.save(new User("Facundo", "Pezzola", "123", "facupezzola@gmail.com"));
		 Collection<User> usuarios = userService.findAll();
		 assertThat(usuarios).isNotEmpty();
		 userService.delete(user);
	 }
	 
	 /**
	  * Guardo un usuario. 
	  * Lo busco por id y verifico que lo haya encontrado.
	  * 
	  */
	 @Test
	 public void testFindById(){
		 User user = userService.save(new User("Facundo", "Pezzola", "123", "facupezzola@gmail.com"));
		 User user2 = userService.findById(user.getId());
		 assertThat(user.getId()).isEqualTo(user2.getId());
		 userService.delete(user);
	 }
	 
	 /**
	  * Guardo un usuario. 
	  * Le cambio el nombre y lo updateo. Lo busco y erifico que haya actualizado el nombre.
	  * 
	  */
	 @Test
	 public void testUpdate(){
		 User user = userService.save(new User("Facundo", "Pezzola", "123", "facupezzola@gmail.com"));
		 user.setNombre("Marcelo");
		 user = userService.update(user);
		 user = userService.findById(user.getId());
		 assertThat(user.getNombre()).isEqualTo("Marcelo");
		 userService.delete(user);
	 }

}
