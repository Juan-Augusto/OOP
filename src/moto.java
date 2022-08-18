public class moto extends veiculos{
    private String tipo;

    public moto(String nome, int anoFabricacao, String cor, float precoCompra, int qtdDisp, String tipo) {
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
