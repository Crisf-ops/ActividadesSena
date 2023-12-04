package org.example.controller;

import lombok.NoArgsConstructor;
import org.example.exception.NegativeNumber;
import org.example.model.Triangle;
import org.example.usecase.TriangleImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleController {

    public TriangleController() {}
    public void getTriangle() {
        try {
            Scanner teclado = new Scanner(System.in);
            System.out.print(" ----------------- BIENVENIDO ----------------- \n");
            double sideOne, sideTwo, sideThree;
            System.out.println("Digite lado 1");
            sideOne = teclado.nextDouble();
            System.out.println("Digite lado 2");
            sideTwo = teclado.nextDouble();
            System.out.println("Digite lado 3");
            sideThree = teclado.nextDouble();
            isNegativeNumber(sideOne,sideTwo,sideThree);
            Triangle triangle = new Triangle(sideOne, sideTwo, sideThree);
            TriangleImpl triangleImpl = new TriangleImpl();
            String result = triangleImpl.typeTriangle(triangle);
            System.out.println(result);
        }
        catch (InputMismatchException e) { System.out.println("\nSolo se permiten numeros\n "); }
        catch (NegativeNumber e) { System.out.println("\nSolo se permiten numeros positivos y mayores a cero\n"); }
    }

    public void isNegativeNumber(double lado1,double lado2, double lado3) throws NegativeNumber {
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) { throw new NegativeNumber(); }
    }
}
