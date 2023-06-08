package com.fiap.covida.api.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiap.covida.api.dto.NovaResposta;
import com.fiap.covida.api.model.Resposta;
import com.fiap.covida.api.repository.RespostaRepository;

@Service
public class RespostaService {
	
	@Autowired
	private RespostaRepository repository;
	public void save(NovaResposta novaResposta) {
		Resposta resposta = new Resposta();
		
		resposta.setData_hora(LocalDateTime.now());
		resposta.setFebre(novaResposta.getFebre());
		resposta.setEpidemiologica(novaResposta.getEpidemiologica());
		resposta.setSintoma(novaResposta.getSintoma());
		resposta.setComorbidade(novaResposta.getComorbidade());
		
		repository.save(resposta);
		
	}
}
