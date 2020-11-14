package robot;

public class Robo {

    public static void main(String[] args) {
        Robot robo = new Robot("Dersox", 9.5, 50, 50);

        robo.printStatus();

        for (int d = 0; d < 4; d++) {
            for (int j = 1; j <= 10; j++) {
                robo.printPosition();
                switch (d) {
                    case 0: //move ao longo do eixo x pra frente
                        robo.move(50 + j * 4, 50);
                        break;
                    case 1: //move ao longo do eixo y pra cima
                        robo.move(90, 50 + j * 4);
                        break;
                    case 2: //move ao longo do eixo x pra trás
                        robo.move(90 - j * 4, 90);
                        break;
                    case 3: //move ao longo do eixo y pra baixo
                        robo.move(50, 90 - j * 4);
                        break;
                }
            }
        }
        robo.printPosition();

    }
}
