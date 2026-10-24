package org.chainOfResponsability;

public class TipoChamadoVulnerabilidade implements TipoChamado {

    private static TipoChamadoVulnerabilidade tipoChamadoVulnerabilidade = new TipoChamadoVulnerabilidade();

    private TipoChamadoVulnerabilidade() {};

    public static TipoChamadoVulnerabilidade getTipoChamadoVulnerabilidade() {
        return tipoChamadoVulnerabilidade;
    }
}
