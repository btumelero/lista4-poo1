/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

/**
 *
 * @author Bruno
 */
public class Cliente extends Pessoa {
  String numeroConta;
  
  Cliente(int idade, String nome, String numeroConta) {
    super(idade, nome);
    this.numeroConta = numeroConta;
  }
}
