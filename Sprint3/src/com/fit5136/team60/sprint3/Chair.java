package com.fit5136.team60.sprint3;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Scanner;
import com.csvreader.CsvReader;

public class Chair extends JFrame {

    private JPanel panel1;
    private JButton reviewBtn;
    private JButton PaperBtn;
    private JButton ConfBtn;
    private JScrollPane innerPanel;
    private JButton addButton;
    private JButton modifyButton;
    private JButton detailsButton;
    private JComboBox roleBox;
    private JButton personalInfoButton;
    private JLabel logasLabel;
    private JList<Conference> confList;
    DefaultListModel<Conference> model = new DefaultListModel<>();

    public Chair(Conference conference) {
        setVisible(true);
        add(panel1);
        setSize(1200, 725);
        setTitle("Conference Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        confList.setModel(model);
        model.addElement(conference);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConferenceAdd conferenceAdd = new ConferenceAdd();
                conferenceAdd.setVisible(true);
                dispose();
            }
        });

        confList.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Conference conference1 = confList.getSelectedValue();
            }
        });
        confList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    if (confList.getSelectedIndex() == -1) {
                        modifyButton.setEnabled(false);
                        detailsButton.setEnabled(false);
                    }
                    else {
                        modifyButton.setEnabled(true);
                        detailsButton.setEnabled(true);
                    }
                }
            }
        });

        modifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // further, the index can be bind with which mouse selected. But now we just set it as the first one.
                ModifyConf modifyConf = new ModifyConf(confList.getSelectedValue());
                dispose();
            }
        });

    }
//
//    private void loadData(){
//        Scanner sc = new Scanner("data.csv");
//        CsvReader csvReader = new CsvReader("data.csv");
//      }
}
