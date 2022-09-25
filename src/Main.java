public class Main {
    public static void main(String[] args) {
        Pessoa andrew = new Pessoa("Andrew", 34, 750_000);
        Carro lamborghini = new Carro("Ferra LaFerrari", 450_000);

        andrew.comprarCarro(lamborghini);
    }
}
