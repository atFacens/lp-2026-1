package br.facens.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import br.facens.model.Product;

public class ProductDAO {
    private static String url = "jdbc:mysql://localhost:3306/bd_final_facens";
    private static String user = "profFacens";
    private static String password = "aula";

    public static boolean createProduct(Product product) {
        String sql = "insert into product (name, description, value) values (?, ?, ?);";
        try (
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setDouble(3, product.getValue());

            return (preparedStatement.executeUpdate() > 0);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return false;
    }
}
