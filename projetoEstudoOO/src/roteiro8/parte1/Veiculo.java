package roteiro8.parte1;

public abstract class Veiculo {

    private String placa; 
    private int anoFabricação;

    public Veiculo(String placa, int anoFabricação) {
        this.placa = placa;
        this.anoFabricação = anoFabricação;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getAnoFabricação() {
        return anoFabricação;
    }
    public void setAnoFabricação(int anoFabricação) {
        this.anoFabricação = anoFabricação;
    }
    
}
