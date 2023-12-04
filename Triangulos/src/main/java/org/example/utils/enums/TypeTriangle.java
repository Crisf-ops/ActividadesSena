package org.example.utils.enums;

public enum TypeTriangle {
    TRIANGLE_EQUILATERAL("Equilater"),
    TRIANGLE_ISOSCELES("Isosceles"),
    TRIANGULAR_SCALENE("Escaleno");
    final String typeNameTriangle;
    public String getTypeNameTriangle () { return typeNameTriangle; }


    TypeTriangle ( String typeNameTriangle ) { this.typeNameTriangle = typeNameTriangle; }
}
