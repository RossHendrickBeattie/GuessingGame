public class GuessGame
{
    Player player1;
    Player player2;
    Player player3;

    public void startGame()
    {
        int guessRange = 20;

        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

        int targetNumber = (int) (Math.random()*guessRange);
        System.out.println("The number to guess is: " + targetNumber);

        while (true)
        {
            System.out.println("Number to guess is " + targetNumber);

            player1.guess(guessRange);
            System.out.println("Player 1 guessed " + player1.number);
            player2.guess(guessRange);
            System.out.println("Player 1 guessed " + player2.number);
            player3.guess(guessRange);
            System.out.println("Player 1 guessed " + player3.number);

            if (player1.isRight(targetNumber) || player2.isRight(targetNumber) || player3.isRight(targetNumber))
            {
                System.out.println("We have a winner!");
                break;
            }

            else
            {
                System.out.println("Players will have to try again");
            }

        }
    }
}