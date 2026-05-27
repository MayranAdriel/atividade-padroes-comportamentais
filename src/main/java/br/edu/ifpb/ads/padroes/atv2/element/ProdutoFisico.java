package br.edu.ifpb.ads.padroes.atv2.element;

import br.edu.ifpb.ads.padroes.atv2.visitor.ItemVisitor;

public class ProdutoFisico implements ItemTributavel {

    private final String nome;
    private final double valor;

    public ProdutoFisico(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public void aceitar(ItemVisitor visitor) {
        visitor.visitar(this);
    }
}
