package roteiro5.parte1;

public class Loja {
    private String NomeFantasia;
    private String razaoSocial;
    private String cnpj;
    

    public Loja (String NomeFantasia, String razaoSocial, String cnpj) {
        this.NomeFantasia = NomeFantasia;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
       
        if (razaoSocial.equals("")){
            this.razaoSocial = NomeFantasia;
        }
        else {
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

    

}
