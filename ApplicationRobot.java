import java.awt.*;
import java.awt.event.InputEvent;

public class ApplicationRobot{
    public static void main(String[] args) throws Exception{
        Robot jules = new Robot();
        jules.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    }
}