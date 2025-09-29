namespace Dicethrows
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Random rndm = new Random();

            double average;
            int userinput;
            double total;
            double sum;
            
            int d1;
            int d2;

            int t2 = 0;
            int t3 = 0;
            int t4 = 0;
            int t5 = 0;
            int t6 = 0;
            int t7 = 0;
            int t8 = 0;
            int t9 = 0;
            int t10 = 0;
            int t11 = 0;
            int t12 = 0;

            Console.WriteLine("How many times would you like to throw the dice? ");
            userinput = Convert.ToInt32(Console.ReadLine());

            for (int i = 0; i < userinput; i++)
            {
                d1 = rndm.Next(1, 7);
                d2 = rndm.Next(1, 7);

                total = d1 + d2;

                if(total == 2)
                {
                    t2++;
                }
                else if(total == 3)
                {
                    t3++;
                }
                else if (total == 4)
                {
                    t4++;
                }
                else if (total == 5)
                {
                    t5++;
                }
                else if (total == 6)
                {
                    t6++;
                }
                else if (total == 7)
                {
                    t7++;
                }
                else if (total == 8)
                {
                    t8++;
                }
                else if (total == 9)
                {
                    t9++;
                }
                else if (total == 10)
                {
                    t10++;
                }
                else if (total == 11)
                {
                    t11++;
                }
                else if (total == 12)
                {
                    t12++;
                }

            }
            Console.WriteLine("The number of times each total hit is: ");
            Console.WriteLine("2: " + t2);
            Console.WriteLine("3: " + t3);
            Console.WriteLine("4: " + t4);
            Console.WriteLine("5: " + t5);
            Console.WriteLine("6: " + t6);
            Console.WriteLine("7: " + t7);
            Console.WriteLine("8: " + t8);
            Console.WriteLine("9: " + t9);
            Console.WriteLine("10: " + t10);
            Console.WriteLine("11: " + t11);
            Console.WriteLine("12: " + t12);

            average = t2 *2 + t3 * 3  + t4 *4 + t5 * 5 + t6 * 6 + t7 * 7 + t8 * 8 + t9 * 9 + t10 * 10 + t11 * 11 + t12 * 12;

            sum = average / userinput;

            Console.WriteLine("The average of the rolls is: " + sum);
        }
    }
}

