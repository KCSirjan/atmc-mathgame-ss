import java.util.Scanner;
public class HighScore{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int noofgames=4;
        int Score;
        int highscore=0;
        int count;

        for(count=0; count<noofgames ; count++) {
            System.out.println("Enter the score:");
            Score = s.nextInt();
            if (highscore < Score) {
                highscore = Score;
            }
        }
        System.out.println("The high score in the game is "+highscore);
    }
}
