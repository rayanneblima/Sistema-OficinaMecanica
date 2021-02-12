package classes;

import java.util.Scanner;
import java.util.Date;

public class Provider {
    private String companyName;
    private String cnpj;
    private String tel;
    private String email;
    private String address;
    private String product;
    private String responsibleName; 
    
    
    public Provider() {
        this.companyName = "";
        this.cnpj = "";
        this.tel = "";
        this.email = "";
        this.address = "";   
        this.product = "";
        this.responsibleName = "";
    }
    
    public void fillProvider() {
        Scanner scan = new Scanner(System.in);
        System.out.println("******* Preencha o Fornecedor *******");
        System.out.print("Informe o nome do fornecedor: ");
        this.setCompanyName(scan.nextLine());
        System.out.print("Informe o CNPJ do fornecedor: ");
        this.setCnpj(scan.nextLine());
        System.out.print("Informe o telefone/whatsapp do fornecedor: ");
        this.setTel(scan.nextLine());
        System.out.print("Informe o e-mail do fornecedor: ");
        this.setEmail(scan.nextLine());
        System.out.print("Informe o endereço completo do fornecedor: ");
        this.setAddress(scan.nextLine());
        System.out.print("Informe o tipo de produto do fornecedor: ");
        this.setProduct(scan.nextLine());
        System.out.print("Informe o nome do responsável: ");
        this.setResponsibleName(scan.nextLine());
    }
    
    public void printProvider() {
        System.out.println("******* Dados do Fornecedor *******");
        System.out.print("Nome da Empresa: " + this.getCompanyName());
        System.out.print("CNPJ: " + this.getCnpj());
        System.out.print("Telefone/Whatsapp: " + this.getTel());
        System.out.print("E-mail: " + this.getEmail());
        System.out.print("Endereço: " + this.getAddress());
        System.out.print("Tipo de Produto: " + this.getProduct());
        System.out.print("Nome do Responsável: " + this.getResponsibleName());
        System.out.println("*******************************");
    }
    
    public String printProviderToString() {
        String out = "";
        out = "******* Dados do Fornecedor *******\n"
                + "Nome da Empresa: " + this.getCompanyName()+ "\n"
                + "CNPJ: " + this.getCnpj() + "\n"
                + "Telefone/Whatsapp: " + this.getTel() + "\n"
                + "E-mail: " + this.getEmail() + "\n"
                + "Endereço: " + this.getAddress() + "\n"
                + "Tipo de Produto: " + this.getProduct()+ "\n"
                + "Nome do Responsável: " + this.getResponsibleName()+ "\n"
                + "***********************************\n";
        return out;
    }
    
    public void copyProvider(Provider other) {
        this.setCompanyName(other.getCompanyName());
        this.setCnpj(other.getCnpj());
        this.setTel(other.getTel());
        this.setEmail(other.getEmail());
        this.setAddress(other.getAddress());
        this.setProduct(other.getProduct());  
        this.setResponsibleName(other.getResponsibleName());
    }

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the responsibleName
     */
    public String getResponsibleName() {
        return responsibleName;
    }

    /**
     * @param responsibleName the responsibleName to set
     */
    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

}
