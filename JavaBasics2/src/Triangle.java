public class Triangle implements Shape{
    double b;
    double h;
    double area;
    public Triangle(double base, double height){
        this.b = base;
        this.h = height;
    }

    public double calculateArea(){
        this.area = (this.b*this.h)/2;
        return this.area;
    }

    public void display(){
        System.out.println("Area of a triangle " + this.area);
    }
}
