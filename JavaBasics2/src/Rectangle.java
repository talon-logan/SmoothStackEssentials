public class Rectangle implements Shape {
    double area;
    double l;
    double w;
    public Rectangle(double len, double wid){
        this.l = len;
        this.w = wid;
    }

    public double calculateArea(){
        this.area = this.l * this.w;
        return this.area;
    }

    public void display(){
        System.out.println("Area of a rectangle " + this.area);
    }
}
