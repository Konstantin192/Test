package triangles;

public class Triangle {
    protected double a, b, c;
    
    public Triangle() {
        
    }
    
    public Triangle(double side) {
        a = b = c = side;
    }
    
    public Triangle(double sideA, double sideB) {
        a = sideA; 
        b = sideB;
        c = Math.sqrt(a*a + b*b);
    }
    
    public Triangle(double sideA, double sideB, double sideC) {
        a = sideA;
        b = sideB;
        c = sideC;
    }
    
    protected double perimeter () {
        return a + b + c;
    }
    
    protected double area() {
        double p = this.perimeter()/2.0;
        double work = p*(p-a)*(p-b)*(p-c);
        return Math.sqrt(work);
    }
    
    public String displayName() {
        return "Triangle(" + a + "," + b + "," + c + ")";
    }
}
