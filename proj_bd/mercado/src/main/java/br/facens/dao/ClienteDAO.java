package br.facens.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import br.facens.model.Cliente;

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

    public static void createTable() {
        String sql = "create table cliente (id int, nome varchar(150), email varchar(100) );";

        try (
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
        ) {
            statement.executeUpdate(sql);
            System.out.println("Tabela criada com sucesso!");
            
        } catch (Exception e) {
            System.out.println("Erro ao criar a tabela: " + e.getMessage());
        }
    }

    public static boolean insertCliente(Cliente cliente) {
        String sql = "insert into cliente (id, nome, email) values (?,?,?)"; 

        try (
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            
            preparedStatement.setInt(1, cliente.getId());
            preparedStatement.setString(2, cliente.getNome());
            preparedStatement.setString(3, cliente.getEmail());

            int result = preparedStatement.executeUpdate();
            
            return (result > 0);

        } catch (Exception e) {
            System.out.println("Erro ao inserir o cliente: " + e.getMessage());
        }
        return false;
    }
}
