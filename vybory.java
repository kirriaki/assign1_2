package uni.assik1_2;

public class vybory {
    public static interfase getNotification(String type) {
        switch (type.toLowerCase()) {
            case "sms":
                return new sms();
            case "email":
                return new email();
            case "push":
                return new pushnush();
            default:
                throw new IllegalArgumentException("Error type: " + type);
        }
    }
}

