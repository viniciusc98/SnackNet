package snacknet;

public class Vendedor {
    public String nomeVendedor;
    public String campus;
    public Integer estoque;

    public Vendedor registrarVendedor(String nomeVendedor, String campus, Integer estoque)throws Exception{
        if(campus.isEmpty()){
            throw new Exception("campus esta vazio"); 
        }

        if(nomeVendedor.isEmpty()){
            throw new Exception("Nome vazio");
        }

        if(estoque == 0){
            throw new Exception("Estoque vazio");
        }

        Vendedor vendedor01 = new Vendedor();

        vendedor01.setNomeVendedor("pamonha");
        vendedor01.setCampus(campus);
        vendedor01.setEstoque(10);

        return vendedor01;
    }

    public String getNomeVendedor(){
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public String getCampus(){
        return campus;
    }

    public void setCampus(String campus){
        this.campus = campus;
    }

    public Integer getEstoque(){
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

}