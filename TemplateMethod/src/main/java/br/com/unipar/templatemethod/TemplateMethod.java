/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unipar.templatemethod;

import br.com.unipar.templatemethod.implementacoes.NotaFiscal;
import br.com.unipar.templatemethod.templates.DocumentoFiscalTemplate;

/**
 *
 * @author bruno
 */
public class TemplateMethod {

    public static void main(String[] args) {
        
        DocumentoFiscalTemplate notaFiscal = new NotaFiscal();
        notaFiscal.processarDocumentoFiscal();
        
    }
}
