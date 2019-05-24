package aula06b;

public class Controle {
    private boolean ligado;
    private boolean tocando;
    private int volume;

    public Controle(){
        this.volume=50;
        this.ligado=false;
        this.tocando=false;
    }

    public void ligar(){
        setLigado(true);
    }
    public void desligar(){
        setLigado(false);
    }
    public void abrirMenu(){
        System.out.println(getLigado());
        System.out.println(getTocando());
        System.out.println(getVolume());
    }
    public void fecharMenu(){
        System.out.println("MENU FECHADO");
    }
    public void maisVolume(){
        if(ligado == true)
        setVolume(getVolume()+5);
    }
    public void menosVolume(){
        if (ligado==true)
        setVolume(getVolume()-5);
    }
    public void ligarMudo(){
        if (ligado==true && volume>=0)
            setVolume(0);
    }
    public void desligarMudo(){
        if (ligado==true && volume==0)
            setVolume(50);
    }
    public void play(){
        if (ligado==true && tocando ==false)
            setTocando(true);
    }
    public void pause(){
        if (ligado==true && tocando == true)
        setTocando(false);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int vol) {
        this.volume = vol;
    }
    public boolean getLigado(){
        return ligado;
    }

    public void setLigado(boolean lig) {
        this.ligado = lig;
    }

    public boolean getTocando(){
        return tocando;
    }
    public void setTocando(boolean toc){
        this.tocando=toc;
    }
    public void status(){
        System.out.println(ligado);
        System.out.println(volume);
        System.out.println(tocando);
    }
}
