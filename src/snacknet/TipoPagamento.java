package snacknet;



/**
 *
 * @author Vinícius de Castro - 12104945
 */
public class TipoPagamento {
    //Atributos 
    private String metodo;
    private Double valor;
    private Usuario usuario;
    

    
    public String getMetodo() {
        return metodo;
    }

    
    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    
    public Double getValor() {
        return valor;
    }

     
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
}
