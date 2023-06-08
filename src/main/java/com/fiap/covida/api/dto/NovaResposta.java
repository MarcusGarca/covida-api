package com.fiap.covida.api.dto;

import java.time.LocalDateTime;

import com.fiap.covida.api.model.Comorbidade;
import com.fiap.covida.api.model.Sintoma;

public class NovaResposta {
	/**
	 * Atributos
	 */
	private LocalDateTime data_hora;
	private Integer febre;
	private Integer epidemiologica;
	private Sintoma sintoma;
	private Comorbidade comorbidade;
	
	/**
	 * Gettrs e Settrs
	 * @return
	 */
	public LocalDateTime getData_hora() {
		return data_hora;
	}
	public void setData_hora(LocalDateTime data_hora) {
		this.data_hora = data_hora;
	}
	public Integer getFebre() {
		return febre;
	}
	public void setFebre(Integer febre) {
		this.febre = febre;
	}
	public Integer getEpidemiologica() {
		return epidemiologica;
	}
	public void setEpidemiologica(Integer epidemiologica) {
		this.epidemiologica = epidemiologica;
	}
	public Sintoma getSintoma() {
		return sintoma;
	}
	public void setSintoma(Sintoma sintoma) {
		this.sintoma = sintoma;
	}
	public Comorbidade getComorbidade() {
		return comorbidade;
	}
	public void setComorbidade(Comorbidade comorbidade) {
		this.comorbidade = comorbidade;
	}
	
	
}
