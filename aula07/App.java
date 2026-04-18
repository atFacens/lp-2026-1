public class App {
    public static void main(String[] args) {
        Pessoa p;

        // p = new Pessoa();
        p = new Pessoa("Emerson", 23);

        p.envelhecer();
        
        // p.nome = "Emerson";
        // p.idade = 345;
        // p.setIdade(34);
        // p.setIdade(345);

        System.out.println(p.exibirDados());
        
        Curso curso = null; // new Curso("ADS", 6);

        Aluno aluno = new Aluno("Paduan", 34, curso);

        // aluno.setIdade(19);
        System.out.println(aluno.exibirDados());
        System.out.println(aluno.nomeCurso());
    }
}
