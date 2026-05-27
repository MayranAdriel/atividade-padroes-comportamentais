package br.edu.ifpb.ads.padroes.atv2.visitor;

import br.edu.ifpb.ads.padroes.atv2.element.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.element.Servico;

public class ImpressaoValoresVisitor implements ItemVisitor {

    @Override
    public void visitar(ProdutoFisico produtoFisico) {
        System.out.printf(
                "Produto físico: %s | Valor: R$ %.2f%n",
                produtoFisico.getNome(),
                produtoFisico.getValor()
        );
    }

    @Override
    public void visitar(Servico servico) {
        System.out.printf(
                "Serviço: %s | Valor: R$ %.2f%n",
                servico.getNome(),
                servico.getValor()
        );
    }
}
