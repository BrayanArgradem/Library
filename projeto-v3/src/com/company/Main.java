package com.company;

import LIvro.Livro;

public class Main {

    public static void main(String[] args) {
        Livro livro1 = new Livro("Como fazer sentido e bater o martelo", "Alexandro Aolchique", 2017);

        System.out.println("Olá! o que voce deseja fazer?\n");
        System.out.println("1 - Lista de livros");
        System.out.println("2 - Doar um livro");
        System.out.println("3 - Retirar um livro");
        System.out.println("4 - Devolver um livro");
        System.out.println("0 - Sair\n");
    }
}
