public class Pessoa {
    private String nome;
    private int idade;

    // default
    public Pessoa() {

    }
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        setIdade(idade);
    }


    public void apresentar() {
        System.err.println("Olá! Sou o(a) " + nome);
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        if (idade >= 18 && idade < 81) {
            this.idade = idade;
        }
    }

    public void envelhecer() {
        idade++;
    }

    public String exibirDados() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
    }

    
}
