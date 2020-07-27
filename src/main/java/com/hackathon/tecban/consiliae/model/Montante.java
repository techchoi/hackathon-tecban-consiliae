package com.hackathon.tecban.consiliae.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Montante {
	
	@Id
	private String id;
	private int montante;
	private String moedaCorrente;

	public int getMontante() {
		return montante;
	}

	public void setMontante(int montante) {
		this.montante = montante;
	}

	public String getMoedaCorrente() {
		return moedaCorrente;
	}

	public void setMoedaCorrente(String moedaCorrente) {
		this.moedaCorrente = moedaCorrente;
	}

}
