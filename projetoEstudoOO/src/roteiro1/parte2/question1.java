package roteiro1.parte2;

public class question1 {
    public static void main(String[] args) {
        double sb = 2500;
        byte horasextras = 10;
        double horasbase = 160;

        double op = sb * (horasextras + horasbase) / horasbase;

        System.out.println("O salario bruto é: " + op);
    }

}
