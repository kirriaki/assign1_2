package uni.assik1_2;

import javax.swing.JOptionPane;

public class sms implements interfase {
    @Override
    public void send(String message, String user) {
        JOptionPane.showMessageDialog(null, "Sending SMS to " + user + ": " + message);
    }
}

