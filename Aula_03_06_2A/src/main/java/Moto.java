
public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String cor, int quantAssentos, String marca, String modelo, double velocidadeMax, int cilindradas) {
        super(cor, quantAssentos, marca, modelo, velocidadeMax);
        this.cilindradas = cilindradas;
    }

    @Override
    public void acelerar() {
        System.out.println("A moto esta acelerando!");
    }

    // Método para exibir detalhes da moto
    public void exibirInfo() {
        System.out.println("Cor: " + cor);
        System.out.println("Assentos: " + quantAssentos);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velociade maxima: " + velocidadeMax);
        System.out.println("Cilindradas: " + cilindradas);
    }
    public void desligar() {
        System.out.println("A moto esta desligando!");
    }
}
