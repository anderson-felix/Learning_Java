package robot;

/**
 *
 * @author Anderson Felix
 */
public class Robot {
    
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

    public Robot(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
        this.positionX = 50;
        this.positionY = 50;
    }

    public Robot(String nome, double peso, float posX, float posY) {
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

}
