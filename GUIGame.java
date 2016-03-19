import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/**
 * Created by Łukasz on 2016-03-05.
 */
public class GUIGame extends JFrame{
   public GUIGame() {  initComponents(); }
 //dodanie fukncji do 9 klikalnych pol

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button3ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button4ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button5ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button6ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button7ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button8ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button9ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }
//

    private void initComponents() {
         final Gracz pierwszy= new Gracz("Gracz1");//domyslnie Host
        final  Gracz drugi=new Gracz("Gracz2");//domyslnie Klient

       final Logic wspolrzedne;
        wspolrzedne= new Logic();


       button1 = new JButton();
       button2 = new JButton();
       button3 = new JButton();
       button4 = new JButton();
       button5 = new JButton();
       button6 = new JButton();
       button7 = new JButton();
       button8 = new JButton();
       button9 = new JButton();



            //======== this ========
            setTitle("Kolko i krzyzyk");
            Container contentPane = getContentPane();


            //---- button1 ----
            button1.setText(" ");
            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(pierwszy.wykonany_ruch==0) {
                        button1.setText("X"); //tu musi byc if zlezny od gracza ktory odpowie za wyswietlenie X(1) lub O(7)
                        wspolrzedne.tablica[0][0] = 1;
                        wspolrzedne.check();
                        pierwszy.ruchUp();
                        drugi.ruchDown();
                    }
                    else{
                        button1.setText("O");
                        wspolrzedne.tablica[0][0] = 7;
                        wspolrzedne.check();
                        drugi.ruchUp();
                        pierwszy.ruchDown();
                    }


                }
            });

            //---- button2 ----
            button2.setText(" ");
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(pierwszy.wykonany_ruch==0) { //tu musi byc if zlezny od gracza ktory odpowie za wyswietlenie X(1) lub O(7)
                        button2.setText("X");
                        wspolrzedne.tablica[0][1] = 1;
                        wspolrzedne.check();
                        pierwszy.ruchUp();
                        drugi.ruchDown();
                    }
                    else {
                        button2.setText("O");
                        wspolrzedne.tablica[0][1] = 7;
                        wspolrzedne.check();
                        drugi.ruchUp();
                        pierwszy.ruchDown();
                    }

                }
            });

            //---- button3 ----
            button3.setText(" ");
            button3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(pierwszy.wykonany_ruch==0) {
                        button3.setText("X");
                        wspolrzedne.tablica[0][2] = 1;
                        wspolrzedne.check();
                        pierwszy.ruchUp();
                        drugi.ruchDown();
                    }
                    else {
                        button3.setText("O");
                        wspolrzedne.tablica[0][2] = 7;
                        wspolrzedne.check();
                        drugi.ruchUp();
                        pierwszy.ruchDown();
                    }
                }


            });

            //---- button4 ----
            button4.setText(" ");
            button4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(pierwszy.wykonany_ruch==0) {
                    button4.setText("X");
                    wspolrzedne.tablica[1][0] = 1;
                    wspolrzedne.check();
                        pierwszy.ruchUp();
                        drugi.ruchDown();
                    }
                    else {
                        button4.setText("O");
                        wspolrzedne.tablica[1][0] = 7;
                        wspolrzedne.check();
                        drugi.ruchUp();
                        pierwszy.ruchDown();
                    }

                }
            });

            //---- button5 ----
            button5.setText(" ");
            button5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(pierwszy.wykonany_ruch==0) {
                        button5.setText("X");
                        wspolrzedne.tablica[1][1] = 1;
                        wspolrzedne.check();
                        pierwszy.ruchUp();
                        drugi.ruchDown();
                    }
                    else {
                        button5.setText("O");
                        wspolrzedne.tablica[1][1] = 7;
                        wspolrzedne.check();
                        drugi.ruchUp();
                        pierwszy.ruchDown();
                    }

                }
            });

            //---- button6 ----
            button6.setText(" ");
            button6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(pierwszy.wykonany_ruch==0) {
                        button6.setText("X");
                        wspolrzedne.tablica[1][2] = 1;
                        wspolrzedne.check();
                        pierwszy.ruchUp();
                        drugi.ruchDown();
                    }
                    else {
                        button6.setText("O");
                        wspolrzedne.tablica[1][2] = 7;
                        wspolrzedne.check();
                        drugi.ruchUp();
                        pierwszy.ruchDown();
                    }

                }
            });

            //---- button7 ----
            button7.setText(" ");
            button7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(pierwszy.wykonany_ruch==0) {
                        button7.setText("X");
                        wspolrzedne.tablica[2][0] = 1;
                        wspolrzedne.check();
                        pierwszy.ruchUp();
                        drugi.ruchDown();
                    }
                    else {
                        button7.setText("O");
                        wspolrzedne.tablica[2][0] = 7;
                        wspolrzedne.check();
                        drugi.ruchUp();
                        pierwszy.ruchDown();
                    }

                }
            });

            //---- button8 ----
            button8.setText(" ");
            button8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(pierwszy.wykonany_ruch==0) {
                        button8.setText("X");
                        wspolrzedne.tablica[2][1] = 1;
                        wspolrzedne.check();
                        pierwszy.ruchUp();
                        drugi.ruchDown();
                    }
                    else {
                        button8.setText("O");
                        wspolrzedne.tablica[2][1] = 7;
                        wspolrzedne.check();
                        drugi.ruchUp();
                        pierwszy.ruchDown();
                    }

                }
            });

            //---- button9 ----
            button9.setText(" ");
            button9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(pierwszy.wykonany_ruch==0) {
                    button9.setText("X");
                    wspolrzedne.tablica[2][2] = 1;
                    wspolrzedne.check();
                        pierwszy.ruchUp();
                        drugi.ruchDown();
                    }
                    else {
                        button9.setText("O");
                        wspolrzedne.tablica[2][2] = 7;
                        wspolrzedne.check();
                        drugi.ruchUp();
                        pierwszy.ruchDown();
                    }


                }

            });


            GroupLayout contentPaneLayout = new GroupLayout(contentPane);
            contentPane.setLayout(contentPaneLayout);
            contentPaneLayout.setHorizontalGroup(
                    contentPaneLayout.createParallelGroup()
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                            .addGroup(contentPaneLayout.createSequentialGroup()
                                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(button3, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(contentPaneLayout.createSequentialGroup()
                                                    .addComponent(button4, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(button5, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(button6, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(contentPaneLayout.createSequentialGroup()
                                                    .addComponent(button7, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(button8, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(button9, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(11, Short.MAX_VALUE))
            );
            contentPaneLayout.setVerticalGroup(
                    contentPaneLayout.createParallelGroup()
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button3, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(button4, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button5, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button6, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(button7, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button8, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button9, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(15, Short.MAX_VALUE))
            );
            pack();
            setLocationRelativeTo(getOwner());
        }




    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;



}

