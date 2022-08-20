public class seguro {
    private int tipo;
    private String veiculo;

    public seguro(int tipo, String veiculo) {
        this.tipo = tipo;
        this.veiculo = veiculo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }
}
