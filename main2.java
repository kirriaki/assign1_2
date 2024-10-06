package uni.assik1_2;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
public class main2 {
    public static void main(String[] args) {
        String[] types = {"sms", "email", "push"};
        String type = (String) JOptionPane.showInputDialog(
                null,
                "Select sms sender type:",
                "Notification Type",
                JOptionPane.QUESTION_MESSAGE,
                null,
                types,
                types[0]
        );
        String message = JOptionPane.showInputDialog(null, "Enter the message:");
        String userNumber = JOptionPane.showInputDialog(null, "To how many users send?");
        int userCount;
        try {
            userCount = Integer.parseInt(userNumber);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        List<String> users = new ArrayList<>();
        for (int i = 0; i < userCount; i++) {
            String user = JOptionPane.showInputDialog(null, "Enter user " + (i + 1) + " email/phone number:");
            users.add(user);
        }
        interfase notification = vybory.getNotification(type);
        otpravkasms sender = new otpravkasms(notification);
        sender.sendToAll(message, users);
        JOptionPane.showMessageDialog(null, "Success!");
    }
}
