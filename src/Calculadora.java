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

        $msg = "Las siguientes son las operaciónes estadística que desea realizar \n";
        $msg += "[1] Desviación Estándard \n";
        $msg += "[2] Media Aritmética \n";
        $msg += "[3] Salir del programa";
        $msg += "Ingrese su selección [1] o [2]:";

        System.out.println($msg);

        int op = in.nextInt();

        if (op == 1) {
            System.out.println("Usted ha seleccionado Desviación Estandard");

            double resultado = calcularDesviacion(valores);

            System.out.println("El resultado del cálculo es: " + resultado);
        }
        else if(op == 2) {
            System.out.println("Usted ha seleccionado Media Aritmética");

            double resultado = calcularMediaAritmetica(valores);

            System.out.println("El resultado del cálculo es: " + resultado);
        }
        else {
            System.out.println("El valor ingresado no existe \n");
        }
    }

    public static double calcularDesviacion(int[] lista) {

        double avg = calcularMediaAritmetica(lista);
        double sum = 0;
        double sigma = 0;

        for (int i = 0; i < lista.length; i++) {

            sum = sum + Math.pow((lista[i] - avg), 2);
        }

        sigma = Math.sqrt(sum / (lista.length - 1));

        return sigma;
    }

    public static double calcularMediaAritmetica(int[] lista) {

        int sum = 0;
        double media = 0;

        for(int i = 0; i<lista.length; i++) {
            sum = sum + lista[i];
        }

        media = sum / lista.length;

        return media;
    }
}
