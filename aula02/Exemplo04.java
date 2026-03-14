public class Exemplo04 {
    public static void main(String[] args) {
        int cont;

        cont = 1;

        while (cont < 5) {
            System.out.println(cont);
            cont++;
        }

        System.out.println("Final " + cont);


        for (int i = 1; i < 5; i++) {
            System.out.println(i);
        }

        // System.out.println("Final " + i); // Erro
    }
}
