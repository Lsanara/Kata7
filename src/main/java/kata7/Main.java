package kata7;
import javax.swing.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        new JFrame(){
            {
                this.setTitle("Hello");
                this.setSize(300, 300);
                this.setLocationRelativeTo(null);
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);

                JLabel label = new JLabel("kata7");
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setVerticalAlignment(JLabel.CENTER);
                this.getContentPane().add(label);
            }
        }.setVisible(true);
    }
}
