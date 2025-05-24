package roteiro5.parte1;

public class Principal {
    public static void main(String[] args) {
        Loja loja01 = new Loja("Loja 01", "Loja 01 LTDA", "12345678901234");
        Loja loja02 = new Loja("Loja 02", "", "12345678901234");
        Loja loja03 = new Loja("Loja 01", "Loja 01 LTDA", "12345678901234");

        System.out.println("Loja 01 - Nome Fantasia: " + loja01.getNomeFantasia());
        System.out.println("Loja 01 - Razão Social: " + loja01.getRazaoSocial());
        System.out.println("Loja 01 - CNPJ: " + loja01.getCnpj());
        
        
        System.out.println("Loja 02 - Nome Fantasia: " + loja02.getNomeFantasia());
        System.out.println("Loja 02 - Razão Social: " + loja02.getRazaoSocial());
        System.out.println("Loja 02 - CNPJ: " + loja02.getCnpj());



        System.out.println("Loja 03 - Nome Fantasia: " + loja03.getNomeFantasia());
        System.out.println("Loja 03 - Razão Social: " + loja03.getRazaoSocial());   
        System.out.println("Loja 03 - CNPJ: " + loja03.getCnpj());
  
  
        
        
    }

}
