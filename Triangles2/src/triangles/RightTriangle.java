package triangles;

public class RightTriangle extends Triangle {
    public RightTriangle() {
        
    }
    
    public RightTriangle(double sideA, double sideB) {
        super (sideA, sideB);
    }
    
    protected double area() {
        double area = a*b/2.0;
        return area;
    }
    
    public String displayName() {
        return "Right Triangle (" + a + "," + b + ")";
    }
}
