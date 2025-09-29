using System.Reflection.Metadata;

namespace D_Ddice
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int total;
            int userinput;
            int dice;

            Console.WriteLine("How many dice should the 'DiceRoll' method should roll?");
            userinput = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("How many sides should the die or dice have?");
            dice = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("The results are: ");

                total = rollDice(userinput, dice);
                Console.WriteLine(total);

        }
        static int rollDice(int userinput, int dice)
        {
            Random number = new Random();
            int total = 0;

            for (int i = 0; i < userinput; i++)
            {
                total += number.Next(1, dice + 1);
            }

            
            return total;

        }

    }
}
