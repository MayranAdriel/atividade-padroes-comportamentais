package br.edu.ifpb.ads.padroes.atv1.interest;

import br.edu.ifpb.ads.padroes.atv1.model.Disco;

public class InteressePorTitulo implements InteresseDisco {

    private final String titulo;

    public InteressePorTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean corresponde(Disco disco) {
        return disco.getTitulo().toLowerCase().contains(titulo.toLowerCase());
    }

    @Override
    public String criarMensagem(Disco disco) {
        return "Novo disco adicionado: " + disco.getTitulo();
    }
}
