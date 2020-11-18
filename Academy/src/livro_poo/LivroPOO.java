package livro_poo;

import java.util.Random;

import static java.lang.Math.*;
import static java.lang.System.out;

public class LivroPOO {

    public static void main(String[] args) {
        out.println("Numero(PI) = " + PI);
        out.println("Numero(E) = " + E);
        out.println("Raiz(25) = " + sqrt(25));
        out.println("Potencia(2^10) = " + pow(2, 10));
        out.println("Logaritmos(100) = " + log10(100));

        Random rand = new Random();

        out.println("Random = " + rand.nextDouble());

    }

}

class TestImport {

}
