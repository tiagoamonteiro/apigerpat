package br.com.navita.apigerpat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.navita.apigerpat.models.Patrimonio;
import br.com.navita.apigerpat.repository.PatrimonioRepository;

@RestController
@RequestMapping("/api")
public class PatrimonioController {
	
	@Autowired
	PatrimonioRepository patrimonioRepository;
	
	@GetMapping("/patrimonios")
	public List<Patrimonio> listarPatrimonios(){
		return patrimonioRepository.findAll();
	}
	
	@GetMapping("/patrimonio/{id}")
	public Patrimonio buscarPatrimonioId(@PathVariable("id") long id) {
		return patrimonioRepository.findById(id);
	}
	
	@PostMapping("/patrimonio")
	public Patrimonio registrarPatrimonio(@RequestBody Patrimonio patrimonio) {
		return patrimonioRepository.save(patrimonio);
	}
	
	@DeleteMapping("/patrimonio")
	public void deletaPatrimonio(@RequestBody Patrimonio patrimonio){
		patrimonioRepository.delete(patrimonio);
	}
	
	@PutMapping("/patrimonio")
	public Patrimonio atualizaPatrimonio(@RequestBody Patrimonio patrimonio) {
		return patrimonioRepository.save(patrimonio);
	}
}
