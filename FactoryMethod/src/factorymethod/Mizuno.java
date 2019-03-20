package factorymethod;

public class Mizuno implements IFabricaProdutos {
   
    public IProduto criarProdutos(String produtos) {
        if (produtos.equals("polo")){
            return new CamisasPolos();
        }else if (produtos.equals("tenis")){
            return new Tenis();
        }else {
            return null;
        }
    }
}
