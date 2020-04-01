/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snacknet;

/**
 *
 * @author castr
 */
public class Entrega {
    private String local;
    private String horario;
    private Double numero_pedido;
    private String avaliacao;
    private Boolean entregue;
    
    
    public Entrega RegistrarEntrega(Double numero_pedido, String horario, String local) throws Exception{
        
        if(local.isEmpty()){
            throw new Exception("Local é vazio"); 
        }
        
        if(numero_pedido == null){
            throw new Exception("Número do pedido é inválido");
        }
        Entrega entrega = new Entrega();
        
        entrega.setLocal(local);
        entrega.setHorario(horario);
        entrega.setNumero_pedido(numero_pedido);
        entrega.setEntregue(false);
        return entrega;
    }
    
    public Entrega confirmarEntrega(Entrega entrega){
        entrega.setEntregue(true);
        return entrega;
    }
    
    public Entrega avaliarEntrega(Entrega entrega, String avaliacao) throws Exception{
        if(!entrega.getEntregue()){
            throw new Exception("Seu pedido ainda nao foi entregue");
        }
        entrega.setAvaliacao(avaliacao);
        return entrega;
    }

    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the numero_pedido
     */
    public Double getNumero_pedido() {
        return numero_pedido;
    }

    /**
     * @param numero_pedido the numero_pedido to set
     */
    public void setNumero_pedido(Double numero_pedido) {
        this.numero_pedido = numero_pedido;
    }

    /**
     * @return the avaliação
     */
    public String getAvaliacao() {
        return avaliacao;
    }

    /**
     * @param avaliação the avaliação to set
     */
    public void setAvaliacao(String avaliação) {
        this.avaliacao = avaliação;
    }

    /**
     * @return the entrega
     */
    public Boolean getEntregue() {
        return entregue;
    }

    /**
     * @param entrega the entrega to set
     */
    public void setEntregue(Boolean entrega) {
        this.entregue = entrega;
    }

   
   
    
}

