package aula013;

public class Main {
    public static void main(String[]args) {
        Cachorro cachorro = new Cachorro();

        cachorro.reagir(true);
        cachorro.emitirSom();

        Lobo lobo= new Lobo();
        lobo.emitirSom();

    }
}
