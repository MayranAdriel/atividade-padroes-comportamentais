package br.edu.ifpb.ads.padroes.atv1.interest;

import br.edu.ifpb.ads.padroes.atv1.model.Disco;

public class InteressePorGenero implements InteresseDisco {

    private final String genero;

    public InteressePorGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean corresponde(Disco disco) {
        return disco.getGenero().toLowerCase().contains(genero.toLowerCase());
    }

    @Override
    public String criarMensagem(Disco disco) {
        return "Novo disco do gênero: " + disco.getGenero();
    }
}
