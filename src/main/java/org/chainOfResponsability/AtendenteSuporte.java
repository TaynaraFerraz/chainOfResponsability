package org.chainOfResponsability;

public class AtendenteSuporte extends Atendente {

    public AtendenteSuporte(Atendente superior) {
        listaChamados.add(TipoChamadoDuvida.getTipoChamadoDuvida());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Suporte Nível 1";
    }
}
