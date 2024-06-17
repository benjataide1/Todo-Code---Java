package IGU;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen {
    private JPanel panel1;
    private JTextField text1;
    private JTextField text2;
    private JButton Copy;


    public Screen() {
        Copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tx1 = text1.getText();
                text2.setText(tx1);
            }
        });
    }
}
