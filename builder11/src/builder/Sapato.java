package builder;

public class Sapato extends CadastrarProduto {

    Produto prod = new Produto("Sapato");

    public Sapato() {

    }

    public Produto getProd() {
        return prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }

    @Override
    public void cadastrarNome(String nome) {
        prod.setNome(nome);
        prod.mostraProd();
    }

    @Override
    public void cadastrarValor(Double val) {
        prod.setValor(val);
    }

    @Override
    public void cadastrarCor(String cor) {
        prod.setCor(cor);
    }

    @Override
    public void setProduto(Produto produto) {
        super.setProduto(prod); //To change body of generated methods, choose Tools | Templates.
    }

}
