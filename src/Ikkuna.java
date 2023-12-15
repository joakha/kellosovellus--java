import java.awt.Color;

import javax.swing.JFrame;

public class Ikkuna extends JFrame {

    Ikkuna() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setTitle("Haapanen Johannes Kellosovellus");
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.black);

    }
    
}
