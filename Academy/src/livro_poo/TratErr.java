package livro_poo;

import java.util.Scanner;

public class TratErr {

  public static int div(int a, int b) {
    try {
      return a / b;
      
    } catch (ArithmeticException ex) {
      System.err.println("A divisão por zero é indefinida");
      return 0;
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Digite um valor : \n");
    int a = scan.nextInt();
    System.out.println("Digite outro valor : \n");
    int b = scan.nextInt();
    
    int funcDiv = div(a,b);
    
    System.out.println("A divisão de "+a+" por "+b+" e igual a : "+funcDiv+"\n");

  }
}
