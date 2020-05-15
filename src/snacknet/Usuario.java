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

    //Método para realização da construção da classe
    public Usuario(String nomeUsuario, int telefone, String email, String login, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.telefone = telefone;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    //Retorna um uma apresentação textual do objeto    
    @Override
    public String toString() {
        return "Usuario{" + "nomeUsuario=" + getNomeUsuario() + ", email=" + getEmail() + ", login=" + getLogin() + ", senha=" + getSenha() + '}';
    }

    //O HashCode gera um número único para os atributos serem salvos na memória
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.getLogin());
        hash = 89 * hash + Objects.hashCode(this.getSenha());
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
	
        private List<TipoPagamento> tipoPagamento;
        
	
	
	public void realizarCompra() {
		
	}

    /**
     * @return the nomeUsuario
     */
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    /**
     * @param nomeUsuario the nomeUsuario to set
     */
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the tipoPagamento
     */
    public List<TipoPagamento> getTipoPagamento() {
        return tipoPagamento;
    }

    /**
     * @param tipoPagamento the tipoPagamento to set
     */
    public void setTipoPagamento(List<TipoPagamento> tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
	
	


}
