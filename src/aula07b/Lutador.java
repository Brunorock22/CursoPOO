package aula07b;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private String categoria;
    private int idade;
    private int vitorias;
    private int derrotas;
    private int empates;
    private float peso;
    private float altura;

    public  Lutador(String nome,String categoria,String nacionalidade,int idade, float altura,float peso){
        this.nome=nome;
        this.categoria=categoria;
        this.nacionalidade=categoria;
        this.idade=idade;
        this.altura=altura;
        this.peso=peso;

    }

    public void ganharLuta(){
        setVitorias(getVitorias()+1);
    }
    public void empatarLuta(){
        setEmpates(getEmpates()+1);
    }
    public void perderLuta(){
        setDerrotas(getDerrotas()+1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void apresentar(){
        System.out.println("Este e o "+getNome()+" nacionalidade "+getNacionalidade()+" da categoria "+getCategoria()+" idade de "+getIdade());
    }
    public void status(){
        System.out.println("Numero de vitorias "+getVitorias());
        System.out.println("Numero de derrotas "+getDerrotas());
        System.out.println("Numero de empates "+getEmpates());
    }
}
