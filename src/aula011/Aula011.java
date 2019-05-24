package aula011;

public class  Aula011 {
    public static void main(String[]args) {
//    Visitante v1 = new Visitante();
//    v1.setIdade(22);
//    v1.setNome("Jefin");
//    v1.setSexo("Macho");
//    System.out.println(v1.toString());
//    }

        Aluno a1 = new Aluno ();
        a1.setCurso("Informatica");
        a1.setIdade(22);
        a1.setNome("Rodrigo");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Jose");
        b1.pagarMensalidade();

        Tecnico t1 = new Tecnico();
        t1.setNome("Bruno ");
        t1.praticar();

        Professor p1= new Professor();
        p1.nome="Eduardo";
        p1.setSalario(1000);
        p1.receberSalario();
        System.out.println(p1.toString());

        Visitante v1 = new Visitante();
        v1.setNome("Marcio");
        v1.cracha();
    }
}
