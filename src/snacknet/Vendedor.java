package snacknet;

import java.util.Objects;

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
    
    // Metodo hashCode e equals:
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.estoque);
        return hash;
    }

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
    
    // Metodo toString:
    @Override
    public String toString() {
        return "Vendedor{" + "nomeVendedor=" + nomeVendedor + ", campus=" + campus + '}';
    }
    
    // Metodos Especiais:
    public String getNomeVendedor() {
        return nomeVendedor;
    }
    
    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
    
    
}