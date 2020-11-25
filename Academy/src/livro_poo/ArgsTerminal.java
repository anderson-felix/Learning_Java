package livro_poo;

import java.util.Locale;

public class ArgsTerminal {

  public static void main(String[] args) {
    Locale locale = new Locale("en", "US");
    
    if (args.length == 0) {
      System.err.println("Arguments required!");
      System.exit(0);
    }

    String res = "";

    args[0] = args[0].toLowerCase();
    if (args[0].equals("--help")) {
      res = "Program : Terminal exec args \nFunctions: \n\tsqrt x \n\tpox x y \n\tlog10 x \nConsts: \n\tPI \n\tE \n\tPHI \n";

    } else if (args[0].equals("--author")) {
      System.out.println("Anderson Felix Moraes de Souza");

    } else if (args[0].equals("--version")) {
      System.out.println("Version : 1.0.0");

    } else if (args[0].equals("sqrt")) {
      res = Math.sqrt(Double.parseDouble(args[1])) + "";

    } else if (args[0].equals("pow")) {
      double x = Double.parseDouble(args[1]);
      double y = Double.parseDouble(args[2]);

      res = Math.pow(x, y) + "";

    } else if (args[0].equals("log10")) {
      res = Math.log10(Double.parseDouble(args[1])) + "";

    } else if (args[0].equals("pi")) {
      res = Math.PI + "";

    } else if (args[0].equals("e")) {
      res = Math.E + "";

    } else if (args[0].equals("phi")) {
      res = 1.618033988749895 + "";

    } else {
      System.out.println("\nInvalid arguments, --help for more information ");
    }

    System.out.println(res);
  }

}
