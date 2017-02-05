package com.bkps.model;

public enum TipoCliente {

	FUNCIONARIO("Funcionario"),
	FORNECEDOR("Fornecedor"),
	CLIENTE("Cliente");
	
	private String tipoCliente;
	
	private TipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	
}
