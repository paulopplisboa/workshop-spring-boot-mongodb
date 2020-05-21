package com.Paulo.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Paulo.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {
	
	@RequestMapping(method = RequestMethod.GET)
	//@GetMapping em alternativa a linha de cima (serve para indivar que se trata de método GET -pedido
	public ResponseEntity<List<User>> findAll(){ // ResponseEntity serve para encapsular a lista e devolver
		// um objecto já com cabeçalho html possiveis erros etc
		
		User maria = new User("1", "Maria Silva", "maria@gmail.com");
		User manuela = new User("2", "Manuela Cunha", "manuela@gmail.com");
		
		List<User> lista = new ArrayList<>();
		lista.add(maria);
		lista.add(manuela);
		//lista.addAll(Arrays.asList(maria,manuela)); outra forma de adicionar Users na lista
		//return lista;
		return ResponseEntity.ok().body(lista);// devolve a lista no corpo da resposta
	}
	

}
