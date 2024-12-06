import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve Circle and Square beans from the Spring container
        Shape circle1 = (Shape) container.getBean("circleShape");
        Shape circle2 = (Shape) container.getBean("circleShape"); // Singleton, same instance
        Shape square1 = (Shape) container.getBean("squareShape");
        Shape square2 = (Shape) container.getBean("squareShape"); // Prototype, different instance

        // Draw the Circle (Singleton)
        circle1.draw();
        circle2.draw();  // Same instance as circle1

        // Draw the Square (Prototype)
        square1.draw();
        square2.draw();  // Different instance from square1
    }
}