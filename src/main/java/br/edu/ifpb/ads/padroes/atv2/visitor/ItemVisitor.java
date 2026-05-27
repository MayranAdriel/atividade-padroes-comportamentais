package br.edu.ifpb.ads.padroes.atv2.visitor;

import br.edu.ifpb.ads.padroes.atv2.element.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.element.Servico;

public interface ItemVisitor {

    void visitar(ProdutoFisico produtoFisico);

    void visitar(Servico servico);
}
