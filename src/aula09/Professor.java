package aula09;

public class Professor extends Pessoas {
    private String especialidade;
    private float salario;

    public Professor(String s) {
        super(s);
    }

    public Professor() {

    }

    public void receberAumento( float aum){
        setSalario(getSalario() + aum);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
