import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello, " + name + ". Lovely to see you";
    }

    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "It is currently " + date;
    }

    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        String response = "";
        if (conversation == null) {
            response = "I'm waiting for your instructions";
        } else if (conversation.indexOf("Alexis") >= 0) {
            response = "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.indexOf("Alfred") >= 0) {
            response = "At your service. As you wish, naturally";
        } else {
            response = "Right. And with that I shall retire.";
        }
        return response;
    }

    // NINJA BONUS
    // See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have
    // learned!
    public String guestGreeting(String name, String period) {
        // YOUR CODE HERE
        String response = "";
        if (period.toLowerCase().indexOf("morning") >= 0) {
            response = "Good " + period + ", " + name + ". Lovely to see you";
        } else if (period.toLowerCase().indexOf("evening") >= 0) {
            response = "Good " + period + ", " + name + ". Lovely to see you";
        } else if (period.toLowerCase().indexOf("afternoon") >= 0) {
            response = "Good " + period + ", " + name + ". Lovely to see you";
        } else {
            response = "this is not a good response! please try again";
        }
        return response;
    }

    public String guestGreeting() {
        // YOUR CODE HERE
       return "";
    }
}
