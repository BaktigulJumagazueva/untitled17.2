package com.company;

public class Square extends Shape {
    private int a;

    public Square(int a){
        this.a= a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public int getA(){
        return getA();
    }
@Override
    public double getPerimeter(){
        return a*4;
    }
}
