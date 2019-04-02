package builder;

public class Carteira extends CadastrarProduto {

    Produto prod = new Produto("Carteira");

    @Override
    public void cadastrarNome(String nome) {
        prod.setNome(nome);
        
    }

    @Override
    public void cadastrarValor(Double val) {
        prod.setValor(val);
    }

    @Override
    public void cadastrarCor(String cor) {
        prod.setCor(cor);
    }
    
    public void cadastrarMaterial(String mat){
        prod.setMaterial(mat);
    }
}
