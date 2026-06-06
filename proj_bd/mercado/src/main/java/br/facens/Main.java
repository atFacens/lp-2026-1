package br.facens;

import br.facens.dao.ClienteDAO;
// import br.facens.model.Cliente;
import br.facens.model.Cliente;

public class Main {
    public static void main(String[] args) {
        // ClienteDAO.conectarBD();
        // ClienteDAO.createTable();

        // Cliente cliente = new Cliente(2, "Ana", "ana@email.com");

        // boolean inserido = ClienteDAO.insertCliente(cliente);

        // Cliente cliente = ClienteDAO.buscarCliente(20); 
        // if(cliente != null) {
        //     System.out.println("Encontrado: " + cliente);
        // } else {
        //     System.out.println("Não foi possível encontrar o cliente.");
        // }

        // boolean atualizou = ClienteDAO.atualizarEmail(2, "ana.santos@email.com");
        // if(atualizou) {
        //     System.out.println("Email atualizado: ");
        //     System.out.println(ClienteDAO.buscarCliente(2));
        // } else {
        //     System.out.println("Não foi possível atualizar");
        // }

        boolean apagou = ClienteDAO.apagar(2);

        if(apagou) {
            System.out.println("Cliente apagado");
        } else {
            System.out.println("Não foi possível apagar");
        }

        Cliente cliente = ClienteDAO.buscarCliente(2); 
        if(cliente != null) {
            System.out.println("Encontrado: " + cliente);
        } else {
            System.out.println("Não foi possível encontrar o cliente.");
        }

    }
}