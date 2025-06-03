
public abstract class Veiculo {

    // Atributos
    protected String cor;
    protected int quantAssentos;
    protected String marca;
    protected String modelo;
    protected double velocidadeMax;

    // Construtor
    public Veiculo(String cor, int quantAssentos, String marca, String modelo, double velocidadeMax) {
        this.cor = cor;
        this.quantAssentos = quantAssentos;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeMax = velocidadeMax;
    }

    // Getters e Setters
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setQuantAssentos(int quantAssentos) {
        this.quantAssentos = quantAssentos;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public double getVelocidadeMax() {
        return velocidadeMax;
    }
    
    // Métodos
    public abstract void acelerar();
}
