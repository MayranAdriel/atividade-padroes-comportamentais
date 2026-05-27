package br.edu.ifpb.ads.padroes.atv1.observer;

import br.edu.ifpb.ads.padroes.atv1.interest.InteresseDisco;
import br.edu.ifpb.ads.padroes.atv1.model.Disco;
import br.edu.ifpb.ads.padroes.atv1.notification.CanalNotificacao;

public class Interessado {

    private final InteresseDisco interesse;
    private final CanalNotificacao canalNotificacao;

    public Interessado(InteresseDisco interesse, CanalNotificacao canalNotificacao) {
        this.interesse = interesse;
        this.canalNotificacao = canalNotificacao;
    }

    public void notificarSeHouverInteresse(Disco disco) {
        if (interesse.corresponde(disco)) {
            canalNotificacao.enviar(interesse.criarMensagem(disco));
        }
    }
}
