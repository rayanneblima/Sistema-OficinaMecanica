package classes;

import java.util.Scanner;
import java.util.Date;

public class Employee {
    private String name;
    private String cpf;
    private String tel;
    private String email;
    private String address;
    private String position;
    private int workHours;
    private String salary;
    private Date contractDate;  
    
    
    public Employee() {
        this.name = "";
        this.cpf = "";
        this.tel = "";
        this.email = "";
        this.address = "";   
        this.position = "";
        this.workHours = 0;
        this.salary = "";
        //this.contractDate = ;
    }
    
    public void fillEmployee() {
        Scanner scan = new Scanner(System.in);
        System.out.println("******* Preencha o Funcionário *******");
        System.out.print("Informe o nome do funcionário: ");
        this.setName(scan.nextLine());
        System.out.print("Informe o CPF do funcionário: ");
        this.setCpf(scan.nextLine());
        System.out.print("Informe o telefone/whatsapp do funcionário: ");
        this.setTel(scan.nextLine());
        System.out.print("Informe o e-mail do funcionário: ");
        this.setEmail(scan.nextLine());
        System.out.print("Informe o endereço completo do funcionário: ");
        this.setAddress(scan.nextLine());
        System.out.print("Informe o cargo do funcionário: ");
        this.setPosition(scan.nextLine());
        System.out.print("Informe a quantidade de horas trabalhadas pelo funcionário: ");
        this.setWorkHours(scan.nextInt());
        System.out.print("Informe o salário fixo do funcionário: ");
        this.setSalary(scan.nextLine());
        System.out.print("Informe a data de contratação do funcionário: ");
        //this.setContractDate(scan.());
    }
    
    public void printEmployee() {
        System.out.println("******* Dados do Funcionário *******");
        System.out.print("Nome: " + this.getName());
        System.out.print("CPF: " + this.getCpf());
        System.out.print("Telefone/Whatsapp: " + this.getTel());
        System.out.print("E-mail: " + this.getEmail());
        System.out.print("Endereço: " + this.getAddress());
        System.out.print("Cargo: " + this.getPosition());
        System.out.print("Horas Trabalhadas: " + this.getWorkHours());
        System.out.print("Salário Fixo: " + this.getSalary());
        System.out.print("Data de Contratação: " + this.getContractDate());
        System.out.println("*******************************");
    }
    
    public String printEmployeeToString() {
        String out = "";
        out = "******* Dados do Funcionário *******\n"
                + "Nome: " + this.getName() + "\n"
                + "CPF: " + this.getCpf() + "\n"
                + "Telefone/Whatsapp: " + this.getTel() + "\n"
                + "E-mail: " + this.getEmail() + "\n"
                + "Endereço: " + this.getAddress() + "\n"
                + "Cargo: " + this.getPosition() + "\n"
                + "Horas Trabalhadas: " + this.getWorkHours()+ "\n"
                + "Salário Fixo: " + this.getSalary()+ "\n"
                + "Data de Contração: " + this.getContractDate()+ "\n"
                + "***********************************\n";
        return out;
    }
    
    public void copyEmployee(Employee other) {
        this.setName(other.getName());
        this.setCpf(other.getCpf());
        this.setTel(other.getTel());
        this.setEmail(other.getEmail());
        this.setAddress(other.getAddress());
        this.setPosition(other.getPosition());  
        this.setWorkHours(other.getWorkHours());
        this.setSalary(other.getSalary());
        this.setContractDate(other.getContractDate());
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
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return the workHours
     */
    public int getWorkHours() {
        return workHours;
    }

    /**
     * @param workHours the workHours to set
     */
    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    /**
     * @return the salary
     */
    public String getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(String salary) {
        this.salary = salary;
    }

    /**
     * @return the contractDate
     */
    public Date getContractDate() {
        return contractDate;
    }

    /**
     * @param contractDate the contractDate to set
     */
    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

 
   
}

