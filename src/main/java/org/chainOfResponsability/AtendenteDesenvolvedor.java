package org.chainOfResponsability;

public class AtendenteDesenvolvedor extends Atendente {

    public AtendenteDesenvolvedor(Atendente superior) {
        listaChamados.add(TipoChamadoBug.getTipoChamadoBug());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Desenvolvedor";
    }
}
