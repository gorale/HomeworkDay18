package model;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle() {
    }

    public int area() {
        double p = (sideA + sideB + sideC) / 2;
        return (int) Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}
