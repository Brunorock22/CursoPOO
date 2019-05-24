package aula04b;

public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampar;
    private String cor;

    public Caneta(String bic, String preta, float v) {
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampar() {
        return tampar;
    }

    public void setTampar(boolean tampar) {
        this.tampar = tampar;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
