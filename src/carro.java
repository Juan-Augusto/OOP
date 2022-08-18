import java.util.Objects;

public class carro extends veiculos{
    private String tipo;

    public carro(String nome, int anoFabricacao, String cor, float precoCompra, int qtdDisp, String tipo) {
        super(nome, anoFabricacao, cor, precoCompra, qtdDisp);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
