import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        carro Carro = new carro("hb20", 2018, "branco", 85000, 7, "sedan");
        moto Moto = new moto("honda MXRT", 2020, "verde", 25000, 3, "esportiva");
        caminhao Caminhao = new caminhao("caminhao MXRT", 2021, "preto", 200000, 5, 3);
        onibus Onibus = new onibus("onibus padrao", 2018, "verde", 220000, 6, 30);
        System.out.println(Carro + Carro.getTipo());
        System.out.println(Moto + Moto.getTipo());
        System.out.println(Caminhao + "" + Caminhao.getCapacidade());
        if(Carro.getAnoFabricacao() < 2018 && Objects.equals(Carro.getTipo(), "sedan")){
            System.out.println("Preco de venda do carro = " + (Carro.getPrecoCompra() * 1.3));
        }else{
            System.out.println("Preco de venda do carro = " + Carro.getPrecoCompra() * 1.15);
        }
        if(Objects.equals(Carro.getCor(), "esportiva")
                &&
                (Objects.equals(Carro.getCor(), "verde")
                        ||
                        Objects.equals(Carro.getCor(), "vermelho"))){
            System.out.println("Preco de venda da moto = " + (Moto.getPrecoCompra() * 1.4));
        }else{
            System.out.println("Preco de venda da moto = " + (Moto.getPrecoCompra() * 1.1));
        }
        if(Caminhao.getCapacidade() <= 3){
            System.out.println("Preco de venda do caminhao = " + (Caminhao.getPrecoCompra() * 1.07));
        }else{
            System.out.println("Preco de venda do caminhao = " + (Onibus.getPrecoCompra() * 1.05));
        }
        if( Onibus.getQtdAssentos() > 15 && Onibus.getAnoFabricacao() > 2020 ){
            System.out.println("Preco de venda do onibus = " + (Onibus.getPrecoCompra() * 1.12));
        }else{
            System.out.println("Preco de venda do onibus = " + (Onibus.getPrecoCompra() * 1.08));
        }

    }
}
