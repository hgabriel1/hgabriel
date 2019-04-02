package builder;

public class Cadastro {

    public void Cadastrar(CadastrarProduto cadProd, Produto base) {

        cadProd.cadastrarNome(base.getNome());
        cadProd.cadastrarValor(base.getValor());
        cadProd.cadastrarCor(base.getCor());
        cadProd.cadastrarMaterial(base.getMaterial());

    }
}
