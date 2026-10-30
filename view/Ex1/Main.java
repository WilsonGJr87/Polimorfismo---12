package view.Ex1;

import model.Ex1.*;

public class Main {
    public static void main(String[] args) {
        Produto prod1 = new Produto("prod1");
        Produto prod2 = new Produto("prod2",50.5);
        Produto prod3 = new Produto("prod3",30.5,5);

        prod1.informacoes();
        System.out.println("====================");
        prod2.informacoes();
        System.out.println("====================");
        prod3.informacoes();
    }
}