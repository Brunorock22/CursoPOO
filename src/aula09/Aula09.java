package aula09;

import aula08.Pessoa;

public class Aula09 {
    public static void main(String[]args){
        Pessoas p1 = new Pessoas();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Bruno");
        p2.setNome("Maria");
        p3.setNome("Ze");
        p4.setNome("Mario");

        p1.setIdade(21);
        p4.setSexo("M");
        p3.setSexo("M");
        p2.setIdade(33);

        p2.setCurso("Sistemas");
        p3.setEspecialidade("Neurologia");
        p4.setSetor("Tecnologia");
        p3.receberAumento(500);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
