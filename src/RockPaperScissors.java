import java.util.Scanner;
public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playAgain;

        do {
            // a. Get Player A's move, loop until valid
            String moveA;
            do {
                System.out.print("Player A, enter your move [R/P/S]: ");
                moveA = in.nextLine().trim();
                if (!(moveA.equalsIgnoreCase("R") || moveA.equalsIgnoreCase("P")
                        || moveA.equalsIgnoreCase("S"))) {
                    System.out.println("Invalid move. Please enter R, P, or S.");
                    moveA = "";
                }
            } while (moveA.equals(""));

            // b. Get Player B's move in the same manner
            String moveB;
            do {
                System.out.print("Player B, enter your move [R/P/S]: ");
                moveB = in.nextLine().trim();
                if (!(moveB.equalsIgnoreCase("R") || moveB.equalsIgnoreCase("P")
                        || moveB.equalsIgnoreCase("S"))) {
                    System.out.println("Invalid move. Please enter R, P, or S.");
                    moveB = "";
                }
            } while (moveB.equals(""));

            // Normalize to uppercase so the comparisons below are simple
            moveA = moveA.toUpperCase();
            moveB = moveB.toUpperCase();

            // c. Display the results
            if (moveA.equals(moveB)) {
                String name;
                if (moveA.equals("R")) {
                    name = "Rock";
                } else if (moveA.equals("P")) {
                    name = "Paper";
                } else {
                    name = "Scissors";
                }
                System.out.println(name + " vs " + name + " - it's a Tie!");
            } else if (moveA.equals("R") && moveB.equals("S")) {
                System.out.println("Rock breaks Scissors - Player A wins!");
            } else if (moveA.equals("P") && moveB.equals("R")) {
                System.out.println("Paper covers Rock - Player A wins!");
            } else if (moveA.equals("S") && moveB.equals("P")) {
                System.out.println("Scissors cuts Paper - Player A wins!");
            } else if (moveB.equals("R") && moveA.equals("S")) {
                System.out.println("Rock breaks Scissors - Player B wins!");
            } else if (moveB.equals("P") && moveA.equals("R")) {
                System.out.println("Paper covers Rock - Player B wins!");
            } else {
                System.out.println("Scissors cuts Paper - Player B wins!");
            }

            // d. Prompt to play again, loop until Y or N
            do {
                System.out.print("Play again? [Y/N]: ");
                playAgain = in.nextLine().trim();
                if (!(playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N"))) {
                    System.out.println("Invalid choice. Please enter Y or N.");
                    playAgain = "";
                }
            } while (playAgain.equals(""));

            // e. Continue or terminate based on the choice
        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
        in.close();
    }
}