import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Łukasz on 2016-03-10.
 */
public class Logic extends GUIStart {
   public int [][] tablica;

    public Logic()
    {
        tablica = new int [3][3]; // inicjacja tablicy
        // uzupełnienie tablicy na poczatku zerami;
        for (int i=0;i<3;i++)
            {
            for(int j=0;j<3;j++)
                {
                tablica[i][j]=0;
                }
            }
    }



    public int check()
    {
        int prawda=0;
        String komunikat1="Wygral gracz 1";
        String komunikat2="Wygral gracz 2";
        if (     (tablica[0][0]+tablica[0][1]+tablica[0][2])==3 ||
                 (tablica[1][0]+tablica[1][1]+tablica[1][2])==3 ||
                 (tablica[2][0]+tablica[2][1]+tablica[2][2])==3 ||
                 (tablica[0][0]+tablica[1][0]+tablica[2][0])==3 ||
                 (tablica[0][1]+tablica[1][1]+tablica[2][1])==3 ||
                 (tablica[0][2]+tablica[1][2]+tablica[2][2])==3 ||
                 (tablica[0][0]+tablica[1][1]+tablica[2][2])==3 ||
                 (tablica[0][2]+tablica[1][1]+tablica[2][0])==3 )
        {

            JOptionPane.showMessageDialog(null, komunikat1);
            prawda=1;




        }
        else if((tablica[0][0]+tablica[0][1]+tablica[0][2])==21 ||
                (tablica[1][0]+tablica[1][1]+tablica[1][2])==21 ||
                (tablica[2][0]+tablica[2][1]+tablica[2][2])==21 ||
                (tablica[0][0]+tablica[1][0]+tablica[2][0])==21 ||
                (tablica[0][1]+tablica[1][1]+tablica[2][1])==21 ||
                (tablica[0][2]+tablica[1][2]+tablica[2][2])==21 ||
                (tablica[0][0]+tablica[1][1]+tablica[2][2])==21 ||
                (tablica[0][2]+tablica[1][1]+tablica[2][0])==21 )
        {
            JOptionPane.showMessageDialog(null, komunikat2);
            prawda=1;



        }
    return prawda;
    }

}


