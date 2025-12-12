namespace Hut_Hike
{
    internal class Program
    {
        static void Main(string[] args)
        {
            for (int i = 1; i < 101; i++)
            {
                if (i % 7 == 0 && i % 3 == 0)
                {
                    Console.WriteLine("Hutt and hike");
                }
                else if (i % 3 == 0)
                {
                    Console.WriteLine("hutt");
                }
                else if (i % 7 == 0)
                { 
                    Console.WriteLine("hike");
                }
                else
                {
                    Console.WriteLine(i);
                }

            }
        }
    }
}
