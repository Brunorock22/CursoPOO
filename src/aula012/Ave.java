package aula012;

public class Ave extends Animal {
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Voar");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer ");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }
}

