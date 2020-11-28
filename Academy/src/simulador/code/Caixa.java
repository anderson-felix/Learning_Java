package simulador.code;

/**
 *
 * @author Anderson Felix
 */
abstract class CaixaIdeia {

  protected int posX;
  protected int posY;
  private float peso;

  public int getPosX() {
    return this.posX;
  }

  public void setPosX(int posX) {
    this.posX = posX;
  }

  public int getPosY() {
    return this.posY;
  }

  public void setPosY(int posY) {
    this.posY = posY;
  }

  public float getPeso() {
    return this.peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }

  public abstract float getComprimento();

  public abstract void setComprimento(float comprimento);

  public abstract float getLargura();

  public abstract void setLargura(float largura);

  public abstract float getAltura();

  public abstract void setAltura(float altura);

  public CaixaIdeia(int posX, int posY, float peso, float comprimento, float largura, float altura) {
    this.setPosX(posX);
    this.setPosY(posY);
    this.setPeso(peso);
    this.setComprimento(comprimento);
    this.setLargura(largura);
    this.setAltura(altura);
  }
}

public class Caixa extends CaixaIdeia {

  public String nomeItem;
  public int qtdeItem;
  private float comprimento;
  private float largura;
  private float altura;

  public Caixa(String nomeItem, int qtdeItem, int posX, int posY,
    float peso, float comprimento, float largura, float altura) {
    super(posX, posY, peso, comprimento, largura, altura);
    this.nomeItem = nomeItem;
    this.qtdeItem = qtdeItem;
  }

  @Override
  public String toString() {
    return "Caixa{" + "nomeItem = " + nomeItem + ", qtdeItem = " + qtdeItem + "}";
  }

  public void status() {
    System.out.println("\n_________BOX INFO__________");
    System.out.println("Item : " + this.nomeItem);
    System.out.println("Quantidade : " + this.qtdeItem);
    System.out.println("Posição X : " + super.getPosX());
    System.out.println("Posição Y : " + super.getPosY());
    System.out.println("Peso : " + super.getPeso());
    System.out.println("Comprimento : " + this.getComprimento());
    System.out.println("Largura : " + this.getLargura());
    System.out.println("Altura : " + this.getAltura() + "\n");
  }

  @Override
  public float getComprimento() {
    return this.comprimento;
  }

  @Override
  public void setComprimento(float comprimento) {
    this.comprimento = comprimento;
  }

  @Override
  public float getLargura() {
    return this.largura;
  }

  @Override
  public void setLargura(float largura) {
    this.largura = largura;
  }

  @Override
  public float getAltura() {
    return this.altura;
  }

  @Override
  public void setAltura(float altura) {
    this.altura = altura;
  }
}
