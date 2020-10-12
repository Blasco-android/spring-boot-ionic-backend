package com.blascoweb.cursomc.domain;

import javax.persistence.Entity;

import com.blascoweb.cursomc.domain.enums.StatusPagamento;

@Entity
public class PagamentoComCartao extends Pagamento{
	private static final long serialVersionUID = 1L;
	
	private Integer parcelas;
	
	public PagamentoComCartao() {
		
	}

	public PagamentoComCartao(Integer id, StatusPagamento statusPagamento, Pedido pedido, Integer parcelas) {
		super(id, statusPagamento, pedido);
		this.parcelas = parcelas;
	}

	public Integer getParcelas() {
		return parcelas;
	}

	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}
	
	

}
