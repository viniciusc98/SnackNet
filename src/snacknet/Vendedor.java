package snacknet;
import java.util.Objects;

public class Vendedor extends Usuario{
    private Integer id;
    private String campus;
    private Integer estoque;

    // Metodo construtor: 
    public Vendedor( 
            String campus, 
            Integer estoque, 
            String nomeUsuario, 
            String login, 
            String senha, 
            TipoPagamento tp) {
        super(nomeUsuario, login, senha, tp);
        this.campus = campus;
        this.estoque = estoque;
    }
    
    // Metodo hashCode e equals:
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.getEstoque());
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
        return "Vendedor{" + super.toString() + ", campus=" + getCampus() + '}';
    }
    
    // Metodos Especiais:

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
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