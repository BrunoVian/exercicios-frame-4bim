/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.templatemethod.implementacoes;

import br.com.unipar.templatemethod.templates.DocumentoFiscalTemplate;

/**
 *
 * @author bruno
 */
public class NotaFiscal extends DocumentoFiscalTemplate {

    @Override
    protected void salvar() {
        System.out.println("Salvando Nota Fiscal");
    }

    @Override
    protected void transmitir() {
        System.out.println("Transmitindo Nota Fiscal");
    }

    @Override
    protected void consultar() {
        System.out.println("Consultando Nota Fiscal");
    }

    @Override
    protected void cancelar() {
        System.out.println("Cancelando Nota Fiscal");
    }

    @Override
    protected void inutilizarNumeracao() {
        System.out.println("Inutilizando Numeração da Nota Fiscal");
    }
}
