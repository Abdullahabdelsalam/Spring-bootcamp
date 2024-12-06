import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve Circle and Square beans from the Spring container
        Shape circle = (Shape) container.getBean("circleShape");
        Shape square = (Shape) container.getBean("squareShape");

        // Retrieve the DatabaseOperations bean to trigger init-method and destroy-method
        DatabaseOperations databaseOperations = (DatabaseOperations) container.getBean("databaseOperations");

        // Draw the Circle and Square (This doesn't impact the lifecycle of DatabaseOperations)
        circle.draw();
        square.draw();

        // Closing the Spring container, which will invoke destroy-method for databaseOperations
        ((ClassPathXmlApplicationContext) container).registerShutdownHook();
    }
}