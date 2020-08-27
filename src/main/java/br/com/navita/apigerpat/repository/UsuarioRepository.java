package br.com.navita.apigerpat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.navita.apigerpat.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Usuario findByEmail(String email);

}
