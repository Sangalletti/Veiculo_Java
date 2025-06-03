
public class Carro extends Veiculo {

    private int potencia;
    private int cavalos;

    public Carro(String cor, int quantAssentos, String marca, String modelo, double velocidadeMax, int potencia, int cavalos) {
        super(cor, quantAssentos, marca, modelo, velocidadeMax);
        this.potencia = potencia;
        this.cavalos = cavalos;
    }

    @Override
    public void acelerar() {
        System.out.println("O carro esta acelerando!");
    }

    // Método para exibir detalhes do Carro
    public void exibirInfo() {
        System.out.println("Cor: " + cor);
        System.out.println("Assentos: " + quantAssentos);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velociade maxima: " + velocidadeMax);
        System.out.println("Potencia: " + potencia);
        System.out.println("Cavalos: " + cavalos);
    }

    public void desligar() {
        System.out.println("O carro esta desligando!");
    }
}
