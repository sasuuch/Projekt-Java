import javax.swing.*;
import java.awt.*;

/**
 * Created by Łukasz on 2016-03-04.
 */
public class Game {
    public static void main(String[] args) {
       GUIStart panel= new GUIStart();// tworzenie nowego obiektu klasy GUIStart
       panel.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//ustawienie domyslnego zamykania okna
        panel.setSize(350,350);//ustawienie rozmiaru okna
       panel.setVisible(true);//ustawienie widoczocznosci okna
    }
}
///
