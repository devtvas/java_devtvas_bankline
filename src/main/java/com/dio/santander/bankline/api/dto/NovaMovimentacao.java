package com.dio.santander.bankline.api.dto;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.dio.santander.bankline.api.model.MovimentacaoTipo;

public class NovaMovimentacao {

	private String descricao;
	
	private Double valor;
	
	private MovimentacaoTipo movimentacaoTipo;
	
	private Integer idConta;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public MovimentacaoTipo getMovimentacaoTipo() {
		return movimentacaoTipo;
	}

	public void setMovimentacaoTipo(MovimentacaoTipo movimentacaoTipo) {
		this.movimentacaoTipo = movimentacaoTipo;
	}

	public Integer getIdConta() {
		return idConta;
	}

	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}
	
	
}
