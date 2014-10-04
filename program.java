import java.io.*;
import javax.swing.SwingUtilities;

public class program {
    public static void main(String[] agrs) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MyFrame okno = new MyFrame();
                okno.pokaz();
            }
        });
    }
}