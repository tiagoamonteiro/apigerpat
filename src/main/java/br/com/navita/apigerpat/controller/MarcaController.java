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

import br.com.navita.apigerpat.models.Marca;
import br.com.navita.apigerpat.repository.MarcaRepository;

@RestController
@RequestMapping("/api")
public class MarcaController {
	
	@Autowired
	public MarcaRepository marcaRepository;
	

	@GetMapping("/marcas")
	public List<Marca> listarMarcas(){
		return marcaRepository.findAll();
	}
	
	@GetMapping("/marca/{id}")
	public Marca buscarMarcaId(@PathVariable("id") long id) {
		return marcaRepository.findById(id);
	}
	
	@PostMapping("/marca")
	public Marca registrarMarca(@RequestBody Marca marca) {
		return marcaRepository.save(marca);
	}
	
	@DeleteMapping("/marca")
	public void deletarMarca(@RequestBody Marca marca){
		marcaRepository.delete(marca);
	}
	
	@PutMapping("/marca")
	public Marca atualizarMarca(@RequestBody Marca marca) {
		return marcaRepository.save(marca);
	}
}
