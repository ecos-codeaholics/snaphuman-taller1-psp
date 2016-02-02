/**
 * Calculadora.java
 * Propósito: Calcula el promedio y la desviacion estándard de una lista de valores dada.
 *
 * @author Fabián Hernández
 * @version 1.0 01/27/16
 * @licence GNU/GPL v3
 */

import java.util.Scanner;
import java.util.Arrays;

public class Calculadora {

    /**
     * Recibe los datos ingresados por el usuario a través de la
     * linea de comandos
     *
     * @param args
     * @return No hay valor de retorno
     */
    public static void main(String[] args) {

        // Composición del mensaje de bienvenida
        String $msg;

        $msg = "Bienvenido a la calculadora estadística \n";
        $msg += "Este programa le permitirá definir una lista de valores cuya longitud \n";
        $msg += "será indicada por usted. \n";
        $msg += "Una vez definidos los valores, usted podrá elegir el tipo de operación \n";
        $msg += "estadística que desea aplicar sobre los valores";

        System.out.println($msg);

        // Proceso de entrada de datos
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese el número que define la candidad de valores a ingresar: \n");

        while (!in.hasNextInt()) {
            System.out.println("Debe ingresar un número entero");
            in.nextLine();
        }

        int n = in.nextInt();
        System.out.println("El valor ingresado es: " + n);

        // Array que contiene la lista de valores para realizar el calculo
        double[] valores;

        valores = new double[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Ingrese el número " + i + ":");
            while (!in.hasNextDouble()) {
                System.out.println("Debe ingresar un número");
                in.nextLine();
            }

            double num = in.nextDouble();
            valores[i] = num;
        }

        System.out.println("La lista de valores ingresados es: " + Arrays.toString(valores));

        // Composición del mensaje para la selección de la operación
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

        in.close();
    }

    /**
     * Calcula la desviación estandard de una lista de valores dados.
     *
     * @param lista Array de números eneros
     * @return sigma Double con el resultado del cálculo
     */
    public static double calcularDesviacion(double[] lista) {

        double avg = calcularMediaAritmetica(lista);
        double sum = 0;
        double sigma;

        for (int i = 0; i < lista.length; i++) {

            sum = sum + Math.pow((lista[i] - avg), 2);
        }

        sigma = Math.sqrt(sum / (lista.length - 1));

        return sigma;
    }

    /**
     * Calcula la media aritmética de una lista de valores dados.
     *
     * @param lista Array de números eneros
     * @return media Double con el resultado del cálculo
     */
    public static double calcularMediaAritmetica(double[] lista) {

        double sum = 0;
        double media = 0;

        for(int i = 0; i<lista.length; i++) {
            sum = sum + lista[i];
        }

        media = sum / lista.length;

        return media;
    }
}
