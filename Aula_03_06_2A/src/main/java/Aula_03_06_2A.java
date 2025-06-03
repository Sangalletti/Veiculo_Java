
public class Aula_03_06_2A {

    public static void main(String[] args) {

        // Criando um objeto Moto com atributos
        Moto Hayabusa = new Moto("Vermelho", 2, "Hayabusa", "Modelo X", 180.0, 1000);
        Carro Toyota = new Carro("Verde", 4, "Toyota", "Modelo Y", 250.0, 1200, 200);

        // Chamando o Método Moto
        Hayabusa.acelerar();
        Hayabusa.exibirInfo();
        Hayabusa.desligar();
        
        // Chamando o Método Carro
        System.out.println("================");
        Toyota.acelerar();
        Toyota.exibirInfo();
        Toyota.desligar();
    }
}
