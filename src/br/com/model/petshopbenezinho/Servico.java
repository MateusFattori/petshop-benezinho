package br.com.model.petshopbenezinho;

public class Servico {

    private int id;
    private String nome;
    private Double valor;
    private String descricacao;
    private String obeservacao;

    public Servico() {

    }

    public Servico(int id, String nome, Double valor, String descricacao, String obeservacao) {
        this.setId(id);
        this.setNome(nome);
        this.setValor(valor);
        this.setDescricacao(descricacao);
        this.setObeservacao(obeservacao);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricacao() {
        return descricacao;
    }

    public void setDescricacao(String descricacao) {
        this.descricacao = descricacao;
    }

    public String getObeservacao() {
        return obeservacao;
    }

    public void setObeservacao(String obeservacao) {
        this.obeservacao = obeservacao;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", valor=" + getValor() +
                ", descricacao='" + getDescricacao() + '\'' +
                ", obeservacao='" + getObeservacao() + '\'' +
                '}';
    }
}
