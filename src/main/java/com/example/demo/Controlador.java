package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Direcciona directamente al proyecto front
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({ "/usuario" }) // Mapping principal del puerto 8080

public class Controlador {
	@Autowired
	UsuarioService service;

	@GetMapping
	public List<Usuario> getList() {
		return service.getAllList();
	}

	@GetMapping(path = "/{id}")
	public Usuario getById(@PathVariable("id") long id) {
		return service.getById(id);
	}

	@PutMapping(path = { "/{id}" })
	public Usuario editar(@RequestBody Usuario p, @PathVariable("id") long id) {
		p.setIdusuarios(id);
		return service.edit(p);
	}

	@PostMapping
	public Usuario agregar(@RequestBody Usuario p) {
	    p.setIdusuarios(null);
		return service.add(p);
	}
	
	@DeleteMapping(path = { "/{id}" })
	public void delete(@PathVariable("id")long id) {
		service.delete(id);		
	}
	

}
