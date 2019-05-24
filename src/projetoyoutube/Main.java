package projetoyoutube;

public class Main {
    public static void main(String[]args){
        Video v[]= new Video[3];
        v[0]= new Video("Aula 1 Poo");
        v[1]= new Video("Aula 1 HTML");
        v[2]= new Video("Aula 1 CSS");
        System.out.println(v[0].toString());

        Gafanhoto g[]=new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubiliu",22,"M",0,"Brun");
        g[1] = new Gafanhoto("Karla",52,"F",0,"KKK");



//        System.out.println("VIDEIOS\n--------------------");
//        System.out.println(v[0].toString());
//        System.out.println(v[1].toString());
//        System.out.println(v[2].toString());
//        System.out.println("\nGARANHATOS\n------------------");
//        System.out.println(g[0].toString());
//        System.out.println(g[1].toString());


        Visualizacao vis[]= new Visualizacao[5];
        System.out.println(vis.toString());
        vis[0]=new Visualizacao(g[0],v[2]);
        System.out.println(vis[0].toString());
        vis[1]=new Visualizacao(g[0],v[1]);
        System.out.println(vis[1].toString());

        vis[0].avaliar(30f);
        System.out.println(vis[0].toString());
    }
}
