package com.example.algamoney.api.repository.filter;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class LancamentoFilter {

	//Aqui eu decidi que irei fazer os filtros dos lancamento pela descricao, datavencimentode, datavencimentoate.
	
	private String descricao;
	
	@DateTimeFormat(pattern= "yyyy-DD-mm")
	private LocalDate dataVencimentoDe;
	
	@DateTimeFormat(pattern= "yyyy-DD-mm")
	private LocalDate dataVencimentoAte;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getDataVencimentoDe() {
		return dataVencimentoDe;
	}
	public void setDataVencimentoDe(LocalDate dataVencimentoDe) {
		this.dataVencimentoDe = dataVencimentoDe;
	}
	public LocalDate getDataVencimentoAte() {
		return dataVencimentoAte;
	}
	public void setDataVencimentoAte(LocalDate dataVencimentoAte) {
		this.dataVencimentoAte = dataVencimentoAte;
	}
	
	
}
