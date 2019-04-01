package FirstAidApp.GUI;

import FirstAidApp.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    public JPanel viewMenu;
    private JButton settingsButton;

    public Menu() {

        settingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFrame frame = new JFrame();
                frame = new JFrame("Settings");
                frame.setContentPane(new Settings().viewSettings);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
