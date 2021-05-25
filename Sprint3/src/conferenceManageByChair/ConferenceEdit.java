package conferenceManageByChair;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ConferenceEdit extends JFrame {
    private JPanel ConfEditPanel;
    private JPanel upPanel;
    private JPanel downPanel;
    private JSplitPane firSplit;
    private JSplitPane upSplit;
    private JPanel titlePanel;
    private JPanel otherPanel;
    private JComboBox roleBomboBox;
    private JLabel logText;
    private JLabel iconLabel;
    private JLabel titleLabel;
    private JSplitPane downSplit;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JButton conferenceButton;
    private JButton reviewButton;
    private JButton paperButton;
    private JLabel subTitle;
    private JTextField confNameTextField;
    private JTextField confTopicTextField;
    private JTextField confTitleTextField;
    private JTextField confChairTextField;
    private JTextField confDateTextField;
    private JTextField paperDueTextField;
    private JButton cancelButton;
    private JButton confirmButton;
    private JButton backButton;
    private JLabel confInfoTitleLabel;
    private JButton editButton;
    private JLabel COnfNameLabel;
    private JLabel confTitleLabel;
    private JLabel confDateLabel;
    private JLabel confTopicLabel;
    private JLabel confChairLabel;
    private JLabel confPaperDueLabel;
    private JButton logOutButton;

    public ConferenceEdit() {

        setTitle("Conference");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //profileLabel.setToolTipText("Other topic areas");  // show  气泡hint
        setSize(1000, 700);
        add(ConfEditPanel);
        setVisible(true);

            //
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConferenceMain conferenceMain = null;
                try {
                    conferenceMain = new ConferenceMain();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                conferenceMain.setVisible(true);
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
    }


    public static void main(String[] args) {
        new ConferenceEdit();
    }

}
