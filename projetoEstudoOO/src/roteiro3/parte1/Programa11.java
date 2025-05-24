package roteiro3.parte1;

import java.util.Scanner;

public class Programa11 {
    public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Vamos descobrir o quanto de salário-base você irá receber !!");
      System.out.println("Dogite o salário que vc recebe  ");
      double sb = scanner.nextDouble();

       double grat = Programa11.calculadoraGrat(sb);
       double imp = Programa11.calculadoraimp(sb);
        double resultado = sb + grat -imp ; 


        System.out.println("O salário que você irá receber com gratificação e imposto é :" + resultado );
    }

      
    } 
    public static double calculadoraGrat(double sb )
    {
      return  sb * 5/100;
    } 
    public static double calculadoraimp(double sb )
    {
      return  sb * 7/100;
    } 

    
}


