namespace CalcOfPi
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double Radius;

            Console.WriteLine("Please input the radius of a circle: ");
            Radius = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Area: ");
            Console.WriteLine(Math.PI * Math.Pow(Radius, 2));

            Console.WriteLine("Circumference: ");
            Console.WriteLine(2 * Math.PI * Radius);

            Console.WriteLine("Press any key to exit...");
            Console.ReadKey();







        }
    }
}
