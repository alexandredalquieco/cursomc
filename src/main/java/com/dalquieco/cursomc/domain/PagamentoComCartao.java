package com.dalquieco.cursomc.domain;

import javax.persistence.Entity;

import com.dalquieco.cursomc.domain.enums.TipoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento{
	
	private static final long serialVersionUID = 1L;
	
	private Integer numeroDeParcelas;
	
	public PagamentoComCartao() {
		
	}

	public PagamentoComCartao(Integer id, TipoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estado, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}

	
}
