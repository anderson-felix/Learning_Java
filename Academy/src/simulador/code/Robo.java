package simulador.code;

import java.util.HashMap;
import java.util.Map;
import simulador.main.App;

/**
 *
 * @author Anderson Felix
 */
abstract class RoboIdeia {

  protected float positionX;
  protected float positionY;
  protected String nome;
  protected int orientacao;
  protected float peso;

  public abstract void move(float posX, float posY);

  public abstract void moveX(float dist);

  public abstract void moveY(float dist);

}

public class Robo extends RoboIdeia {

  public enum Orientacao {
    FRENTE(1), ATRAS(2), ESQUERDA(3), DIREITA(4);
  
    private final int value;
    private final static Map map = new HashMap<>();
    
    private Orientacao(int value){
      this.value = value;
    }
    
    static {
        for (Orientacao pageType : Orientacao.values()) {
            map.put(pageType.value, pageType);
        }
    }

    public static Orientacao valueOf(int pageType) {
        return (Orientacao) map.get(pageType);
    }

    public int getValue() {
        return value;
    }
    
  };
  

  final float velocidadeMax = 5;
  final float cargaMax = 20;
  final String tipoTracao = "esteira";

  public Robo(String nome, float peso) {
    super.nome = nome;
    this.peso = peso;
    this.positionX = 50;
    this.positionY = 50;
  }

  public Robo(String nome, float peso, float posX, float posY) {
    super.nome = nome;
    this.peso = peso;
    this.positionX = posX;
    this.positionY = posY;
  }

  public float getPositionX() {
    return positionX;
  }

  public float getPositionY() {
    return positionY;
  }

  public float getOrientacao() {
    return orientacao;
  }

  public void printPosition() {
    System.out.println("Posição X : " + this.positionX);
    System.out.println("Posição Y : " + this.positionY);
  }

  public void status() {
    System.out.println("\n_________ROBOT INFO__________");
    System.out.println("Nome : " + this.nome);
    System.out.println("Peso : " + this.peso);
    System.out.println("Velovidade Max : " + this.velocidadeMax);
    System.out.println("Carga Max : " + this.cargaMax);
    System.out.println("Tipo de Tração : " + this.tipoTracao);
    System.out.println("Posição X : " + this.positionX);
    System.out.println("Posição Y : " + this.positionY);
  }

  @Override
  public void move(float posX, float posY) {
    if (Float.isNaN(posX) || Float.isNaN(posY) || Float.isInfinite(posX) || Float.isInfinite(posY)) {
      throw new IllegalArgumentException("Arguments is not valid.");
    }

    super.positionX = posX;
    super.positionY = posY;
  }

  @Override
  public void moveX(float dist) {
    if (Float.isNaN(dist) || Float.isInfinite(dist)) {
      throw new IllegalArgumentException("Arguments is not valid.");
    }
    super.positionX += dist;
  }

  @Override
  public void moveY(float dist) {
    if (Float.isNaN(dist) || Float.isInfinite(dist)) {
      throw new IllegalArgumentException("Arguments is not valid.");
    }
    super.positionY += dist;
  }

  

  public void setOrientacao(char tecla) {

    if (tecla == 'w') {
      super.orientacao = Orientacao.FRENTE.value;
      moveY(5);
    } else if (tecla == 's') {
      super.orientacao = Orientacao.ATRAS.value;
      moveY(-5);
    } else if (tecla == 'a') {
      super.orientacao = Orientacao.ESQUERDA.value;
      moveX(-5);
    } else if (tecla == 'd') {
      super.orientacao = Orientacao.DIREITA.value;
      moveX(5);
    } else {
      throw new IllegalArgumentException("Arguments is not valid");
    }
  }

  @Override
  public String toString() {
    return "Robo{" + "posicaoX=" + positionX + ", posicaoY=" + positionY + ", orientacao=" + orientacao + "}";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof App) {
      Robo robo = (Robo) obj;
      return this.nome.equals(robo.nome);
    } else {
      return false;
    }
  }

}
