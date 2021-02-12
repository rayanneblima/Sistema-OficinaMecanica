package classes;

import java.util.Scanner;

public class Client {
    private String name;
    private String cpf;
    private String tel;
    private String email;
    private String address;
    private String vehicles;
    
    public Client() {
        this.name = "";
        this.cpf = "";
        this.tel = "";
        this.email = "";
        this.address = "";   
        this.vehicles = "";
    }
    
    public void fillClient() {
        Scanner scan = new Scanner(System.in);
        System.out.println("******* Preencha o Cliente *******");
        System.out.print("Informe o nome do cliente: ");
        this.setName(scan.nextLine());
        System.out.print("Informe o CPF do cliente: ");
        this.setCpf(scan.nextLine());
        System.out.print("Informe o telefone/whatsapp do cliente: ");
        this.setTel(scan.nextLine());
        System.out.print("Informe o e-mail do cliente: ");
        this.setEmail(scan.nextLine());
        System.out.print("Informe o endereço completo do cliente: ");
        this.setAddress(scan.nextLine());
        System.out.print("Informe o(s) veículo(s) do cliente: ");
        this.setVehicles(scan.nextLine());
    }
    
    public void printClient() {
        System.out.println("******* Dados do Cliente *******");
        System.out.print("Nome: " + this.getName());
        System.out.print("CPF: " + this.getCpf());
        System.out.print("Telefone/Whatsapp: " + this.getTel());
        System.out.print("E-mail: " + this.getEmail());
        System.out.print("Endereço: " + this.getAddress());
        System.out.print("Veículos: " + this.getVehicles());
        System.out.println("*******************************");
    }
    
    public String printClientToString() {
        String out = "";
        out = "******* Dados do Cliente *******\n"
                + "Nome: " + this.getName() + "\n"
                + "CPF: " + this.getCpf() + "\n"
                + "Telefone/Whatsapp: " + this.getTel() + "\n"
                + "E-mail: " + this.getEmail() + "\n"
                + "Endereço: " + this.getAddress() + "\n"
                + "Veículos: " + this.getVehicles() + "\n"
                + "***********************************\n";
        return out;
    }
    
    public void copyClient(Client other) {
        this.setName(other.getName());
        this.setCpf(other.getCpf());
        this.setTel(other.getTel());
        this.setEmail(other.getEmail());
        this.setAddress(other.getAddress());
        this.setVehicles(other.getVehicles());        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
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
     * @return the vehicles
     */
    public String getVehicles() {
        return vehicles;
    }

    /**
     * @param vehicles the vehicles to set
     */
    public void setVehicles(String vehicles) {
        this.vehicles = vehicles;
    }

   
}

