package org.chainOfResponsability;

public class AtendenteSeguranca extends Atendente {

    public AtendenteSeguranca(Atendente superior) {
        listaChamados.add(TipoChamadoVulnerabilidade.getTipoChamadoVulnerabilidade());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Especialista em Segurança";
    }
}
