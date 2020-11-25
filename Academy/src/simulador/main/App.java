package simulador.main;

import java.util.Scanner;

import simulador.code.Robo;
import simulador.code.Caixa;

public class App {

  public static void main(String[] args) {
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
        tecla = scan.next().toLowerCase();
        robo[0].setOrientacao(tecla.charAt(0));
        robo[0].printPosition();
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
