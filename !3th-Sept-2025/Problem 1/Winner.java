import java.util.*;

public class Winner {
  
    public static int Scoreboard(int[][] score){
      int rowLength = score.length;
      int columnLength = score[0].length;
      int[] sum_of_row = new int[rowLength];
      
      int sum = 0;
      int winningTeam = -1;
      int maxScore = Integer.MIN_VALUE;
      
      for (int i = 0; i<rowLength; i++) {
        for (int j = 0; j<columnLength; j++) {
          sum += score[i][j];    
        }
        
        if (sum > maxScore) {
          maxScore = sum;
          winningTeam = i;
        }
      }
      
      return winningTeam;
    }
      
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int teams = sc.nextInt();
      int players = sc.nextInt();
      
      int[][] scoreboard = new int[teams][players];
      
      for(int i = 0; i < teams; i++) {
        for (int j = 0; j < players; j++) {
          scoreboard[i][j] = sc.nextInt();
        }
      }
      
      int winningTeam = Scoreboard(scoreboard);
      System.out.println(winningTeam);
      
  }
}
