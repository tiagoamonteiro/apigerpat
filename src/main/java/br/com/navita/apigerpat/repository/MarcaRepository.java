package br.com.navita.apigerpat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.navita.apigerpat.models.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long>{

	Marca findById(long id);
}