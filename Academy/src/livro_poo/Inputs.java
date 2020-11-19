/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livro_poo;

/**
 *
 * @author Anderson Felix
 */
public class Inputs {
  
  public String nome;

  public static void main(String[] args) {
    System.in.read(String);

    System.out.printf("qtd de argumentos = %d%n", args.length);

    for (int i = 0; i < args.length; i++) {

      System.out.printf("\targs[%d] = %s%n", i, args[i]);

    }

  }

}
