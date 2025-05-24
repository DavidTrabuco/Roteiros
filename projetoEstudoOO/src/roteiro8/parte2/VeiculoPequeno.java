package roteiro8.parte2;

public class VeiculoPequeno extends Veiculo {
    private String modelo;

    public VeiculoPequeno(String placa, int anoFabricação, String modelo) {
        super(placa, anoFabricação);
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
