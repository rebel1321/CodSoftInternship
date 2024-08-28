import java.util.Random;
import java.util.Scanner;

public class NumberGuessingChallenge {
    private int maxAttempts;
    private int rounds;
    private int totalScore;
    private Scanner inputScanner;
    private Random randomGenerator;

    public NumberGuessingChallenge(){
        this.maxAttempts = 11;
        this.rounds = 0;
        this.totalScore = 0;
        this.inputScanner = new Scanner(System.in);
        this.randomGenerator = new Random();
    }

    public void initiateGame(){
        boolean continuePlaying;
        System.out.println("--  Reveal Your Number Guessing Mastery!! --");

        do{
            playSingleRound();
            System.out.println("Would you like to play another round? (yes/no): ");
            continuePlaying =inputScanner.next().trim().equalsIgnoreCase("yes");
        } while(continuePlaying);

        concludeGame();
    }
    private void playSingleRound(){
        rounds++;
        int targetNumber = randomGenerator.nextInt(100)+1;
        int attemptsRemaining = maxAttempts;
        boolean hasGuessedCorrectly = false;

        System.out.println("\nRound "+ rounds + " Begins!");
        System.out.println("I've picked a number between 1 and 100. Can you guess it?");

        while (attemptsRemaining >0 && !hasGuessedCorrectly){
            System.out.println("Your guess: ");
            int userGuess =inputScanner.nextInt();

            if(userGuess==targetNumber){
                System.out.println("Congratulations! You guessed the number!");
                hasGuessedCorrectly = true;
                totalScore += attemptsRemaining *10;
            } else if (userGuess>targetNumber) {
                System.out.println("Too high! Try again.");
            } else{
                System.out.println("Too low! Give it another try.");
            }
            attemptsRemaining--;
        }
        if(!hasGuessedCorrectly){
            System.out.println("Out of attempts! The correct number was " + targetNumber);
        }
    }
    private void concludeGame(){
        System.out.println("\nGame Over!");
        System.out.println("Total Rounds Played: " + rounds);
        System.out.println("Final Score: " + totalScore);
        System.out.println("Thanks for joining the challenge!");
    }

    public static void main(String[] args) {
        NumberGuessingChallenge game = new NumberGuessingChallenge();
        game.initiateGame();
    }
}
