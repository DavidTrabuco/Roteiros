package roteiro5.parte3;

public class Loja {

    private String NomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double area;
    private double faturamento;

    public Loja(String NomeFantasia, String razaoSocial, String cnpj) {
        this.NomeFantasia = NomeFantasia;
        this.cnpj = cnpj;

        if (razaoSocial.equals("")) {
            this.razaoSocial = NomeFantasia;
        } else {
            this.razaoSocial = razaoSocial;
        }

    }

    public String getNomeFantasia() {
        return NomeFantasia;

    }

    public void setNomeFantasia(String NomeFantasia) {
        this.NomeFantasia = NomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getValorFat() {
        return valorFat;
    }

    public void setValorFat(double valorFat) {
        this.valorFat = valorFat;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }

    public static void compararFat_static(Loja lojaA, Loja lojaB) {
        if (lojaA.getValorFat() > lojaB.getValorFat()) {
            System.out.println("Loja de Maior Fat : " + lojaA.NomeFantasia);
        } else {
            System.out.println("Loja de Maior Fat : " + lojaB.NomeFantasia);
        }
    }

    public void compararFat_naoStatic(Loja lojaB) {
        if (this.getValorFat() > lojaB.getValorFat()) {
            System.out.println("Loja de Maior Fat : " + this.NomeFantasia);
        } else {
            System.out.println("Loja de Maior Fat : " + lojaB.NomeFantasia);
        }
    }

    public static void maiorFaturamento(Loja lojaA, Loja lojaB) {
        if (lojaA.getFaturamento() > lojaB.getFaturamento()) {
            System.out.println("Loja de Maior Faturamento : " + lojaA.NomeFantasia);
        } else {
            System.out.println("Loja de Maior Faturamento : " + lojaB.NomeFantasia);
        }
    }

    public void maiorFaturamento(Loja lojaB) {
        if (this.getFaturamento() > lojaB.getFaturamento()) {
            System.out.println("Loja de Maior Faturamento : " + this.NomeFantasia);
        } else {
            System.out.println("Loja de Maior Faturamento : " + lojaB.NomeFantasia);
        }

    }

}
