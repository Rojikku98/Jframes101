/**
 * Created by edvin.bergstrom on 2016-01-27.
 * kap_ Övning
 * Beskrivning
 * Filnamn:
 */
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class JFramedemo1 {
    public static void main(String[] args) {
        boolean färg = true;
        Scanner in = new Scanner(System.in);
        JFrame frame = new JFrame("FrameDemo");
        Bild emptyLabel = new Bild();

//2. Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//3. Create components and put them in the frame.
//...create emptyLabel...
        emptyLabel.setSize(30,30);
        frame.add(emptyLabel, BorderLayout.CENTER);
                //.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));

//4. Size the frame.
        frame.pack();

//5. Show it.
        frame.setVisible(true);

        //test ärndrafärg

        System.out.println("hej");
        String t = in.nextLine();
        if (t!=null){
            färg = false;
        }
    }
}
