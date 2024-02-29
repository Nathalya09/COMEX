package br.com.alura.comex;

public class Main {
    public static void main(String[] args) {
        Produto novoProduto = new Produto("Lápis",2.5, "Descrição: 2B",20);
        Produto novoProduto2 = new Produto("Caneta",5.0,"Descricao: Azul",25);


        if (novoProduto.equals(novoProduto2)){
            System.out.println("Os produtos são iguais!");
        } else {
            System.out.println("Os produtos são diferentes!");
        }
        System.out.println(novoProduto.toString());
    }
}
