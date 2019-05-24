package aula012;

public class Peixe extends Animal {
    private String corEsacama;
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo suibstancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixa não emite som");
    }
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }
}
