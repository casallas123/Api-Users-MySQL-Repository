package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Implementan todos los metodos del servicio
@Service
public class UsuarioServiceImp implements UsuarioService {
	
	@Autowired
	private UsuarioRepositorio repositorio;
	
	@Override
	public List<Usuario> getAllList() {
		return repositorio.findAll();
	}
	
	@Override
	public Usuario add(Usuario p) {
		return repositorio.save(p);	
	}
	
	@Override
	public Usuario getById(long id) {
      return repositorio.findById(id).get();
	}

	@Override
	public Usuario edit(Usuario p) {
		return repositorio.save(p);
	}

	@Override
	public Usuario delete(long id) {
		Usuario p = repositorio.findById(id).get();
		if(p!=null) {
			repositorio.delete(p);
		}
		return p;
	}
}
