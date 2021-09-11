public class Circle implements Shape {
    double area;
    double r;
    
    public Circle(double radius){
        double area=0;
        this.r = radius;
    }

    public double calculateArea(){
        this.area = 3.14*(this.r*this.r);
        return this.area;

    }

    public void display(){
        System.out.println("Area of a circle " + this.area);

    }
}
