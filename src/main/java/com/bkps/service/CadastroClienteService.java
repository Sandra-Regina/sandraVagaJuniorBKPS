package com.bkps.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.bkps.model.Cliente;
import com.bkps.repository.Clientes;
import com.bkps.util.Transacional;

public class CadastroClienteService implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private Clientes clientes;
	
	@Transacional
	public void salvar(Cliente cliente) {
		clientes.guardar(cliente);
	}
	
	@Transacional
	public void excluir(Cliente cliente) {
		clientes.remover(cliente);
	}
}
