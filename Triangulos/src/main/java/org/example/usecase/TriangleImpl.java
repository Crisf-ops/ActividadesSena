package org.example.usecase;

import org.example.figures.Figures;
import org.example.model.Triangle;
import org.example.utils.enums.TypeTriangle;

public class TriangleImpl implements Figures {

    public TriangleImpl() {}

    @Override
    public double calculationArea ( Triangle triangle ) {
        return (triangle.getSideThree() * Math.sqrt((triangle.getSideOne() * triangle.getSideTwo()) - ((triangle.getSideThree() * triangle.getSideThree()) / 4 ))) / 2;
    }

    @Override
    public double calculatePerimeter ( Triangle triangle ) {
        return Math.round(triangle.getSideOne() + triangle.getSideTwo() + triangle.getSideThree());
    }

    public String typeTriangle(Triangle triangle) {

        double perimeter = calculatePerimeter(triangle);
        double area = calculationArea(triangle);

        if (!isTriangleValidate(triangle.getSideOne(), triangle.getSideTwo(), triangle.getSideThree())) return "Los lados no corresponden a un Triangulo";
        
        if (isTriangleEquilatero(triangle.getSideOne(), triangle.getSideTwo(), triangle.getSideThree())) {
            return imprimir(setValues(triangle, area, perimeter, TypeTriangle.TRIANGLE_EQUILATERAL));
        }

        if (isTriangleIsosceles(triangle.getSideOne(), triangle.getSideTwo(), triangle.getSideThree())) {
            return imprimir(setValues(triangle, area, perimeter, TypeTriangle.TRIANGLE_ISOSCELES));
        }

        return imprimir(setValues(triangle, area, perimeter, TypeTriangle.TRIANGULAR_SCALENE));
    }

    private boolean isTriangleValidate ( double sideOne, double sideTwo, double sideThree ) {
        return (sideOne + sideTwo > sideThree) && (sideOne + sideThree > sideTwo) && (sideTwo + sideThree > sideOne);
    }

    private boolean isTriangleEquilatero(double sideOne, double sideTwo, double sideThree) {
        return sideOne == sideTwo && sideOne == sideThree;
    }

    private boolean isTriangleIsosceles(double sideOne, double sideTwo, double sideThree) {
        return sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree;
    }

    private Triangle setValues(Triangle triangle, double area, double perimeter, TypeTriangle typeTriangle){
        triangle.setTypeTriangle(typeTriangle);
        triangle.setArea(area);
        triangle.setPerimeter(perimeter);
        return triangle;
    }

    private String imprimir(Triangle triangle) {
        return String.format("\nEl triangulo con lados: \n" +
                "\nLado 1: %s \n" +
                "\nLado 2: %s \n" +
                "\nLado 3: %s \n" +
                "\nTiene un area de: %s \n" +
                "\nTiene un perimetro de: %s \n" +
                "\nDel tipo de triangulo es: %s",
                triangle.getSideOne(),
                triangle.getSideTwo(),
                triangle.getSideThree(),
                triangle.getArea(),
                triangle.getPerimeter(),
                triangle.getTypeTriangle().getTypeNameTriangle());
    }

}
