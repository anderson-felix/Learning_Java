package simulador.code;

/**
 *
 * @author Anderson Felix
 */
class CaixaIdeia {
    protected int posX;
    protected int posY;
    private float peso;
    private float comprimento;
    private float largura;
    private float altura;

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

  public float getComprimento() {
    return this.comprimento;
  }

  public void setComprimento(float comprimento) {
    this.comprimento = comprimento;
  }

  public float getLargura() {
    return this.largura;
  }

  public void setLargura(float largura) {
    this.largura = largura;
  }

  public float getAltura() {
    return this.altura;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }


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

    public Caixa(String nomeItem, int qtdeItem, int posX, int posY,
            float peso, float comprimento, float largura, float altura) {
        super(posX, posY, peso, comprimento, largura, altura);
        this.nomeItem = nomeItem;
        this.qtdeItem = qtdeItem;
    }
    @Override
    public String toString() {
        return "Caixa{"+"nomeItem = " + nomeItem + ", qtdeItem = " + qtdeItem + "}";
    }
    public void status() {
    System.out.println("_________ROBOT INFO__________");
    System.out.println("Item : " + this.nomeItem);
    System.out.println("Quantidade : " + this.qtdeItem);
    System.out.println("Posição X : " + this.getPosX());
    System.out.println("Posição Y : " + this.getPosY());
    System.out.println("Peso : " + this.getPeso());
    System.out.println("Comprimento : " + this.getComprimento());
    System.out.println("Largura : " + this.getLargura());
    System.out.println("Altura : " + this.getAltura() + "\n");
  }
}
