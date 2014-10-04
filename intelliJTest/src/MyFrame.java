import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame {

    private JFrame      ramka;
    private JButton     butt;
    private JLabel      nap;

    public MyFrame() {
        ramka   = new JFrame("My test app");
        butt    = new JButton("OK");
        nap     = new JLabel("Hello Java and my github!!");
    }

    public void pokaz() {

        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setLayout(new FlowLayout());
        ramka.setSize(400,80);
        ramka.add(nap);
        ramka.add(butt);
        ramka.setVisible(true);
        butt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ramka.dispose();
            }
        });
    }
}
