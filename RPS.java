import java.util.Scanner;

public class RPS {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String player1, player2;
    int rounds;
    int p1Wins = 0;
    int p2Wins = 0;

    System.out.println("Welcome to Rock, Paper, Scissors!");
    System.out.print("Enter the number of rounds: ");
    rounds = input.nextInt();
    input.nextLine();

    for (int i = 1; i <= rounds; i++) {
      System.out.print("Player 1, make your move (rock, paper, scissors): ");
      player1 = input.nextLine();
      System.out.print("Player 2, make your move (rock, paper, scissors): ");
      player2 = input.nextLine();

      if (player1.equalsIgnoreCase("rock")) {
        if (player2.equalsIgnoreCase("scissors")) {
          System.out.println("Player 1 wins round " + i);
          p1Wins++;
        } else if (player2.equalsIgnoreCase("paper")) {
          System.out.println("Player 2 wins round " + i);
          p2Wins++;
        } else {
          System.out.println("Round " + i + " is a tie!");
        }
      } else if (player1.equalsIgnoreCase("scissors")) {
        if (player2.equalsIgnoreCase("paper")) {
          System.out.println("Player 1 wins round " + i);
          p1Wins++;
        } else if (player2.equalsIgnoreCase("rock")) {
          System.out.println("Player 2 wins round " + i);
          p2Wins++;
        } else {
          System.out.println("Round " + i + " is a tie!");
        }
      } else if (player1.equalsIgnoreCase("paper")) {
        if (player2.equalsIgnoreCase("rock")) {
          System.out.println("Player 1 wins round " + i);
          p1Wins++;
        } else if (player2.equalsIgnoreCase("scissors")) {
          System.out.println("Player 2 wins round " + i);
          p2Wins++;
        } else {
          System.out.println("Round " + i + " is a tie!");
        }
      } else {
        System.out.println("Invalid move! Please enter rock, paper, or scissors.");
        i--;
      }
    }

    System.out.println("Player 1 wins: " + p1Wins);
    System.out.println("Player 2 wins: " + p2Wins);

    if (p1Wins > p2Wins) {
      System.out.println("Player 1 wins the game!");
    } else if (p2Wins > p1Wins) {
      System.out.println("Player 2 wins the game!");
    } else {
      System.out.println("The game is a tie!");
    }
  }
}
