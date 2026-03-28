package model;

import enums.Categoria;
import enums.Tamanho;

import java.math.BigDecimal;

public class Roupa {
    private String nome;
    private Tamanho tamanho;
    private BigDecimal preco;
    private String cor;
    private Categoria categoria;

    public Roupa() {
    }

    public Roupa(String nome, Tamanho tamanho, BigDecimal preco, String cor, Categoria categoria) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.preco = preco;
        this.cor = cor;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Roupas{" +
                "nome='" + nome + '\'' +
                ", tamanho=" + tamanho +
                ", preco=" + preco +
                ", cor='" + cor + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
