package aula07b;

import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;
    public void marcarLuta(Lutador lutador1, Lutador lutador2){
        if ( lutador1!= lutador2) {
            this.aprovada = true;
            this.desafiado = lutador1;
            this.desafiante = lutador2;
        }else{
                this.aprovada=false;
                this.desafiado=null;
                this.desafiante=null;
        }

    }
    public void luta(){
        if (this.aprovada){
            System.out.println("%%%%%%%%%DESAFIADO%%%%%%%%");
            this.desafiante.apresentar();
            this.desafiado.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
                case 0://Empate
                    System.out.println("EMPATOU");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1://Desafiante vence
                    System.out.println("Desafiante vence");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2://dafiado vende
                    System.out.println("Desafiado vende");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
            }
        }else{
            System.out.println("Essa luta não pode acontecer");
        }
    }

}
