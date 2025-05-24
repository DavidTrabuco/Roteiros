package roteiro8.parte1;

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
}
