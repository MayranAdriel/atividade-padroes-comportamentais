package br.edu.ifpb.ads.padroes.atv1.interest;

import br.edu.ifpb.ads.padroes.atv1.model.Disco;

public interface InteresseDisco {

    boolean corresponde(Disco disco);

    String criarMensagem(Disco disco);
}
