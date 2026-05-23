package br.facens.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ClienteDAO {
    private static final String url = "jdbc:mysql://localhost:3306/bd_lp2026_facens";
    private static final String user = "profFacens"; // root
    private static final String password = "aula"; // root

    public static void conectarBD() {
        Connection connection;
        try {
            System.out.println("Tentando conectar...");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado com sucesso");
            connection.close();
            System.out.println("Conexão encerrada");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }


}
