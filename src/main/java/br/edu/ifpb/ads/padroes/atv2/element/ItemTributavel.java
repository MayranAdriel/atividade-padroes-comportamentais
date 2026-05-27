package br.edu.ifpb.ads.padroes.atv2.element;

import br.edu.ifpb.ads.padroes.atv2.visitor.ItemVisitor;

public interface ItemTributavel {

    String getNome();

    double getValor();

    void aceitar(ItemVisitor visitor);
}
