package com.dalquieco.cursomc.domain.enums;

public enum TipoPagamento {
	
	PENDENTE (100, "Pendente"),
	QUITADO (200, "Quitado"),
	CANCELADO (300, "Cancelado");
	
	private int cod;
	private String descricao;
	
	private TipoPagamento (int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoPagamento toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		for (TipoPagamento x : TipoPagamento.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id invalido:" + cod);
	}
}
