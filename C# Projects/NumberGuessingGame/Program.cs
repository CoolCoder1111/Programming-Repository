namespace Number_Guessing_Game
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Random rndm = new Random();

            int PcRndmNum;
            int User;
            int Guesses = 0;

            PcRndmNum = rndm.Next(11);

            Console.WriteLine("Welcome to the Number Guessing game!");
            Console.WriteLine("In this game, you will have to guess the number that the computer picked");
            Console.WriteLine("At the end of the game, your amount of guesses will be displayed on the screen");
            Console.WriteLine("To start, please input your guess. Enter a value between 1 and 10");
            User = Convert.ToInt32(Console.ReadLine());

            while (User != PcRndmNum)
            {
               if(User > PcRndmNum)
                {
                    Console.WriteLine("Too high of a number. Try again");
                    User = Convert.ToInt32(Console.ReadLine());
                } 
                else
                {
                    Console.WriteLine("Too low of a number. Try again.");
                    User = Convert.ToInt32(Console.ReadLine());
                }
                Guesses++;
            }
            Console.WriteLine("Congratulations! you guessed the right number!");
            Console.WriteLine("The amount of guesses it took you to get the right number was: ");
            Console.WriteLine(Guesses);
            Console.WriteLine("Thank you for playing! Press any key to end the application");
            Console.ReadKey();


        }
    }
}
