package br.edu.ifpb.ads.padroes.atv1;

import br.edu.ifpb.ads.padroes.atv1.interest.InteressePorArtista;
import br.edu.ifpb.ads.padroes.atv1.interest.InteressePorGenero;
import br.edu.ifpb.ads.padroes.atv1.interest.InteressePorTitulo;
import br.edu.ifpb.ads.padroes.atv1.model.Disco;
import br.edu.ifpb.ads.padroes.atv1.notification.NotificacaoEmail;
import br.edu.ifpb.ads.padroes.atv1.notification.NotificacaoPush;
import br.edu.ifpb.ads.padroes.atv1.notification.NotificacaoSms;
import br.edu.ifpb.ads.padroes.atv1.observer.Interessado;
import br.edu.ifpb.ads.padroes.atv1.repository.RepositorioDiscos;

public class Main {

    public static void main(String[] args) {
        RepositorioDiscos repositorio = new RepositorioDiscos();

        repositorio.adicionarInteressado(
                new Interessado(new InteressePorTitulo("Thriller"), new NotificacaoEmail())
        );

        repositorio.adicionarInteressado(
                new Interessado(new InteressePorArtista("Michael Jackson"), new NotificacaoSms())
        );

        repositorio.adicionarInteressado(
                new Interessado(new InteressePorGenero("Pop"), new NotificacaoPush())
        );

        repositorio.addDisco(new Disco("Michael Jackson", "Thriller", "Pop", 1982));
    }
}
