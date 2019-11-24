package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.*;
import com.example.demo.model.Usuario;

//Metodos de Spring que tambien se pueden usar crud

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

}
