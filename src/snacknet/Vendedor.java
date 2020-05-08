package snacknet;

import java.util.Objects;
//Criar identificador 
public class Vendedor {
    private String nomeVendedor;
    private String campus;
    private Integer estoque;

    // Metodo construtor: 
    public Vendedor(String nomeVendedor, String campus, Integer estoque) {
        this.nomeVendedor = nomeVendedor;
        this.campus = campus;
        this.estoque = estoque;
    }
    
    //O HashCode gera um número único para os atributos serem salvos na memória
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.getEstoque());
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
        final Vendedor other = (Vendedor) obj;
        if (!Objects.equals(this.estoque, other.estoque)) {
            return false;
        }
        return true;
    }
    
    //Retorna um uma apresentação textual do objeto 
    @Override
    public String toString() {
        return "Vendedor{" + "nomeVendedor=" + getNomeVendedor() + ", campus=" + getCampus() + '}';
    }

    /**
     * @return the nomeVendedor
     */
    public String getNomeVendedor() {
        return nomeVendedor;
    }

    /**
     * @param nomeVendedor the nomeVendedor to set
     */
    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    /**
     * @return the campus
     */
    public String getCampus() {
        return campus;
    }

    /**
     * @param campus the campus to set
     */
    public void setCampus(String campus) {
        this.campus = campus;
    }

    /**
     * @return the estoque
     */
    public Integer getEstoque() {
        return estoque;
    }

    /**
     * @param estoque the estoque to set
     */
    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
    
    
    
    
    
}