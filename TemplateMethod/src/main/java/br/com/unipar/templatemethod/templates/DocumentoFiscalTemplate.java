/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.templatemethod.templates;

/**
 *
 * @author bruno
 */
public abstract class DocumentoFiscalTemplate {
    
    public final void processarDocumentoFiscal() {
        salvar();
        transmitir();
        consultar();
        cancelar();
        inutilizarNumeracao();
    }

    protected abstract void salvar();

    protected abstract void transmitir();

    protected abstract void consultar();

    protected abstract void cancelar();

    protected abstract void inutilizarNumeracao();
}
