namespace hypotenusecalc
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int Altitude;
            int Base;

            Console.WriteLine("Welcome to the Hypotenuse Calculator!");
            Console.WriteLine("Please input a value for the Altitude of the right triangle");
            Altitude= Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Please input the value for the base of the right triangle");
            Base = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("The hypotenuse would be...");
            Console.WriteLine(Math.Sqrt(Math.Pow(Altitude, 2) + Math.Pow(Base, 2)));
            Console.WriteLine("Please press enter to end the application");
            Console.ReadKey();
        }
    }
}
