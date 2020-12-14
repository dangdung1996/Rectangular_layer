
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the width"  );
        double width = sc.nextDouble();
        System.out.println("Enter the height");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);

        System.out.println("you Ractangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+rectangle.getArea());

    }
}
