package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
    public Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lps_oficina?serverTimeZone=UTC", // linha de conexão
                "root", // usuario
                "" // senha
            );
            return conn;
        } catch(SQLException error) {
            System.out.println("Erro de conexão com o banco de dados: " + error.getMessage());
            return null;
        }                
    }
}
