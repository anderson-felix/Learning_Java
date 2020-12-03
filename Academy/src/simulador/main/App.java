/**
 *
 * @author Anderson Felix
 * @since 2020
 * @version 1.0
 *
 */
package simulador.main;

import java.util.Scanner;

import simulador.code.Robo;
import simulador.code.Caixa;

public class App {

  public static void main(String[] args) {
    if (args.length != 0) {
      args[0] = args[0].toLowerCase();
      
      if (args[0].equals("--author")) {
        System.out.println("Anderson Felix Moraes de Souza");
      } else if (args[0].equals("--version")) {
        System.out.println("Version : 1.0.0");
      } else if (args[0].equals("--help")) {
        System.out.println("Exec. Movimentos agendados (EXEMPLO) :");
        System.out.println("\t--move w a w w s d d a");
      } else if (args[0].equals("--commands")) {
        System.out.println("Comandos suportados :");
        System.out.println("\t[w] : move para cima");
        System.out.println("\t[s] : move para baixo");
        System.out.println("\t[a] : move para esquerda");
        System.out.println("\t[d] : move para direita");
        System.out.println("\t[0] : sair da aplicacao");
      } else if (args[0].equals("--move")) {
        Robo robo = new Robo();
        System.out.println("Movimentos agendados : ");
        robo.movAgendados(args);
      } else {
        System.out.println("Argument Invalid");
      }
      System.exit(0);
    }

    Robo robo[] = new Robo[2];
    Caixa caixa[] = new Caixa[3];
    Scanner scan = new Scanner(System.in);

    String tecla = "";
    boolean ok = false;

    robo[0] = new Robo("Dersox", 9.5f, 50, 50);
    robo[1] = new Robo("Frodox", 7.3f, 100, 100);

    caixa[0] = new Caixa("Bolacha Nikito", 10, 50, 45, 14.3f, 1.08f, 0.78f, 0.45f);
    caixa[1] = new Caixa("Bolacha Passatempo", 15, 55, 45, 16.5f, 1.08f, 0.80f, 0.55f);
    caixa[2] = new Caixa("Bolacha Negresco", 30, 60, 45, 21.8f, 1.20f, 0.80f, 0.65f);

    do {
      try {
        for (int i = 0; i < 5; i++) {
          System.out.println();
        }
        System.out.println("\n\t ___ON___ \n");
        robo[0].printPosition();
        System.out.println("\n");
        tecla = scan.next().toLowerCase();
        robo[0].setOrientacao(tecla.charAt(0));

      } catch (IllegalArgumentException ex) {
        if (tecla.charAt(0) == '0') {
          ok = true;
        } else {
          System.out.println("Value incorrect");
          scan.nextLine();
          ok = false;
        }
      }
    } while (!ok);
    robo[0].status();
    caixa[0].status();

  }

}
