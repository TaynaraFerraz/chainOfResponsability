package org.chainOfResponsability;

public class TipoChamadoDuvida implements TipoChamado {

    private static TipoChamadoDuvida tipoChamadoDuvida = new TipoChamadoDuvida();

    private TipoChamadoDuvida() {};

    public static TipoChamadoDuvida getTipoChamadoDuvida() {
        return tipoChamadoDuvida;
    }
}
