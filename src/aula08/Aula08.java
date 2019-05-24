package aula08;

public class Aula08 {
    public static void main(String[]args){
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0]= new Pessoa("Bruno,"+22+"M");
        p[1]= new Pessoa("Ana,"+21+"F");

        l[0]= new Livro("Aprendendo Java","J.k",300,p[0]);
        l[1]= new Livro("Aprendendo Python","Alguem ",500,p[1]);
        l[2]= new Livro("Aprendendo JavaScript","Maluco no Pedaço ",50000,p[1]);

        System.out.println(l[1].detalhes());

    }
}
