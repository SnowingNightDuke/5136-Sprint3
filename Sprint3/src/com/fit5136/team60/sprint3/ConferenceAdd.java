package com.fit5136.team60.sprint3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ConferenceAdd extends JFrame {

    private JTextArea nameText;
    private JTextArea titleText;
    private JTextArea topicText;
    private JPanel panel;
    private JButton submitButton;
    private JButton cancelButton;
    private String name;
    private String topic;
    private String title;
    public ConferenceAdd(){
        add(panel);
        setSize(600,400);
        setTitle("Add Conference");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

                new Chair(null);
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = nameText.getText();
                topic = topicText.getText();
                title = titleText.getText();
                Conference conference = new Conference(name, title, topic);
                new Chair(conference);

                dispose();
            }
        });
    }
}
