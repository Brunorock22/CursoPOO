package aula09;

public class Aluno extends Pessoas {
    private int matricula;
    private String curso;

    public Aluno(String s) {
        super(s);
    }

    public Aluno() {

    }

    public void cancelarMatricula(){
        System.out.println(" Matricula Cancelada");
    }




    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
