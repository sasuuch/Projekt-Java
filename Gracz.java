/**
 * Created by Łukasz on 2016-03-12.
 */
public class Gracz {
    private String imie;
   int wykonany_ruch;

    public Gracz(String temp) {
        imie = temp;
        wykonany_ruch = 0;
    }

    void ruchUp(){
        wykonany_ruch = 1;

    }
    void ruchDown(){
        wykonany_ruch=0;

    }
}
