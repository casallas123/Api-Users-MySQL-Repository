package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Usuario;

//Metodos para el proyecto crud
public interface UsuarioService {
	public List <Usuario> getAllList();
    public Usuario getById(long id);
    Usuario add(Usuario p);
	Usuario edit(Usuario p);
	Usuario delete(long id);
}