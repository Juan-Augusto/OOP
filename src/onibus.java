public class onibus extends veiculos{
    private int qtdAssentos;

    public onibus(String nome, int anoFabricacao, String cor, float precoCompra, int qtdDisp, int qtdAssentos) {
        super(nome, anoFabricacao, cor, precoCompra, qtdDisp);
        this.qtdAssentos = qtdAssentos;
    }

    public int getQtdAssentos() {
        return qtdAssentos;
    }

    public void setQtdAssentos(int qtdAssentos) {
        this.qtdAssentos = qtdAssentos;
    }
}
