package com.example.demo;

import java.util.List;
import org.springframework.data.jpa.repository.*;

//Metodos de Spring que tambien se pueden usar crud

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

}
