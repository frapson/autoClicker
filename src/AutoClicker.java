import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Scanner;

public class AutoClicker {

    public static void main(String[] args) {
        
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("How many clicks do you want to have? ");
            String button = scanner.nextLine();

            System.out.println("Clicking starts in 5s...");

            Thread.sleep(5000);

            for (int i = 0; i < Integer.parseInt(button); i++) {

                Robot mouse = new Robot();

                int key = InputEvent.BUTTON1_DOWN_MASK;

                System.out.println("Number: " + i);
                mouse.mousePress(key);
                Thread.sleep(10);
                mouse.mouseRelease(key);
                Thread.sleep(10);

            }

        } catch (Exception c) {
            c.printStackTrace();
        }
    }
}
