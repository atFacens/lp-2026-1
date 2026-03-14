public class Exemplo02 {
    public static void main(String[] args) {
        int numeroInt = 18;
        double numeroDouble;

        numeroDouble = numeroInt;
        // 18.0

        System.out.println(numeroInt);
        System.out.println(numeroDouble);

        numeroDouble = 18.999;
        // numeroInt = numeroDouble; Erro
        numeroInt = (int) numeroDouble; // Casting: conversão forçada

        System.out.println(numeroInt);
    }
}
