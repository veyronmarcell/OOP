import java.util.Scanner;
class HelloTillStop{
   Scanner scanner = new Scanner(System.in);
   // outputs "Hello" until user wants to stop
   void showHello(){
      String choice;
      System.out.println("for hello type h, anything else to stop");
      choice = scanner.nextLine();// guard variable
      while (choice.equals("h")){
         System.out.println("Hello");
         choice = scanner.nextLine();// guard variable
      }
   }
   public static void main(String[] args) {
      (new HelloTillStop()).showHello();
   }
}