public class veiculos {
    private String nome;
    private int anoFabricacao;
    private String cor;
    private float precoCompra;
    private int qtdDisp;

    public veiculos(String nome, int anoFabricacao, String cor, float precoCompra, int qtdDisp) {
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.precoCompra = precoCompra;
        this.qtdDisp = qtdDisp;
    }

    public void frear(){
        System.out.println("Freio");
    }
    public void utilizacaoDeCombustivel(){
        System.out.println("usei");
    }
    public void ligar(){
        System.out.println("liguei");
    }
    public void andar(){
        System.out.println("andei");
    }
    public void darRe(){
        System.out.println("re");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    public int getQtdDisp() {
        return qtdDisp;
    }

    public void setQtdDisp(int qtdDisp) {
        this.qtdDisp = qtdDisp;
    }

    @Override
    public String toString() {
        return "veiculos{" +
                "nome='" + nome + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", cor='" + cor + '\'' +
                ", precoCompra=" + precoCompra +
                ", qtdDisp=" + qtdDisp +
                '}';
    }
}
