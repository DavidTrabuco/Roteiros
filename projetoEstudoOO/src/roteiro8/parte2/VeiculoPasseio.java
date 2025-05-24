package roteiro8.parte2;

public class VeiculoPasseio extends Veiculo {
    private int qtdMAxPassageiros;

    public VeiculoPasseio(String placa, int anoFabricação, int qtdMAxPassageiros) {
        super(placa, anoFabricação);
        
        this.qtdMAxPassageiros = qtdMAxPassageiros;
    }
    public int getQtdMAxPassageiros() {
        return qtdMAxPassageiros;
    }
    public void setQtdMAxPassageiros(int qtdMAxPassageiros) {
        this.qtdMAxPassageiros = qtdMAxPassageiros;
    }

    @Override
    public double calcPedagio() {
        super.taxaPedagio = 5.0;
        return super.taxaPedagio *this.qtdMAxPassageiros;
    }
}
