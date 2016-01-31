/**
 * Created by snaphuman on 1/27/16.
 */

import java.util.Scanner;
import java.util.Arrays;

public class Calculadora {

    public static void main (String[] args) {

        String $msg;

        $msg = "Bienvenido a la calculadora estadística \n";
        $msg += "Este programa le permitirá definir una lista de valores cuya longitud \n";
        $msg += "será indicada por el usted. \n";
        $msg += "Una vez definidos los valores, usted podrá elegir el tipo de operación \n";
        $msg += "estadística que desea aplicar sobre los valores";

        System.out.println($msg);

        // Proceso de entrada de datos
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el número que define la candidad de valores a ingresar: \n");
        int n = in.nextInt();

        System.out.println("El valor ingresado es: " + n);

        int[] valores;

        valores = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el número " + i + ":");
            int num = in.nextInt();
            valores[i] = num;
        }

        System.out.println("La lista de valores ingresados es: " + Arrays.toString(valores));

    }
}
