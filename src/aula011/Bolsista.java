package aula011;

public class Bolsista extends Aluno {
    private Float bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de "+getNome());
    }

    public Float getBolsa() {
        return bolsa;
    }

    public void setBolsa(Float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public void  pagarMensalidade(){
        System.out.println(getNome()+" é um bolsista");
    }
}
