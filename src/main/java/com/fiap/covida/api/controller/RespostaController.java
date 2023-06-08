package com.fiap.covida.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.covida.api.dto.NovaResposta;
import com.fiap.covida.api.model.Resposta;
import com.fiap.covida.api.repository.RespostaRepository;
import com.fiap.covida.api.service.RespostaService;




@RestController
@RequestMapping("/respostas")


public class RespostaController {
	
	@Autowired
	private RespostaRepository repository;
	
	@Autowired
	private RespostaService service;
	
	@GetMapping
	public List<Resposta> findAll(){
		return repository.findAll();
	}
	
	
	@PostMapping
	public void save(@RequestBody NovaResposta resposta) {
		service.save(resposta);
	}
}
