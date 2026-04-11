public class App {
    public static void main(String[] args) {
        Pessoa p;

        p = new Pessoa();
        p = new Pessoa("Emerson", 23);

        p.envelhecer();
        
        // p.nome = "Emerson";
        // p.idade = 345;
        // p.setIdade(34);
        // p.setIdade(345);

        System.out.println(p.exibirDados());
    }
}
