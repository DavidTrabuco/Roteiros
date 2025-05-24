package roteiro2.parte3;

public class Programa05 {
    public static void main(String[] args) {
        for (int contador = 1; contador <= 5; contador++) {
            double nota = contador + 4.5; 
            if (nota >= 6) {
                System.out.println("Nota " + nota + ": Aprovado");
            } else {
                System.out.println("Nota " + nota + ": Reprovado");
            }
        }
    }
}
