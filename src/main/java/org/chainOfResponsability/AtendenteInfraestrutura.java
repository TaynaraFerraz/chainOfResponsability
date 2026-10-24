package org.chainOfResponsability;

public class AtendenteInfraestrutura extends Atendente {

    public AtendenteInfraestrutura(Atendente superior) {
        listaChamados.add(TipoChamadoServidor.getTipoChamadoServidor());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Analista de Infraestrutura";
    }
}