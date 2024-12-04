import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the dimension = ");

        double dimension = in.nextDouble();

        Square square = container.getBean("square", Square.class);

        double areaSquare = square.area(dimension);

        System.out.println("The Area of the Square =" + areaSquare);

        Circle circle = container.getBean("circle", Circle.class);

        double areaCircle = circle.area(dimension);

        System.out.println("The Area of the Circle =" + areaCircle);
    }
}