package com.fit5136.team60.sprint3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModifyConf extends JFrame{
    private JTextField nameText;
    private JTextField titleText;
    private JTextField topicText;
    private JButton submitButton;
    private JButton cancelButton;
    private JPanel panel;
    private String name;
    private String title;
    private String topic;

    public ModifyConf(Conference conference){
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setTitle("Modify Conference");
        nameText.setText(conference.getName());
        titleText.setText(conference.getTitle());
        topicText.setText(conference.getTopic());

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Chair(conference);
                dispose();
            }
        });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Conference conference = new Conference(nameText.getText(), titleText.getText(), topicText.getText());
                new Chair(conference);
                dispose();
            }
        });
    }
}
