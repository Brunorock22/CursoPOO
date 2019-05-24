package aula04b;

public class Aula04 {
    public static void main(String[]args) {
        Caneta c1 = new Caneta("Faber ","Azul",0.5f);


        Caneta c2 = new Caneta("BIC","Preta",0.7f);


        System.out.println("Tenho uma caneta "+c1.getModelo()+" de ponta:"+c1.getPonta());

    }
}
