package br.com.alura.comex;

public class Produto {
    private String nomeProduto;
    private double precoProduto;

    private String descricao;

    private int quantidade;

    public String getNomeProduto() {
        return nomeProduto;
    }
    

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco, String descricao, int quantidade){
        this.nomeProduto = nome;
        this.precoProduto = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", precoProduto=" + precoProduto +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}
