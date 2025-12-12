namespace Dicerollswitharrays
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Random num = new Random();
            
            int userinput;
            double average;
            int sum;
            double total;

            int[] tally = new int[13];

            int d1;
            int d2;

            Console.WriteLine("How many times would you like to throw the dice?");
            userinput = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("The number of times the die hit is: ");

            for (int i = 0; i < userinput; i++)
            {
                d1 = num.Next(1, 7);
                d2 = num.Next(1, 7);

                sum = d1 + d2;

                tally[sum]++;
            }
                for (int v = 2; v < tally.Length; v++)
                {
                    Console.WriteLine(v + ": " + tally[v]);
                }       
            total = tally[1] * 1 + tally[2] * 2 + tally[3] * 3 + tally[4] * 4 + tally[5] * 5 + tally[6] * 6 + tally[7] * 7 + tally[8] * 8 + tally[9] * 9 + tally[10] * 10 + tally[11] * 11 + tally[12] * 12;

            average = total / userinput;

            Console.WriteLine("The average of the throws is: " + average);
        }
    }
}
