package br.com.empresa;

public class Pessoa {
    private String nome;
    private float altura;
    private float peso;
    private int idade;
    
    public Pessoa(String nome, int idade,  float altura, float peso) {
        this.nome = nome;
        this.idade= idade;
        this.altura = altura;
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    public void imprimirPessoa(){
        System.out.println("Nome:\t"+this.getNome());
        System.out.println("Idade:\t"+this.getIdade());
        System.out.printf("Altura:\t%.2f\n",this.getAltura());
        System.out.printf("Peso:\t%.2f\n",this.getPeso());
        System.out.println();
    }
    public void aniversario(){
        idade ++;
    }

}

