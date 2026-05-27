package br.edu.ifpb.ads.padroes.atv1.interest;

import br.edu.ifpb.ads.padroes.atv1.model.Disco;

public class InteressePorArtista implements InteresseDisco {

    private final String artista;

    public InteressePorArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public boolean corresponde(Disco disco) {
        return disco.getArtista().toLowerCase().contains(artista.toLowerCase());
    }

    @Override
    public String criarMensagem(Disco disco) {
        return "Novo disco do artista: " + disco.getArtista();
    }
}
