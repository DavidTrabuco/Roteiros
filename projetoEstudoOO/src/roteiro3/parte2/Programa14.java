
package roteiro3.parte2;
import java.util.Scanner;


public class Programa14 {
     
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor de x ");
        double x = entrada.nextDouble();
        System.out.println("Informe a operação (+, -, *, /) ");
        String op = entrada.next();
        System.out.println("Informe o valor de y ");
        double y = entrada.nextDouble();
        switch (op) {
            case "+" : System.out.println("Resultado: " + soma(x, y));
            break;
            case "-" : System.out.println("Resultado: " + subtracao(x, y));
            break;
            case "*" : System.out.println("Resultado: " + multiplicacao(x, y));
            break;
            case "/" : System.out.println("Resultado: " + divisao(x, y));
            break;
            default : System.out.println("Operação inválida");
            entrada.close();
            }
        }
    
    
    public static double  soma (double x, double y){
        return x + y;
    }
    public static double  subtracao (double x, double y){
    return x - y;
    }
    public static double multiplicacao (double x, double y){
        return x * y;
    }
    public static  double divisao (double x, double y){
        return x / y ;
    }
    
}
