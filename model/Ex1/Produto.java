package model.Ex1;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome) {
        this.nome = nome;
    }
    public Produto(String nome, double preco) {

        if (preco < 0)
            preco = 0;

        this.nome = nome;
        this.preco = preco;
    }
    public Produto(String nome, double preco, int estoque) {
        if (preco < 0)
            preco = 0;
        if (estoque < 0)
            estoque = 0;

        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void informacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Estoque: " + this.estoque);
    }
}