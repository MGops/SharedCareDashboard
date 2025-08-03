package ui.panels;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import ui.SharedCareDashboard;

public class topPanel extends JPanel{
    private SharedCareDashboard sharedCareDashboard;

    public topPanel(SharedCareDashboard sharedCareDashboard) {
        this.sharedCareDashboard = sharedCareDashboard;
        JPanel navPanel = new JPanel();
        navPanel.setLayout(new FlowLayout());
        JButton backButton = new JButton("Back");
        navPanel.add(backButton);
        JButton addButton = new JButton("Add");
        navPanel.add(addButton);
    }
        
    
}
