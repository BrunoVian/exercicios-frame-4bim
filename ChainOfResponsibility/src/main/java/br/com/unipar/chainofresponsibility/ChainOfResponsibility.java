/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unipar.chainofresponsibility;

import br.com.unipar.chainofresponsibility.handlers.AnaliseHandler;
import br.com.unipar.chainofresponsibility.handlers.AprovacaoHandler;
import br.com.unipar.chainofresponsibility.handlers.EnvioComprovantesHandler;
import br.com.unipar.chainofresponsibility.handlers.PedidoHandler;

/**
 *
 * @author bruno
 */
public class ChainOfResponsibility {

    public static void main(String[] args) {

        PedidoHandler pedidoHandler = new PedidoHandler();
        EnvioComprovantesHandler envioComprovantesHandler = new EnvioComprovantesHandler();
        AnaliseHandler analiseHandler = new AnaliseHandler();
        AprovacaoHandler aprovacaoHandler = new AprovacaoHandler();

        pedidoHandler.setProximo(envioComprovantesHandler);
        envioComprovantesHandler.setProximo(analiseHandler);
        analiseHandler.setProximo(aprovacaoHandler);

        Solicitacao solicitacao1 = new Solicitacao("Reembolso", "c-level");
        Solicitacao solicitacao2 = new Solicitacao("Pedido de Compras", "funcionario_comum");

        pedidoHandler.processarSolicitacao(solicitacao1);
        System.out.println("\n---\n");
        pedidoHandler.processarSolicitacao(solicitacao2);


    }
}
