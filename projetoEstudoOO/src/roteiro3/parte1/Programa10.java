package roteiro3.parte1;

import java.util.Scanner;

public class Programa10 {
 public static void main(String[] args) {
     try (Scanner scanner = new Scanner(System.in)) {
         System.out.println("Vamos descobrir o quanto de salário-base você irá receber !!");
         System.out.println("Dogite o salário que vc recebe  ");
         double sb = scanner.nextDouble();
         
         double grat = sb * 5/100;
         double imp = sb * 7/100;
         double resultado = sb + grat -imp ;
         
         
         System.out.println("O salário que você irá receber com gratificação e imposto é :" + resultado );
     }
    }  
}
