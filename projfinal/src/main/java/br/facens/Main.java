package br.facens;

import br.facens.dao.ProductDAO;
import br.facens.model.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Mouse Gamer","Mouse ultra rápido com regulagem de PDI", 200);

        boolean inserted = ProductDAO.createProduct(product);

        if(inserted) {
            System.out.println("Produto cadastrado com sucesso!");
        } else {
            System.out.println("Falha ao cadastrar o produto...");
        }
    }
}