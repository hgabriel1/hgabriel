
package builder;

public abstract class CadastrarProduto {
    private Produto produto = new Produto();
  
    public void setProduto(Produto produto) {
        this.produto = produto;        
    }

    public Produto getProduto() {
        return produto;
    }
    
    public void cadastrarNome(String nome){
        
    }
    public  void cadastrarValor(Double val){
        
    }
    public  void cadastrarCor(String cor){
        
    }
    public  void cadastrarMaterial(String mat){
        
    }
    
    
}
