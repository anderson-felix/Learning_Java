package simulador.main;

import simulador.code.Robo;
import simulador.code.Caixa;

public class App {

  public static void main(String[] args) {
    Robo robo[] = new Robo[2];
    Caixa caixa[] = new Caixa[3];
    
    robo[0] = new Robo("Dersox", 9.5f, 50, 50);
    robo[1] = new Robo("Frodox", 7.3f, 100, 100);

    caixa[0] = new Caixa("Bolacha Nikito", 10, 50, 45, 14.3f, 1.08f, 0.78f, 0.45f);
    caixa[1] = new Caixa("Bolacha Passatempo", 15, 55, 45, 16.5f, 1.08f, 0.80f, 0.55f);
    caixa[2] = new Caixa("Bolacha Negresco", 30, 60, 45, 21.8f, 1.20f, 0.80f, 0.65f);

    caixa[2].status();
    robo[1].status();
    System.out.println(caixa[2]);//Invoca o método toString() que é usado para imprimir detalhes do objeto.
    System.out.println(caixa[2].equals(caixa[1]));//Invoca o método equals() que compara dois objetos

//    robo.printStatus();
//    for (int d = 0; d < 4; d++) {
//      for (int j = 1; j <= 10; j++) {
//
//        robo.printPosition();
//        
//        switch (d) {
//          case 0: //move ao longo do eixo x pra frente
//            robo.move(50 + j * 4, 50);
//            
//            break;
//          case 1: //move ao longo do eixo y pra cima
//            robo.move(90, 50 + j * 4);
//            break;
//            
//          case 2: //move ao longo do eixo x pra trás
//            robo.move(90 - j * 4, 90);
//            break;
//            
//          case 3: //move ao longo do eixo y pra baixo
//            robo.move(50, 90 - j * 4);
//            break;
//        }
//      }
//    }
//    robo.printPosition();
  }
}