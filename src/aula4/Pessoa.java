/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

/**
 *
 * @author darolt
 */
public class Pessoa {
  protected String nome;
  private int idade;
  private boolean vivo = true;
  private final int IDADE_MAX = 100;
  
  public int getIdade() {
    return idade;
  }
  
  public String getNome() {
    return nome;
  }
  
  public void envelhece(int anos) {
    if (idade+anos > IDADE_MAX) {
      idade = IDADE_MAX;
      vivo = false;
    } else {
      idade = idade + anos;  
    }
  }
  
  Pessoa(int idade, String nome) {
    this.idade = idade;
    this.nome = nome;
  }
}
