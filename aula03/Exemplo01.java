public class Exemplo01 {
    public static void main(String[] args) {
        int idade = 19;
        
        String resposta = verificaIdade(idade);

        System.out.println(resposta);
        
    }

    static String verificaIdade(int idade) {
        // if(idade >= 18) {
        //     return "Maior de idade";
        // } 
        // return "Menor de idade";

        return (idade >= 18) ? "Maior de idade" : "Menor de idade" ;
    }

}
