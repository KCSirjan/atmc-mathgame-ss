import java.util.Scanner;
import java.util.Random;
public class Score{
    public static void main(String[]args){
        int i;
        int Score=0;
        int MyAnswer=5;
        int yourAnswer;
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        for(i=0; i<=5; i++){
            System.out.println("Guess the answer:");
            yourAnswer = s.nextInt();
            if(yourAnswer == MyAnswer){
                Score++;
                //System.out.println("Your score is ");
            }
        }

        System.out.println("Your score is: "+Score);
    }
}
