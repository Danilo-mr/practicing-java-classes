import org.jetbrains.annotations.NotNull;

public class Pessoa {
    private String nome;
    private int idade;
    private int patrimônio;
    private Carro carro;

    public Pessoa(String nome, int idade, int patrimônio) {
        this.nome = nome;
        this.idade = idade;
        this.patrimônio = patrimônio;
    }

    public void comprarCarro(@NotNull Carro carro) {
        if (patrimônio >= carro.getPreço()) {
            patrimônio -= carro.getPreço();
            this.carro = carro;
            System.out.println("Compra realizada");
        } else {
            System.out.println("Dinheiro insuficiente");
        }
    }

    public Carro getCarro() {
        return carro;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getPatrimônio() {
        return patrimônio;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPatrimônio(int patrimônio) {
        this.patrimônio = patrimônio;
    }
}
