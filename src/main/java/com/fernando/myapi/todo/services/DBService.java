package com.fernando.myapi.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernando.myapi.todo.domain.Todo;
import com.fernando.myapi.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository repository;
	
	public void instanciaBaseDados() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Angular 11", sdf.parse("25/03/2022"), false);
		
		Todo t2 = new Todo(null, "Ler", "Ler Livro de Desenvolvimento pessaol", sdf.parse("12/07/2022"), true);
		
		Todo t3 = new Todo(null, "Exercicios", "Praticar exercicios fisicos", sdf.parse("13/07/2022"), false);
		
		Todo t4 = new Todo(null, "Meditar", "Meditar durante 30 minutos pela manhã", sdf.parse("19/07/2022"), true);
		
		repository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}
}
