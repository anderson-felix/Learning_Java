package robot;

/**
 *
 * @author Anderson Felix
 */
public class Caixa {
    String nomeItem;
    int qtdeItem;
    int posX;
    int posY;
    float peso;
    float comprimento;
    float largura;
    float altura;
    
    public void Caixa(String nomeItem, int qtdeItem, int posX, int posY,
                float peso, float comprimento, float largura, float altura) 
    {
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
