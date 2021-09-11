import java.util.*;




public class App {
    public static void main(String[] args) throws Exception {
        //first solution for adding multiple inputs from the command line
        int _final = add2();

        System.out.println("Final answer for adding multiples" +_final);
        System.out.println();

        sort2d();//solution to sort 2d for max number
        



        //Assignment 2: Init for different shapes
        Triangle tri1 = new Triangle(2, 10);
        Rectangle rect1 = new Rectangle( 10, 10);
        Circle circ1 = new Circle(20);
        //Call calculate area function
        double tri_area = tri1.calculateArea();
        double rect1_area = rect1.calculateArea();
        double circ1_area = circ1.calculateArea();

        //display value funtion
        rect1.display();
        tri1.display();
        circ1.display();




        









        if(args.length > 0){ // assignment 1 with an unlimited amount of values, untested
            int prev = 0;
            for( String val: args){ // string values are read
                int _val = Integer.parseInt(val); //parsed into integers
                prev = add(_val, prev); //the parsed value is then added to prevouse value, then returned
            }
            System.out.println(prev);


        }
    }


    public static int add(int current, int next){
        current = current + next;
        return current;
    }


    public static int add2(){//this method uses scanner
        Scanner user = new Scanner(System.in);
        int[] inputs = new int[5];//scanner can accept up to 5 comand
        int sum =0;
        for(int i=0 ; i != inputs.length; i++){
            System.out.println("Enter up to " + inputs.length + "inputs");
            inputs[i] = user.nextInt();
            sum += inputs[i];
        }
        return sum;

    }


    public static void sort2d(){
        int[][] _2darr = {{1, 2, 3 ,4, 5}, {6, 7, 8, 9}};
        int current_max = 0;
        for(int outer =0; outer < _2darr.length; outer++){
            for(int inner=0; inner < _2darr[outer].length; inner++){
                if(_2darr[outer][inner] > current_max){
                    current_max = _2darr[outer][inner];
                }
                
            } 
        }
        System.out.println(current_max);
    }
}
