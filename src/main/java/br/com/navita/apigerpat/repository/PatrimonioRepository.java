package br.com.navita.apigerpat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.navita.apigerpat.models.Patrimonio;

public interface PatrimonioRepository extends JpaRepository<Patrimonio, Long>{

	Patrimonio findById(long id);
}
