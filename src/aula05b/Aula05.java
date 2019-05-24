package aula05b;

public class Aula05 {
    public static void main(String[]args) {
        ContaCorrente jose = new ContaCorrente();
        jose.setNumConta(1111);
        jose.setNome("Bruno");
        jose.setTipo("CC");
        jose.setStatus(false);
        jose.abrirConta("cc");
        jose.depositar(150);
        jose.saque(300);
        jose.estrato();
    }
}
