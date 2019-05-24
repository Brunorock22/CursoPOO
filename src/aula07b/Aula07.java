package aula07b;

import java.util.Scanner;

public class Aula07 {
    public static void main (String[]args){
        Lutador lutador[]=new Lutador[6];
        lutador[1]=new Lutador("Bruno","Peso-pena","Brasileiro",35,1.90f,80);
        lutador[2]=new Lutador("Rodrigo","Peso-pena","Brasileiro",35,1.90f,80);
        lutador[3]=new Lutador("adbha","Peso-pena","Brasileiro",35,1.90f,80);



        Luta luta =new Luta();
        luta.marcarLuta(lutador[1],lutador[3]);

        luta.luta();
        lutador[1].status();
        lutador[3].status();

    }
}
