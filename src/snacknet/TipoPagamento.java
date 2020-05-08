package snacknet;



/**
 *
 * @author Vinícius de Castro
 */
public class TipoPagamento {
    //Atributos 
    private String metodo;
    private Double valor;
    private Usuario usuario;
    
    //Retorna um uma apresentação textual do objeto
    @Override
    public String toString() {
        return "TipoPagamento{" + "metodo=" + metodo + ", valor=" + valor + '}';
    }
    
    public void RealizarCompra(){
        
    }

    /**
     * @return the metodo
     */
    public String getMetodo() {
        return metodo;
    }

    /**
     * @param metodo the metodo to set
     */
    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    /**
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    

    
    
    
    
}
