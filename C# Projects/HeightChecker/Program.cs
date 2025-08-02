using System.ComponentModel.Design;

namespace Heightcheck
{
    internal class Program
    {
        static void Main(string[] args)
        {
           int UserInput;

            Console.WriteLine("Welcome to the Height Range Checker!");
            Console.WriteLine("Please input your height in inches");
            UserInput = Convert.ToInt32(Console.ReadLine());

            if (UserInput < 60 || UserInput > 75)
            {
                Console.WriteLine("Your height is not average");
            }
            else
            {
                Console.WriteLine("Your height is normal");
            }

            Console.WriteLine("Thank you for taking the height checker. Press enter to end the application");
            Console.ReadKey();
               
           
        }
    }
}
