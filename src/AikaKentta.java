import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class AikaKentta extends JLabel{

    private ImageIcon kuva;

    AikaKentta() {

        kuva = new ImageIcon(getClass().getResource("kello.png"));

        this.setBackground(Color.black);
        this.setOpaque(true);
        this.setIcon(kuva);
        this.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
        this.setVerticalTextPosition(JLabel.BOTTOM);
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.TOP);
        this.setIconTextGap(25);
        this.setForeground(Color.WHITE);
        this.setBounds(0, 50, 400, 175);

    }
    
}