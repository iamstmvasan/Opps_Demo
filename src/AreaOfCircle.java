import java.util.Scanner;

public class AreaOfCircle {
    AreaOfCircle(){
        System.out.println("Area of Circle objrct is created !");
    }
    // Area of circle = Pi * r *r
    float radius , areaOfCircle;
    Scanner sc;
    void sample(){
        System.out.println("Sample method from Area class ... ");
    }
    void input(){
        // int a = 10;
        sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        radius = sc.nextFloat();
    }
    void process(){

        areaOfCircle = 3.14f * radius *radius;
    }
    void output(){
        System.out.println("Area Of Circle is : "+areaOfCircle);
    }

}
