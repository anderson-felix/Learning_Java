package ufc_presidents;

/**
 * @author Anderson Felix
 */
public class UFC {

  public static void main(String[] args) {
    Lutador l[] = new Lutador[4];

    l[0] = new Lutador("Lula", "Brasileiro", 56, 15, 17, 4, 1.62f, 89.6f);
    l[1] = new Lutador("Dilma", "Brasileira", 51, 12, 8, 5, 1.59f, 82.3f);
    l[2] = new Lutador("Bozonaro", "Brasileiro", 54, 7, 28, 20, 1.70f, 79.8f);
    l[3] = new Lutador("Marina", "Brasileira", 49, 20, 3, 2, 1.63f, 70.1f);

    l[2].apresentar();
    l[2].setPeso(55.8f);
    l[2].perderLuta();
    l[2].perderLuta();
    l[2].perderLuta();
    l[2].status();
  }

}

class Lutador {

  public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates, float altura, float peso) {
    this.nome = nome;
    this.nacionalidade = nacionalidade;
    this.idade = idade;
    this.vitorias = vitorias;
    this.derrotas = derrotas;
    this.empates = empates;
    this.altura = altura;
    this.setPeso(peso);
  }

  private String nome, nacionalidade, categoria;
  private int idade, vitorias, derrotas, empates;
  private float altura, peso;

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNacionalidade() {
    return this.nacionalidade;
  }

  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  public String getCategoria() {
    return this.categoria;
  }

  private void setCategoria() {
    if (this.peso <= 52.2 || this.peso > 120.2) {
      this.categoria = "Inválido";
    } else if (this.peso <= 70.3) {
      this.categoria = "Leve";
    } else if (this.peso <= 83.9) {
      this.categoria = "Médio";
    } else if (this.peso <= 120.2) {
      this.categoria = "Pesado";
    }
  }

  public int getIdade() {
    return this.idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getVitorias() {
    return this.vitorias;
  }

  public void setVitorias(int vitorias) {
    this.vitorias = vitorias;
  }

  public int getDerrotas() {
    return this.derrotas;
  }

  public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
  }

  public int getEmpates() {
    return this.empates;
  }

  public void setEmpates(int empates) {
    this.empates = empates;
  }

  public float getAltura() {
    return this.altura;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }

  public float getPeso() {
    return this.peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
    this.setCategoria();
  }

  public void apresentar() {
    System.out.println("_______LUTADOR_______");
    System.out.println("Nome : " + this.getNome());
    System.out.println("Nacionalidade : " + this.getNacionalidade());
    System.out.println("Idade : " + this.getIdade());
    System.out.println("Altura : " + this.getAltura());
    System.out.println("Peso : " + this.getPeso() + "\n");
  }

  public void status() {
    System.out.println("_______STATUS_______");
    System.out.println("Nome : " + this.getNome());
    System.out.println("Categoria : " + this.getCategoria());
    System.out.println("Vitórias : " + this.getVitorias());
    System.out.println("Derrotas : " + this.getDerrotas());
    System.out.println("Empates : " + this.getEmpates() + "\n");
  }

  public void ganharLuta() {
    this.setVitorias(this.getVitorias() + 1);
  }

  public void perderLuta() {
    this.setDerrotas(this.getDerrotas() + 1);
  }

  public void empatarLuta() {
    this.setEmpates(this.getEmpates() + 1);

  }

}

class Luta {

  private String desafiado;
  private String desafiante;
  private int rounds;
  private boolean aprovada;

  public Luta() {
  }

  public void marcarLuta() {
  }

  public void lutar() {
  }
}
