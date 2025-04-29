import java.util.Random;
public class Expiration {
    Random random = new Random();
    void ExpirationDate(){
        int daysUntillExpiration = random.nextInt(12);
        int discountedPercentage = 0;

        if(daysUntillExpiration == 1){
            discountedPercentage = 20;
        }
        if(daysUntillExpiration <= 5){
            discountedPercentage = 10;
        }
        if(daysUntillExpiration < 1){
            System.out.println("Your subscription has expired !");
        }
        else if(daysUntillExpiration == 1){
            System.out.println("Your subscription expires within a day !");
            System.out.println("Renew now and save" + discountedPercentage + "% !");
        }
        else if (daysUntillExpiration <= 5) {
            System.out.println("Your subscription expires in " + daysUntillExpiration + " days !");
            System.out.println("Renew now and save" + discountedPercentage + "% !");
        }
        else if (daysUntillExpiration <= 10) {
            System.out.println("Your subscription expires in " + daysUntillExpiration + " days !");
            System.out.println("Your subscription will expire soon. Renew now !");
        }

    }
    public static void main(String[] args) {
        (new Expiration()).ExpirationDate();
    }
}
