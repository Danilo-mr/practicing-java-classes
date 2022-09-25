public class Carro extends MeioDeTransporte{
    private String marcaModelo;
    private int preço;
    private int velocidadeMaxima;

    public Carro(String marcaModelo, int preço) {
        super.setMeioFisico("Terrestre");
        this.marcaModelo = marcaModelo;
        this.preço = preço;
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public void setMarcaModelo(String marcaModelo) {
        this.marcaModelo = marcaModelo;
    }

    public int getPreço() {
        return preço;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
