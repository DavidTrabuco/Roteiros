package roteiro2.parte3;
import java.util.Scanner;
public class Programa04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       int cont = 0;
       while (cont<5){
        System.out.println("Informe uma nota de 0 a 10: ");
        double nota = scanner.nextDouble();
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Tente novamente.");
        } if (nota >= 7 && nota <= 10) {
            System.out.println("Aprovado com nota " + nota);
            
        }else{
            System.out.println("Reprovado com nota " + nota);
        }
        cont++;
        System.out.println("Nota informada: " + nota);
       }
       scanner.close();

    }

}
