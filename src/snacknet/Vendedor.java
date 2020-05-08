package snacknet;
import java.util.Objects;

public class Vendedor extends Usuario{
    private Integer id;
    private String campus;
    private Integer estoque;
    
    //O HashCode gera um número único para os atributos serem salvos na memória
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        return hash;
    }
    
    //Retorna um uma apresentação textual do objeto
    @Override
    public String toString() {
        return "Vendedor{" + "campus=" + campus + ", estoque=" + estoque + '}';
    }
    
    
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

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
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
