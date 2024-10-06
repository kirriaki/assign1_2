package uni.assik1_2;

import javax.swing.JOptionPane;

public class pushnush implements interfase {
    @Override
    public void send(String message, String user) {
        JOptionPane.showMessageDialog(null, "Sending Push Notification to " + user + ": " + message);
    }
}

