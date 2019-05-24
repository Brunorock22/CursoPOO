package aula05b;

public class ContaCorrente {
    public int numConta;
    protected String tipo;
    private String nome;
    private float saldo;
    private boolean status;

    public  ContaCorrente(){
        saldo = 0;
        status = false;
    }

    public void setNumConta(int num) {
        this.numConta = num;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setTipo(String tip) {
        this.tipo = tip;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNome(String nom) {
        this.nome = nom;
    }

    public String getNome() {
        return nome;
    }

    public void setSaldo(float sal) {
        this.saldo = sal;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setStatus(boolean stat) {
        this.status = stat;
    }

    public void abrirConta(String tipodeConta){
        setTipo(tipodeConta);
        setStatus(true);
        if(tipodeConta.equalsIgnoreCase("CC")){
            setSaldo(getSaldo()+50);
        }else if(tipodeConta.equalsIgnoreCase("CP")){
            setSaldo(getSaldo()+150);
        }
    }

    public void fecharConta(){
        if (saldo>0)
            System.out.println("Conta com dinheiro");
        else if(saldo<0)
            System.out.println("Conta Negativada");
        else
            setStatus(false);
    }

    public void depositar(float valor){
        if (status==true){
            setSaldo(getSaldo()+valor);
        }else
            System.out.println("Impossivel depositar");
    }

    public void saque(float saq){
        if(status==true && saldo>0){
            setSaldo(getSaldo()-saq);
        }else
            System.out.println("Impossivel sacar");
    }

    public void pagarMensalidade(){
        float v;
        if (tipo.equalsIgnoreCase("CP"))
            v=12;
        else
            v=20;
        if(status==true && saldo>v){
            setSaldo(getSaldo()-v);
        }
    }

    public void estrato(){
        System.out.println(numConta);
        System.out.println(tipo);
        System.out.println(nome);
        System.out.println(saldo);
        System.out.println(status);
    }
}
