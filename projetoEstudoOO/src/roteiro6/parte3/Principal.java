package roteiro6.parte3;

public class Principal {
    public static void main(String[] args) {
        Ligacao lig01 = new Ligacao("123456789", "987654321", "São Paulo", "Rio de Janeiro", new Tempo(10, 0, 0));
        

        System.out.println("Número de origem: " + lig01.getNumOrigem());
        System.out.println("Número de destino: " + lig01.getNumDestino());
        System.out.println("Local de origem: " + lig01.getLocalOrigem());
        System.out.println("Local de destino: " + lig01.getLocalDestino());
        System.out.println("Hora de início: " + lig01.getHoraInicio());
        System.out.println("Hora de fim: " + lig01.getHoraFim());

        
        System.out.println("Duração: " + lig01.getHoraFim().getHora() + ":" + lig01.getHoraFim().getMinuto() + ":" + lig01.getHoraFim().getSegundo());
        
    }
    
    
}
