package com.fiap.covida.api.model;

import java.time.LocalDateTime;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tab_resposta")
public class Resposta {
	/**
	 * Atributos
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDateTime data_hora;
	private Integer febre;
	private Integer epidemiologica;
	
	@Embedded
	private Sintoma sintoma;
	@Embedded
	private Comorbidade comorbidade;
	
	/**
	 * Gettrs and Settrs 
	 * @return
	 */
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
