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
public class AnaliseHandler implements ManipuladorSolicitacao {
    private ManipuladorSolicitacao proximo;

    @Override
    public void processarSolicitacao(Solicitacao solicitacao) {
        if (!"c-level".equalsIgnoreCase(solicitacao.getFuncionario())) {
            System.out.println("Analisando " + solicitacao.getTipo());
        }
        if (proximo != null) {
            proximo.processarSolicitacao(solicitacao);
        }
    }

    public void setProximo(ManipuladorSolicitacao proximo) {
        this.proximo = proximo;
    }
}