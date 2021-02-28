package dao;

import classes.Client;
import connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientDAO {
    private DBConnection dbConnection;
    private Connection conn;
    
    public ClientDAO() {
        this.dbConnection = new DBConnection();
        this.conn = this.dbConnection.getConnection();
    }
    
    public void insert(Client client) {
        String insertPerson = "INSERT INTO person(name, cpf, tel, address, email) VALUES " + "(?, ? , ? , ?, ?)";
        //String insertClient = "INSERT INTO client(id_client) VALUES (SELECT id_person FROM person WHERE cpf='" + client.getCpf();
        try {
            PreparedStatement stmt = this.conn.prepareStatement(insertPerson);
            stmt.setString(1, client.getName());
            stmt.setString(2, client.getCpf());
            stmt.setString(3, client.getTel());
            stmt.setString(4, client.getAddress());
            stmt.setString(5, client.getEmail());
            stmt.execute();
            //PreparedStatement stmt2 = this.conn.prepareStatement(insertClient);
            //stmt2.execute();
        } catch (SQLException error) {
            System.out.println("Erro ao inserir um cliente: " + error.getMessage());
        }
    }
}
