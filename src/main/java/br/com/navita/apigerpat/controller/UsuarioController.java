package br.com.navita.apigerpat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.navita.apigerpat.models.Usuario;
import br.com.navita.apigerpat.repository.UsuarioRepository;

@RestController
@RequestMapping("/api")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@PostMapping("/usuario")
	public Usuario registraUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
}
