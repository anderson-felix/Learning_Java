package livro_poo;

import java.io.IOException;
import java.util.Scanner;

public class Inputs {

  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);

    String exit = "";

    while (!exit.equals("exit")) {

      System.out.println("Terminal Integrated :\n$");

      String req = scan.nextLine().toLowerCase();
      String res = "";

      if (req.equals("--help")) {
        res = "Program : Terminal exec args \nFunctions: \n\tsqrt x \n\tpox x y \n\tlog10 x \nConsts: \n\tPI \n\tE \n\tPHI \n";

      } else if (req.equals("--author")) {
        System.out.println("Anderson Felix Moraes de Souza");

      } else if (req.equals("--version")) {
        System.out.println("Version : 1.0.0");

      } else if (req.equals("sqrt")) {
        res = "SQRT = " + Math.sqrt(Double.parseDouble(args[1]));

      } else if (req.equals("pow")) {
        System.out.println("Digite o primeiro valor\n");
        double req1 = scan.nextDouble();

        System.out.println("Digite o segundo valor\n");
        double req2 = scan.nextDouble();

        res = "POW = " + Math.pow(req1, req2);

      } else if (req.equals("log10")) {
        System.out.println("Digite o valor\n");
        double req1 = scan.nextDouble();

        res = "LOG10 = " + Math.log10(req1);

      } else if (req.equals("pi")) {
        res = "PI = " + Math.PI;

      } else if (req.equals("e")) {
        res = "E = " + Math.E;

      } else if (req.equals("phi")) {
        res = "PHI = " + 1.618033988749895;

      } else if (req.equals("exit")) {
        System.exit(0);

      } else {
        System.out.println("\nInvalid arguments, --help for more information or --exit for quit");
      }

      System.out.println(res);
      System.in.read();
      for (int i = 0; i < 100; i++) {
        System.out.println();
      }
    }
  }

}
