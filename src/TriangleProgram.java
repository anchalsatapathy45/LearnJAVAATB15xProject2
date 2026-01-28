import java.util.Scanner;

public class TriangleProgram {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the side1 of the triangle:");
        int a= scanner.nextInt();
        System.out.println("Enter the side2 of the triangle:");
        int b= scanner.nextInt();
        System.out.println("Enter the side3 of the triangle:");
        int c= scanner.nextInt();

        if (a==b && b==c && a==c)
        {
            System.out.println("It is an Equilateral  Triangle");
        }
        else if(a == b || b == c || a == c)
        {
            System.out.println("It is an Isosceles Triangle");
        }
        else{
            System.out.println("It is an Scalene Triangle");
        }
        scanner.close();



    }

}
