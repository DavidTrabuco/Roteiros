package roteiro8.parte2;

public class Principal {

    public static void main (String[] args) {
        Veiculo v01 = new VeiculoPequeno("XYZ1234", 2021, "ModeloDesconhecido");
        VeiculoPequeno v02 = new VeiculoPequeno("ABC1234", 2020, "Fusca");
        VeiculoCarga v03 = new VeiculoCarga("DEF5678", 2019, 1000);
        VeiculoPasseio v04 = new VeiculoPasseio("GHI9012", 2021, 5);

       
        System.out.println("Veículo 1: " + v01.getPlaca() + ", Ano: " + v01.getAnoFabricação());
        System.out.println("Veículo 2: " + v02.getPlaca() + ", Ano: " + v02.getAnoFabricação() + ", Modelo: " + v02.getModelo());
        System.out.println("Veículo 3: " + v03.getPlaca() + ", Ano: " + v03.getAnoFabricação() + ", Capacidade de Carga: " + v03.getPesoMax() + " kg");
        System.out.println("Veículo 4: " + v04.getPlaca() + ", Ano: " + v04.getAnoFabricação() + ", qutd maxima de passageiros :" + v04.getQtdMAxPassageiros());
        

        System.out.println("Pedágio do veículo 1: " + v01.calcPedagio());
        System.out.println("Pedágio do veículo 2: " + v02.calcPedagio());
        System.out.println("Pedágio do veículo 3: " + v03.calcPedagio());
        System.out.println("Pedágio do veículo 4: " + v04.calcPedagio());

    }


    
}
