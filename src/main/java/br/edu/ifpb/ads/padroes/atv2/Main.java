package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.element.ItemTributavel;
import br.edu.ifpb.ads.padroes.atv2.element.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.element.Servico;
import br.edu.ifpb.ads.padroes.atv2.visitor.ImpressaoValoresVisitor;
import br.edu.ifpb.ads.padroes.atv2.visitor.RelatorioImpostosVisitor;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ItemTributavel> itens = List.of(
                new ProdutoFisico("Notebook", 3000.00),
                new ProdutoFisico("Monitor", 1200.00),
                new Servico("Consultoria", 2000.00)
        );

        ImpressaoValoresVisitor impressaoValoresVisitor = new ImpressaoValoresVisitor();
        RelatorioImpostosVisitor relatorioImpostosVisitor = new RelatorioImpostosVisitor();

        System.out.println("Valores dos itens:");
        itens.forEach(item -> item.aceitar(impressaoValoresVisitor));

        System.out.println();
        System.out.println("Relatório de impostos:");
        itens.forEach(item -> item.aceitar(relatorioImpostosVisitor));

        System.out.printf("%nTotal de impostos: R$ %.2f%n", relatorioImpostosVisitor.getTotalImpostos());
    }
}
