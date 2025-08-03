package ui;

import javax.swing.*;
import java.awt.*;

public class SharedCareDashboard {

    public SharedCareDashboard() {

        JFrame frame = new JFrame("Shared Care Dashboard");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) (screenSize.width * 0.5);
        int height = (int) (screenSize.height * 0.5);
        frame.setSize(width,height);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.setVisible(true);
    }
    
}
