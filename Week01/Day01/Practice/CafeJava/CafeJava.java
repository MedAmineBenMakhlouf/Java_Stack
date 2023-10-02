public class CafeJava {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", Your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        double mochaPrice = 3.5;
        double dripCoffee = 6;
        double latte = 3.5;
        double cappuccino = 4.5;

        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Noah";
        String customer4 = "Jimmy";

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        
        String fullMsgCust1 = generalGreeting + customer1;
        if (isReadyOrder1 == true) {
            fullMsgCust1 += readyMessage + displayTotalMessage + mochaPrice;
        } else {
            fullMsgCust1 += pendingMessage;
        }
        System.out.println(fullMsgCust1);
        
        String fullMsgCust2 = generalGreeting + customer2;
        if (isReadyOrder2 == true) {
            fullMsgCust2 += readyMessage + displayTotalMessage + cappuccino;
        } else {
            fullMsgCust2 += pendingMessage;
        }
        System.out.println(fullMsgCust2);

        String fullMsgCust2_1 = generalGreeting + customer2 + '\n'+ displayTotalMessage + latte*2;
        if (isReadyOrder2 == true) {
            fullMsgCust2_1 += readyMessage;
        } else {
            fullMsgCust2_1 += pendingMessage;
        }
        System.out.println(fullMsgCust2_1);


        double sum = latte +dripCoffee;
        String fullMsgCust3 = generalGreeting + customer4;
        System.out.println(fullMsgCust3);
        System.out.println("Coffee "+ dripCoffee);
        System.out.println("Latte "+ latte);
        System.out.println("Sum "+ sum);
        if (isReadyOrder3 == true) {
            fullMsgCust3 += readyMessage;
        } else {
            fullMsgCust3 += pendingMessage;
        }
        double afterDesc = sum - dripCoffee;
        System.out.println("your new total is "+afterDesc);
    }
}
