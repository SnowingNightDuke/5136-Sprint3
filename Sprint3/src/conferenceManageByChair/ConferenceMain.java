package conferenceManageByChair;

import checkPaperbyChair.PapersForConference;
import reviewerAssignment.ReviewAssign;
import sign.SignIn;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ConferenceMain extends JFrame {
    private JPanel ConferenceMainPanel;
    private JSplitPane firSplit;
    private JPanel upPanel;
    private JPanel downPanel;
    private JPanel otherPanel;
    private JPanel titlePanel;
    private JSplitPane upSplit;
    private JComboBox roleComboBox;
    private JLabel titleLabel;
    private JLabel logText;
    private JLabel iconLabel;
    private JSplitPane downSplit;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JButton confButton;
    private JButton paperButton;
    private JButton reviewButton;
    private JPanel contPanel;
    private JLabel subTitleLabel;
    private JSplitPane contSplit;
    private JPanel confInfoPanel;
    private JPanel functionPanel;
    private JLabel navLabel;
    private JSplitPane confInfoSplit;
    private JSplitPane funcSplit;
    private JPanel confNamePanel;
    private JPanel confContPanel;
    private JPanel funcNamePanel;
    private JPanel funcContPanel;
    private JLabel confNameLabel;
    private JLabel funcLabel;
    private JList list1;
    private JLabel editLabel;
    private JLabel paperCheckLabel;
    private JLabel mailLabel;
    private JLabel plusIconLabel;
    private JButton logOutButton;

    public ConferenceMain() {


        setTitle("Conference");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //profileLabel.setToolTipText("Other topic areas");  // show  气泡hint
        setSize(1000, 700);
        add(ConferenceMainPanel);
        setVisible(true);


        editLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ConferenceEdit conferenceEdit = new ConferenceEdit();
                conferenceEdit.setVisible(true);
                dispose();
            }
        });

        logOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SignIn signIn = new SignIn();
                signIn.setVisible(true);
                dispose();
            }
        });
        paperCheckLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                PapersForConference papersforconference = new PapersForConference();
                papersforconference.setVisible(true);
                dispose();
            }
        });
        reviewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReviewAssign reviewAssign = new ReviewAssign();
                reviewAssign.setVisible(true);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new ConferenceMain();
    }

}
