package roteiro5.parte2;

public class Loja {
    private String NomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double area;
    

    public Loja (String NomeFantasia, String razaoSocial, String cnpj) {
        this.NomeFantasia = NomeFantasia;
        this.cnpj = cnpj;
       
        if (razaoSocial.equals("")){
            this.razaoSocial = NomeFantasia;
        }
        else {
            this.razaoSocial = razaoSocial;
        }


    }
    public Loja(String NomeFantasia,String cnpj){
        this(NomeFantasia, NomeFantasia, cnpj);
        
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
}




