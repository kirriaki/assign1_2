package uni.assik1_2;

import javax.swing.JOptionPane;

public class email implements interfase {
    @Override
    public void send(String message, String user) {
        JOptionPane.showMessageDialog(null, "Sending Email to " + user + ": " + message);
    }
}
