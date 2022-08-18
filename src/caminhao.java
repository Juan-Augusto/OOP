public class caminhao extends veiculos{
    private float capacidade;

    public caminhao(String nome, int anoFabricacao, String cor, float precoCompra, int qtdDisp, float capacidade) {
        super(nome, anoFabricacao, cor, precoCompra, qtdDisp);
        this.capacidade = capacidade;
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }
}
