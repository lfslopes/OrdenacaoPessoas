package Pessoa;

import java.util.Locale;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private double altura;
    private int idade;

    public Pessoa() {
    }
    public Pessoa(String nome, double altura, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return this.getNome().compareTo(pessoa.getNome());
    }

    @Override
    public String toString() {
        return this.getNome() + " de " + this.getIdade() + " anos de idade e " +
                String.format(Locale.forLanguageTag("BR"), "%.2f", this.getAltura()) + " metros de altura";
    }
}
