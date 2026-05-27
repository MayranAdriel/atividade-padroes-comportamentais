package br.edu.ifpb.ads.padroes.atv2.visitor;

import br.edu.ifpb.ads.padroes.atv2.element.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.element.Servico;

public class RelatorioImpostosVisitor implements ItemVisitor {

    private double totalImpostos;

    @Override
    public void visitar(ProdutoFisico produtoFisico) {
        double imposto = produtoFisico.getValor() * 0.10;
        totalImpostos += imposto;

        System.out.printf(
                "Produto físico: %s | Valor: R$ %.2f | Imposto: R$ %.2f%n",
                produtoFisico.getNome(),
                produtoFisico.getValor(),
                imposto
        );
    }

    @Override
    public void visitar(Servico servico) {
        double imposto = servico.getValor() * 0.15;
        totalImpostos += imposto;

        System.out.printf(
                "Serviço: %s | Valor: R$ %.2f | Imposto: R$ %.2f%n",
                servico.getNome(),
                servico.getValor(),
                imposto
        );
    }

    public double getTotalImpostos() {
        return totalImpostos;
    }
}
