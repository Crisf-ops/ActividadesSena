package org.example.model;

import org.example.utils.enums.TypeTriangle;

public class Triangle {

    double sideOne;
    double sideTwo;
    double sideThree;
    double area;
    double perimeter;
    TypeTriangle typeTriangle;

    public Triangle( double sideOne, double sideTwo, double sideThree ) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }


    public double getSideOne () {
        return sideOne;
    }

    public void setSideOne ( double sideOne ) {
        this.sideOne = sideOne;
    }

    public double getSideTwo () {
        return sideTwo;
    }

    public void setSideTwo ( double sideTwo ) {
        this.sideTwo = sideTwo;
    }

    public double getSideThree () {
        return sideThree;
    }

    public void setSideThree ( double sideThree ) {
        this.sideThree = sideThree;
    }

    public double getArea () {
        return area;
    }

    public void setArea ( double area ) {
        this.area = area;
    }

    public double getPerimeter () {
        return perimeter;
    }

    public void setPerimeter ( double perimeter ) {
        this.perimeter = perimeter;
    }

    public TypeTriangle getTypeTriangle () {
        return typeTriangle;
    }

    public void setTypeTriangle ( TypeTriangle typeTriangle ) {
        this.typeTriangle = typeTriangle;
    }
}
