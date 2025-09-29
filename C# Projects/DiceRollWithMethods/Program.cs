using System.ComponentModel.Design.Serialization;
using System.Diagnostics.CodeAnalysis;
using System.Numerics;
using static System.Runtime.InteropServices.JavaScript.JSType;

namespace Dicerollswithmethods
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int total;

            Console.WriteLine("The results are: ");

            total = DiceRoll();

            Console.WriteLine(total);
            total = DiceRoll();
            Console.WriteLine(total);
            total = DiceRoll();
            Console.WriteLine(total);
            total = DiceRoll();
            Console.WriteLine(total);
            total = DiceRoll();
            Console.WriteLine(total);

        }   
        static int DiceRoll()
        {
            Random number = new Random();
            
                int x;
                int y;
                
                x = number.Next(1, 7);
                y = number.Next(1, 7);

            int total;
            total = x + y;
            return total;

        }


        
    }
}


