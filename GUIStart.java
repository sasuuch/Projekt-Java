import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Łukasz on 2016-03-04.
 */
//klasa odpowiadajaca za interfejs

public class GUIStart extends JFrame {


    private JButton nowy;
    private JButton wyniki;
    private JButton wczytaj;
    private JLabel obrazek;

    //konstruktor klasy-okna
    public GUIStart() {

        super("Kolko i krzyzyk");
        setLayout(new FlowLayout());
        //tworzenie klawiszy i ich funkcji
        nowy = new JButton("Nowa Gra");
        add(nowy);


        AkcjaStart akcja = new AkcjaStart();
        nowy.addActionListener(akcja);

        wyniki = new JButton("Wyniki");
        add( wyniki);


        HandlerClass handler1 = new HandlerClass();
        wyniki.addActionListener(handler1);


        wczytaj= new JButton("Wczytaj");
        add(wczytaj);


        HandlerClass handler2 = new HandlerClass();
        wczytaj.addActionListener(handler2);
        // dodanie obrazka

        obrazek = new JLabel();
        obrazek.setIcon(new ImageIcon("src\\main\\resources\\tlo.png"));
        add(obrazek);
    }


    private  class  HandlerClass implements ActionListener{
        public void actionPerformed(ActionEvent zdarzenie){
            JOptionPane.showMessageDialog(null,String.format("%s",zdarzenie.getActionCommand()));
        }
    }

    private class AkcjaStart implements ActionListener{
        public void actionPerformed(ActionEvent zdarzenie){
            GUIHostJoin okno = new  GUIHostJoin();
            okno.openHost();
        }

    }
}




















































/////



