package triangles;

//blablabla test

public class EquilaterialTriangle extends Triangle {

    public EquilaterialTriangle() {

    }

    public EquilaterialTriangle(double side) {
        super(side);
    }

    protected double area() {
        double area = a * a * Math.sqrt(3.0)/4.0;
        System.out.println("Test");
        return area;
    }

    public String displayName() {
        return "Equilateral Triangle(" + a + ")";
    }
}
