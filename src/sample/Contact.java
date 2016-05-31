package sample;

/**
 * Created by illladell on 5/31/16.
 */
public class Contact {
    String text;
    String phoneText;
    String emailText;

    public Contact(String text, String phoneText, String emailText) {
        this.text = text;
        this.phoneText = phoneText;
        this.emailText = emailText;
    }

    @Override
    public String toString() {
        return text + ", " + phoneText + ", " + emailText;
    }
}
