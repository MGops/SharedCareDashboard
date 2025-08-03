package ui;

import javax.swing.*;
import ui.panels.topPanel;
import java.awt.*;

public class SharedCareDashboard {
    private topPanel topPanel;

    public SharedCareDashboard() {

        JFrame frame = new JFrame("Shared Care Dashboard");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) (screenSize.width * 0.5);
        int height = (int) (screenSize.height * 0.5);
        frame.setSize(width,height);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        frame.add(mainPanel);

        topPanel = new topPanel(this);
        mainPanel.add(topPanel, BorderLayout.NORTH);

        frame.setVisible(true);
    }
    
}
