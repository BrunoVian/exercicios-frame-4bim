/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.chainofresponsibility;

/**
 *
 * @author bruno
 */
public class Solicitacao {
    private String tipo;
    private String funcionario;

    public Solicitacao(String tipo, String funcionario) {
        this.tipo = tipo;
        this.funcionario = funcionario;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFuncionario() {
        return funcionario;
    }
}
