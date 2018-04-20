import java.util.Scanner;
import java.util.Random;
public class GuessMyNumber{
    public static void main(String[]args){
        int myNumber=5;
        int yourNumber=0;
        Random r = new Random();
        System.out.println(r.nextInt());
        Scanner s = new Scanner(System.in);
        for(int i=0; i<=5; i++){
            System.out.println("Hey, guess my number:");
            yourNumber = s.nextInt();
            if(yourNumber == myNumber){
                System.out.println("You win, man");
                System.exit(0);
            }else{
                System.out.println("Bad luck brother, Try it again next time");
            }
        }
    }
}
