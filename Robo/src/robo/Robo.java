package robo;

public class Robo {

    float positionX;
    float positionY;
    final String nome;
    final double peso;
    final float velocidadeMax = 5;
    final float cargaMax = 20;
    final String tipoTracao = "esteira";

    int orientacao;
    static final int FRENTE = 0;
    static final int ATRAS = 1;
    static final int ESQUERDA = 2;
    static final int DIREITA = 3;

    public Robo(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
        this.positionX = 50;
        this.positionY = 50;
    }

    public Robo(String nome, double peso, float posX, float posY) {
        this.nome = nome;
        this.peso = peso;
        this.positionX = posX;
        this.positionY = posY;
    }

    public void printPosition() {
        System.out.println("Posição X : " + this.positionX);
        System.out.println("Posição Y : " + this.positionY);
    }

    public void printStatus() {
        System.out.println("_________Info " + this.nome + "__________");
        System.out.println("Nome : " + this.nome);
        System.out.println("Peso : " + this.peso);
        System.out.println("Velovidade Max : " + this.velocidadeMax);
        System.out.println("Carga Max : " + this.cargaMax);
        System.out.println("Tipo de Tração : " + this.tipoTracao);
        System.out.println("Posição X : " + this.positionX);
        System.out.println("Posição Y : " + this.positionY);
    }

    public void move(float posX, float posY) {
        this.positionX = posX;
        this.positionY = posY;

    }

    public void setOrientacao(char tecla) {
        if ((tecla == 'w') || (tecla == 'W')) {
            this.orientacao = FRENTE;
        } else if ((tecla == 's') || (tecla == 'S')) {
            this.orientacao = ATRAS;
        } else if ((tecla == 'a') || (tecla == 'A')) {
            this.orientacao = ESQUERDA;
        } else if ((tecla == 'd') || (tecla == 'D')) {
            this.orientacao = DIREITA;
        }
    }

    public class Caixa {

        String nomeItem;
        int qtdeItem;
        int posX;
        int posY;
        double peso;
        double comprimento;
        double largura;
        double altura;

        public void Caixa(String nomeItem, int qtdeItem, int posX, int posY,
                double peso, double comprimento, float largura, float altura
        ) {
            this.nomeItem = nomeItem;
            this.qtdeItem = qtdeItem;
            this.posX = posX;
            this.posY = posY;
            this.peso = peso;
            this.comprimento = comprimento;
            this.largura = largura;
            this.altura = altura;
        }
    }

    public class Mundo2D {

        int DIM_X;
        int DIM_Y;

        public void mundo2D(int dimX, int dimY) {
            this.DIM_X = dimX;
            this.DIM_Y = dimY;
        }
    }

    public static void main(String[] args) {
        Robo robo = new Robo("Dersox", 9.5, 50, 50);

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
