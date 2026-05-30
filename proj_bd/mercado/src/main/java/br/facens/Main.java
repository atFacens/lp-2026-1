package br.facens;

import br.facens.dao.ClienteDAO;
import br.facens.model.Cliente;

public class Main {
    public static void main(String[] args) {
        // ClienteDAO.conectarBD();
        // ClienteDAO.createTable();

        Cliente cliente = new Cliente(2, "Ana", "ana@email.com");

        boolean inserido = ClienteDAO.insertCliente(cliente);

        if(inserido) {
            System.out.println("Cliente cadastrado com sucesso!");
        } else {
            System.out.println("Não foi possível cadastrar o cliente.");
        }
    }
}