package br.edu.ifpa.laboratorio.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
    // URL do banco de dados que criamos no script SQL
    private static final String URL = "jdbc:mysql://localhost:3306/controle_laboratorio?useTimezone=true&serverTimezone=UTC";

    // Usuário padrão do MySQL (geralmente é root)
    private static final String USER = "root";

    // ATENÇÃO: Coloque aqui a senha do seu banco de dados MySQL!
    private static final String PASSWORD = "@Raizanunes0915";

    // Método responsável por abrir e retornar a conexão
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
