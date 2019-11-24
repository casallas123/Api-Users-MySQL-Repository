package com.example.demo;

import java.util.List;


//Metodos para el proyecto crud
public interface UsuarioService {
	public List <Usuario> getAllList();
    public Usuario getById(long id);
    Usuario add(Usuario p);
	Usuario edit(Usuario p);
	Usuario delete(long id);
}