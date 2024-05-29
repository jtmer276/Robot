import java.awt.*;
import java.awt.event.InputEvent;
//import java.security.Key;

public class ApplicationRobot{
    public static void main(String[] args) throws Exception{
        Robot jules = new Robot();
        //jules.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        jules.mouseMove(0, 1500);
        jules.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        jules.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        jules.delay(500);
        jules.mouseMove(100, 970);
        jules.delay(500);
        jules.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        jules.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}