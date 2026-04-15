import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        // Comentarios de una linea

        /*
        Comentarios de varias lineas
        */

        // Integers numbers
        int myIntNumber = 20; // -2mm -> 2mm (4 bytes)
        byte myByteNumber = 127; // -128 -> 127 (1 byte)
        short myShortNumber = 0; // -32768 -> 32767 (2 bytes)
        long myLongNumber = 0; // 9x10^-16 -> 9x10^16 (8 bytes)

        System.out.println(myIntNumber);
        System.out.println(myByteNumber);
        System.out.println(myShortNumber);
        System.out.println(myLongNumber);
        // Decimal numbers
        float myFloatNumber = 3.1416f; //
        double myDoubleNumber = 3.1416; //
        System.out.println(myFloatNumber);
        System.out.println(myDoubleNumber );
        // Boolean
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println(isTrue);
        System.out.println(isFalse);
        // Char
        char myCharNumber = 'a';

        System.out.println(myCharNumber);
        // String
        String text = "Hola mundo!";
        int textLong = text.length();
        String textRemplace = text.replace("Hola", "Adios");

        System.out.println(text.endsWith("o!"));
        System.out.println(text.startsWith("Ho"));
        System.out.println(text.contains("mund"));
        System.out.println(text.indexOf("Mund"));
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        String malo = "     Holdasdas           ";
        System.out.println(malo.trim());

        // Caracteres especiales
        String holaMundo = "Hola \"Mundo\"";
        String discoC = "C:\\>";
        String saltoDeRenglon = "Hola \nMundo";
        String tabulacion = "Hola \tWeeeeee";
        System.out.println(holaMundo);
        System.out.println(discoC);
        System.out.println(saltoDeRenglon);
        System.out.println(tabulacion);

        // arrays
        int[] myNumbersInArray = new int[5];
        System.out.println(myNumbersInArray); // direccion en memoria
        System.out.println(Arrays.toString(myNumbersInArray));
        myNumbersInArray[0] = 2; // Los indices empiezan desde 0
        System.out.println(Arrays.toString(myNumbersInArray));
        System.out.println(myNumbersInArray.length);
        Arrays.sort(myNumbersInArray);
        System.out.println(Arrays.toString(myNumbersInArray));

        // nueva forma de crear arrays
        int[] myNumberInArrayNew = {1,2,3,4,5};
        System.out.println(Arrays.toString(myNumberInArrayNew));

        // multples dimensiones
        int[][] multipleDimentions = {{0,1},{2,3}};
        System.out.println(Arrays.deepToString(multipleDimentions));

        int[][] newMultipleDimentions = new int[3][2];
        newMultipleDimentions[0][0]=5;
        System.out.println(Arrays.deepToString(newMultipleDimentions));

        // Constantes
        final String empresa = "Grupo Cubits";
        System.out.println(empresa);

        // comentarios
        // Comentario de una linea

        /*
        * Comentario de muchas lineas
        *
        * */

        /* Escribir todos
        * Los comentarios que nosotros queramos*/
        /**
         * dasdasd
         */

        // operadores arimeticos
        int a = 2 + 2;
        int b = 2 - 2;
        int c = 3 * 3;
        int m = 4 % 3;
        double d = 10.0 / 3.5;

        int x = 5;
        int y = x++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(m);
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(y);

        x = x + 5;
        System.out.println(x);

        x += 5;
        System.out.println(x);

        // Orden de operaciones
        /**
         * PEMDAS
         * Parentesis
         * Potencia
         * Multiplicacion
         * Division
         * Suma
         * Resta
         */
        int r = 5 + 3 * 2;
        System.out.println(r);


        // Conversion de tipos
        // conversion implicita byte ->short ->int ->long -> float-> double
        byte a1 = 1;
        //int b1 = 15;
        double b1 = 15.15;
        double c1 = a1+ b1;
        System.out.println(c1);

        // Conversion explicita
        int x1 = 15;
        double y2 = 25.5;
        // int z = (int) (x1 + y2);
        int z = x1 + (int) y2;
        System.out.println(z);

        // Conversion explicita
        String j = "1.1";
        int k = 6;
        double l = Double.parseDouble(j)  + k;
        System.out.println(l);
    }
}