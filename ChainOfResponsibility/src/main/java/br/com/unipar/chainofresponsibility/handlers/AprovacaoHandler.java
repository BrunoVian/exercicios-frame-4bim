/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.chainofresponsibility.handlers;

import br.com.unipar.chainofresponsibility.ManipuladorSolicitacao;
import br.com.unipar.chainofresponsibility.Solicitacao;

/**
 *
 * @author bruno
 */
public class AprovacaoHandler implements ManipuladorSolicitacao {
    @Override
    public void processarSolicitacao(Solicitacao solicitacao) {
        System.out.println("Aprovando " + solicitacao.getTipo());
    }
}
