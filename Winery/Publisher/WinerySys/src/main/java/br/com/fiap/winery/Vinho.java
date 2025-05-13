package br.com.fiap.winery;

public class Vinho {
    private String nome;
    private int preco;
    private String tipoUva;

    public Vinho(String nome, int preco, String tipoUva) {
        this.nome = nome;
        this.preco = preco;
        this.tipoUva = tipoUva;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getTipoUva() {
        return tipoUva;
    }

    public void setTipoUva(String tipoUva) {
        this.tipoUva = tipoUva;
    }
}
