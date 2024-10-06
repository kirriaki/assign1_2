package uni.assik1_2;

import java.util.List;

public class otpravkasms {
    private interfase notification;

    public otpravkasms(interfase notification) {
        this.notification = notification;
    }
    public void sendToAll(String message, List<String> users) {
        for (String user : users) {
            notification.send(message, user);
        }
    }
}
