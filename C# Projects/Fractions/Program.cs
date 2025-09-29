using System;
using static System.Runtime.InteropServices.JavaScript.JSType;

public class Program
{
    public static void Main()
    {
        Fraction f1 = new Fraction(5, 6);
        Fraction f2 = new Fraction(3, 4);

        f1.Multiply(3, 2);
        f2.Add(1, 2);
        f2.Subtract(1);
        f1.Subtract(f2);
        f1.Divide(3);

        Console.WriteLine("Fraction 1 is now: " + f1.DisplayFraction());
        Console.WriteLine("Fraction 2 is now: " + f2.DisplayFraction());


        Console.ReadKey();
    }
}