import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Retrieve Circle and Square beans from the Spring container
        Shape circle = (Shape) container.getBean("circle");
        Shape square = (Shape) container.getBean("square");

        // Draw the Circle and Square
        circle.draw();
        square.draw();
    }
}