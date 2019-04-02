
package builder;

public class Roupa extends CadastrarProduto{

    Produto prod = new Produto("Roupa");

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


    
}
