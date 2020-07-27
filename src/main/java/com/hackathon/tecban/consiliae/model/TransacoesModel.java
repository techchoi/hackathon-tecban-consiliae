package com.hackathon.tecban.consiliae.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TransacoesModel {
	
	
	private String horarioTransacao;
	
	private Montante  montante;
	
	private String status;
	
	private String tipoTransacao;

	public String getHorarioTransacao() {
		return horarioTransacao;
	}

	public void setHorarioTransacao(String horarioTransacao) {
		this.horarioTransacao = horarioTransacao;
	}

	public Montante getMontante() {
		return montante;
	}

	public void setMontante(Montante montante) {
		this.montante = montante;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTipoTransacao() {
		return tipoTransacao;
	}

	public void setTipoTransacao(String tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	} 
	
	

}
