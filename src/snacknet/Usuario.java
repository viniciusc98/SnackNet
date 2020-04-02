/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snacknet;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nomeUsuario;
	private int telefone;
	private String email;
	private String login;
        private String senha;
	private final List<TipoPagamento> tipoPagamento;
        
	public Usuario(String nomeUsuario, String login, String senha, TipoPagamento tp ) {
		tipoPagamento = new ArrayList();
	}
	
	public void realizarCompra() {
		
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}


}
