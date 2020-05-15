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
public class SnackNet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Usuario u1 = new Usuario("Pedro", 5486, "pedro@pedro.com", "pedrao", "123123");
        
        u1.setEmail("beterraba");
        
        System.out.println(u1.toString());
        
        Vendedor v1 = new Vendedor(1, "Buritis", 20, u1.getNomeUsuario(), u1.getTelefone(), u1.getEmail(), u1.getLogin(), u1.getSenha());
        
        v1.setCampus("Silva Lobo");
        
        System.out.println(v1.toString());
        
        Entrega e1 = new Entrega("Casa do Matheus de Rico", "20:30", 2687490.0, "Pedido foi rápido e não deu pra investir");
        
        e1.setLocal("Local Aleatório");
        e1.setEntregue(Boolean.TRUE);
        
        
        System.out.println(e1.toString());
        
        TipoPagamento tp1 = new TipoPagamento("Crédito", 50.99, u1);
        
        tp1.setMetodo("Débito");
        
        System.out.println(tp1.toString());
    }
}
