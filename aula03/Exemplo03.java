import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;

        System.out.println("Digite o nome do usuário:");
        nome = entrada.nextLine();

        // if(nome.equals("xpto")) {
        if(nome.equalsIgnoreCase("xpto")) {
            System.out.println("Usuário autorizado");
        } else {
            System.out.println("Erro");
        }

        entrada.close();
    }
}
