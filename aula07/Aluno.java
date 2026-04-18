public class Aluno extends Pessoa {
    private long ra;
    private Curso curso;

    // public Aluno() {
    // // super(); desnecessário
    // }

    public Aluno(String nome, int idade, Curso curso) {
        super(nome, idade);
        if (curso == null) {
            this.curso = new Curso("Não cursando", 0);
        } else {
            this.curso = curso;
        }
    }

    public long getRa() {
        return ra;
    }

    public void setRa(long ra) {
        this.ra = ra;
    }

    public String nomeCurso() {
        // if(curso == null) return "não cadastrado";
        return curso.getNome();
    }
}
