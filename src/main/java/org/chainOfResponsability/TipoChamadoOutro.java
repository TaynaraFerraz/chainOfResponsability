package org.chainOfResponsability;

public class TipoChamadoOutro implements TipoChamado {

    private static TipoChamadoOutro tipoChamadoOutro = new TipoChamadoOutro();

    private TipoChamadoOutro() {};

    public static TipoChamadoOutro getTipoChamadoOutro() {
        return tipoChamadoOutro;
    }
}
