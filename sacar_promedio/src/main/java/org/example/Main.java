package org.example;

import java.util.Scanner;

public class Main {
    enum Materia {
        MATEMATICAS, ESPANOL, INGLES
    }

    public static void main ( String[] args ) {


        Scanner scanner = new Scanner(System.in);

        double[] notasMatematicas = new double[3];
        double[] notasEspanol = new double[3];
        double[] notasIngles = new double[3];

        ingresarNotas(scanner, notasMatematicas, Materia.MATEMATICAS.name());
        ingresarNotas(scanner, notasEspanol, Materia.ESPANOL.name());
        ingresarNotas(scanner, notasIngles, Materia.INGLES.name());

        System.out.println("Ingrese la materia para calcular el promedio: ");
        String materia = scanner.next();

        try {
            Materia materiaSeleccionada = Materia.valueOf(materia.toUpperCase());
            if (materiaSeleccionada != null) {
                switch (materiaSeleccionada) {
                    case MATEMATICAS:
                        calcularPromedioFor(notasMatematicas);
                        break;
                    case ESPANOL:
                        calcularPromedioWhile(notasEspanol);
                        break;
                    case INGLES:
                        calcularPromedioDoWhile(notasIngles);
                        break;
                    default:
                        System.out.println("Materia no válida");
                }
            }
            scanner.close();
        } catch (IllegalArgumentException e) { System.out.println("Materia no válida"); }


    }
    public static void ingresarNotas(Scanner scanner, double[] notas, String materia) {
        System.out.println("Ingrese las notas de " + materia + ":");
        for (int i = 0; i < notas.length; i++) {
            double nota;
            do {
                System.out.print("Nota " + (i + 1) + " (entre 0 y 5): ");
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 5) {
                    System.out.println("Error: La nota debe estar entre 0 y 5");
                }
            } while (nota < 0 || nota > 5);
            notas[i] = nota;
        }
    }

    public static void calcularPromedioFor(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        double promedio = suma / notas.length;
        System.out.println("El promedio de Matemáticas es: " + promedio);
    }

    public static void calcularPromedioWhile(double[] notas) {
        double suma = 0;
        int contador = 0;
        while (contador < notas.length) {
            suma += notas[contador];
            contador++;
        }
        double promedio = suma / notas.length;
        System.out.println("El promedio de Español es: " + promedio);
    }

    public static void calcularPromedioDoWhile(double[] notas) {
        double suma = 0;
        int contador = 0;
        do {
            suma += notas[contador];
            contador++;
        } while (contador < notas.length);
        double promedio = suma / notas.length;
        System.out.println("El promedio de Inglés es: " + promedio);
    }


}