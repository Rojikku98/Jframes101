/**
 * Created by edvin.bergstrom on 2016-01-27.
 * kap_ Övning
 * Beskrivning
 * Filnamn:
 */
import java.awt.*;
public class Bild extends javax.swing.JPanel{
    /*public bild(){
        initComponents();
    }*/
    protected void paintComponent(Graphics g){
        if ()
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(10, 10, 20, 20);
        g.setColor(Color.red);
        g.fillRect(30,10,50,50);
    }
}
