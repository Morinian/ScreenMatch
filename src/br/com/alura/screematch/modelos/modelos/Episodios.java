package br.com.alura.screematch.modelos.modelos;

import br.com.alura.screematch.modelos.calculos.Classificavel;

public class Episodios implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private String descricao;
    private int totalVisulizacoes;

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisulizacoes() {
        return totalVisulizacoes;
    }

    public void setTotalVisulizacoes(int totalVisulizacoes) {
        this.totalVisulizacoes = totalVisulizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if( totalVisulizacoes > 100){
            return 4;
        } else {
            return 2;
        }
    }
}
