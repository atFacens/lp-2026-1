public class Exemplo04 {
    public static void main(String[] args) {
        int valores[] = {5, 7, 8, 10, 13, 16, 20};

        valores[2] = 99;


        for(int i = 0; i < valores.length; i++) {
            System.out.println("v[" + i + "] = "+ valores[i]);
        }
    }
}
