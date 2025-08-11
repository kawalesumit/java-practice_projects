import java.util.Scanner;

public class Main{

    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Height Of Right Angle Triangle: ") ;
        double  height = scanner.nextDouble();

        System.out.print("Enter Base Of Right Angle Triangle: ");
        double base = scanner.nextDouble();


        double area = base * height * (1.0/2.0);

        System .out .print("The Area of Above Right Angle Triangle is " + area ) ;
        scanner.close();
    }
}