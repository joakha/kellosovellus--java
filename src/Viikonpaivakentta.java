import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class Viikonpaivakentta extends JLabel{

    Viikonpaivakentta() {

        this.setBackground(Color.black);
        this.setOpaque(true);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.TOP);
        this.setForeground(Color.WHITE);
        this.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
        this.setBounds(0, 225, 400, 60);

    }
    
}
