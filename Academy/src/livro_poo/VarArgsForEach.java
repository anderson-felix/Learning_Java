package livro_poo;

/**
 *
 * @author Anderson Felix
 * @since 2020
 * @version 1.0
 */
public class VarArgsForEach {

  public static void main(String[] args) {
    forEachString();

    forEachChar();

    System.out.println(soma(1, 2, 3, 4, 5));

    DiaDaSemana dia = DiaDaSemana.QUA;
    switch (dia) {
      case DOM:
        System.out.println("Domingo");
        break;
      case SEG:
        System.out.println("Segunda");
        break;
      case TER:
        System.out.println("Terca");
        break;
      case QUA:
        System.out.println("Quarta");
        break;
      case QUI:
        System.out.println("Quinta");
        break;
      case SEX:
        System.out.println("Sexta");
        break;
      case SAB:
        System.out.println("Sabado");
        break;
    }

  }

  public static void forEachChar() {
    String livro = "Linguagem orientada a objetos";
    for (char letra : livro.toCharArray()) {
      System.out.println("character : " + letra);
    }
  }

  public static void forEachString() {
    String livro[] = {"Linguagem", "orientada", "a", "objetos"};
    for (String nome : livro) {
      System.out.println("Nome : " + nome);
    }
  }

  public static int soma(int... args) {
    int value = 0;

    for (int n : args) {
      value += n;
    }
    return value;
  }

  public enum DiaDaSemana {
    SEG, TER, QUA, QUI, SEX, SAB, DOM
  }

}
