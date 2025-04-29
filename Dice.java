import java.io.Console;
import java.util.Random;
public class Dice {
    Random dice = new Random();

    void roll(){
        int roll;
        int roll1 = dice.nextInt(1,7);
        int roll2 = dice.nextInt(1,7);
        int roll3 = dice.nextInt(1,7);
        int total = roll1+roll2+roll3;
        System.out.println("Dice roll: " + roll1 + ", " + roll2 + ", " + roll3);
        if((roll1==roll2)&&(roll2==roll3)){
            System.out.println("You rolled triples ! +6 bonus to total !" + total);
            total+=6;}
        else if((roll1==roll2)||(roll2==roll3)||(roll1==roll3)){
            System.out.println("You rolled doubles ! +2 bonus to total ! " + total);
            total+=2;}

        if (total>=15){
            System.out.println("! You win,!");
        }
        else{
            System.out.println("! you loose ! " + total);

        }
    }
    public static void main(String[] args) {
        (new Dice()).roll();
    }
}
