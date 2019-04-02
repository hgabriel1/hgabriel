package builder;

public class Produto {

    private String tipo;
    private String nome;
    private Double valor;
    private String cor;
    private String material;

    Produto() {

    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Produto(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void mostraProd() {
        System.out.println("Tipo Veiculo: " + nome);

    }
}
