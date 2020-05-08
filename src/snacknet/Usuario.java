/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snacknet;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {
        private String nomeUsuario;
	private int telefone;
	private String email;
	private String login;
        private String senha;

    //Retorna um uma apresentação textual do objeto    
    @Override
    public String toString() {
        return "Usuario{" + "nomeUsuario=" + nomeUsuario + ", email=" + email + ", login=" + login + ", senha=" + senha + '}';
    }

    //O HashCode gera um número único para os atributos serem salvos na memória
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.login);
        hash = 89 * hash + Objects.hashCode(this.senha);
        return hash;
    }

    //Compara os valores dos atributos, para verificar se são iguais na memória
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        return true;
    }
	
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
