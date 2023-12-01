package com.willgdj.JavaWeb.recursos;

import com.willgdj.JavaWeb.entidade.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioRecurso {

    @GetMapping
    public ResponseEntity<Usuario> findAll(){
        Usuario u = new Usuario(1L, "Maria", "maria@gmail.com", "9123456789", "123456");
        return ResponseEntity.ok().body(u);
    }
}
