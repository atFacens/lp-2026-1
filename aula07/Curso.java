public class Curso {
    private String nome;
    private int numeroSemestres;
    
    public Curso(String nome, int numeroSemestres) {
        this.nome = nome;
        this.numeroSemestres = numeroSemestres;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroSemestres() {
        return numeroSemestres;
    }
}
