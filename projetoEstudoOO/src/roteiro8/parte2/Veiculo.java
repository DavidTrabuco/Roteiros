package roteiro8.parte2;

public abstract class Veiculo {

    private String placa; 
    private int anoFabricação;
    protected double taxaPedagio = 6.0; 

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

    public double calcPedagio() {
        return taxaPedagio;
    }
    
}
