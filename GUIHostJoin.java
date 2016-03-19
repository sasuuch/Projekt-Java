import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Łukasz on 2016-03-13.
 */
public class GUIHostJoin extends JFrame{
    private JButton host;
    private JButton join;
    private JTextField adres;

        public GUIHostJoin() {

        super("Host/Join server");
            GridBagLayout gridBag = new GridBagLayout();
            GridBagConstraints constraints = new GridBagConstraints();
            constraints.fill = GridBagConstraints.CENTER;
            gridBag.setConstraints(this, constraints);
            setLayout(gridBag);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            this.setSize(400,300);
            host = new JButton("Host");
            add(host);

            Stworz zaloz= new Stworz();
            host.addActionListener(zaloz);

            join = new JButton("Join");
            add(join);

            Dolacz podepnij=new Dolacz();
            join.addActionListener(podepnij);

            adres=new JTextField();
            adres.setText("Wpisz adres");
            adres.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    adresActionPerformed(evt);
                }
            });
            add(adres);
    }

    public String getAdres()
    {
       return adres.getText();

    }

    void closeHost(){this.setVisible(false);}
    void openHost() {this.setVisible(true);}

    private class Stworz implements ActionListener
    {
        public void actionPerformed(ActionEvent zdarzenie){
            GUIGame oknogry = new GUIGame();
            oknogry.setVisible(true);

            closeHost();

        }
    }
    private class Dolacz implements ActionListener
    {
        public void actionPerformed(ActionEvent zdarzenie){
            JOptionPane.showMessageDialog(null,String.format("%s",zdarzenie.getActionCommand()));
            closeHost();
        }
    }

    private void adresActionPerformed(ActionEvent zdarzenie){
        this.getAdres();

    }
}
