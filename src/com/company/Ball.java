package com.company;

public class Ball extends  Shape {
    private int r;
    private double PI;

    public Ball(int r, double PI) {
       this.r=r;
       this.PI=PI;

    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }
    @Override
    public double getPerimeter(){
        return 2*getR()*getPI();
    }

}
