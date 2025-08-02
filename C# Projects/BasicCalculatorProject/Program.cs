namespace BasicCalcProject
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double UserNum1;
            double UserNum2;

            Console.WriteLine("Welcome to the calculator app!");
            Console.WriteLine("Please type in your first number");
            UserNum1 = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Please type in your second number");
            UserNum2 = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Your first number plus the second number is: ");
            Console.WriteLine(UserNum1 + UserNum2);

            Console.WriteLine("Your first number minus the second number is: ");
            Console.WriteLine(UserNum1 - UserNum2);

            Console.WriteLine("Your first number multiplied by the second number is: ");
            Console.WriteLine(UserNum1 * UserNum2);

            Console.WriteLine("Your first number divided by the second number is: ");
            Console.WriteLine(UserNum1 / UserNum2);

            Console.WriteLine("Press any key to end the program");
            Console.ReadKey();
        }
    }
}
