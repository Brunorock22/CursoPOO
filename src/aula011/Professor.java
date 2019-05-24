package aula011;

public class Professor extends Pessoa {
    private String especialidade;
    private  int salario;

    public void receberSalario(){
        setSalario(getSalario()+500);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                 '\'' +
                ", salario=" + salario +
                ", nome='" + nome ;
    }
}
