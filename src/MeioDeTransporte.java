public class MeioDeTransporte extends Objeto{
    private String meioFisico;
    private int Capacidade;

    public MeioDeTransporte(){}

    public MeioDeTransporte(String meioFisico, int capacidade) {
        super();
        this.meioFisico = meioFisico;
        this.Capacidade = capacidade;
    }

    public String getMeioFisico() {
        return meioFisico;
    }

    public void setMeioFisico(String meioFisico) {
        this.meioFisico = meioFisico;
    }

    public int getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(int capacidade) {
        Capacidade = capacidade;
    }
}
