package padraoprototype;

public class Camisas extends ProdutoPrototype {


    public Camisas(Camisas camisas) {

    }

    public Camisas() {

    }

   
    public void exibirInformacao() {
        System.out.println("====================");
        System.out.println("Marca:"+ getMarca());
        System.out.println("Informaçao:"+ getInformaçao());
    }

 
    public Camisas clonar() {
        return new Camisas(this);
    }
}
