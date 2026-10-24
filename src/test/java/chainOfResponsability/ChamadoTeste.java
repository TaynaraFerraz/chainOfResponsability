package chainOfResponsability;

import org.chainOfResponsability.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChamadoTeste {

    AtendenteSeguranca seguranca;
    AtendenteInfraestrutura infraestrutura;
    AtendenteDesenvolvedor desenvolvedor;
    AtendenteSuporte suporte;

    @BeforeEach
    void setUp() {
        seguranca = new AtendenteSeguranca(null);
        infraestrutura = new AtendenteInfraestrutura(seguranca);
        desenvolvedor = new AtendenteDesenvolvedor(infraestrutura);
        suporte = new AtendenteSuporte(desenvolvedor);
    }

    @Test
    void deveRetornarSuporteParaResolverDuvida() {
        assertEquals("Suporte Nível 1", suporte.resolverChamado(new Chamado(TipoChamadoDuvida.getTipoChamadoDuvida())));
    }

    @Test
    void deveRetornarDesenvolvedorParaResolverBug() {
        assertEquals("Desenvolvedor", suporte.resolverChamado(new Chamado(TipoChamadoBug.getTipoChamadoBug())));
    }

    @Test
    void deveRetornarInfraestruturaParaResolverServidor() {
        assertEquals("Analista de Infraestrutura", suporte.resolverChamado(new Chamado(TipoChamadoServidor.getTipoChamadoServidor())));
    }

    @Test
    void deveRetornarSegurancaParaResolverVulnerabilidade() {
        assertEquals("Especialista em Segurança", suporte.resolverChamado(new Chamado(TipoChamadoVulnerabilidade.getTipoChamadoVulnerabilidade())));
    }

    @Test
    void deveRetornarSemAtendimentoParaResolverOutro() {
        assertEquals("Sem atendimento", suporte.resolverChamado(new Chamado(TipoChamadoOutro.getTipoChamadoOutro())));
    }
}
