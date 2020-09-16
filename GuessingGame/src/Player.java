public class Player
{

    int number = 0;

    public void guess(int maximum)
    {
        number = (int) (Math.random()*maximum);
    }

    public boolean isRight(int target)
    {
        if (number == target)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}