package roteiro8.parte1;

public class VeiculoCarga extends  Veiculo {
    
    private int pesoMax;

    public VeiculoCarga(String placa, int anoFabricação, int pesoMax) {
        super(placa, anoFabricação);
        
        this.pesoMax = pesoMax;
    }
    public int getPesoMax() {
        return pesoMax;
    }
    public void setPesoMax(int pesoMax) {
        this.pesoMax = pesoMax;
    }
    
}
