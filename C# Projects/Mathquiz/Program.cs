namespace Mathquiz
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int answer;
            int x = 0;

            Console.WriteLine("Welcome to the math quiz!");
            Console.WriteLine("In order to pass the math quiz, you will need to get 5 points!");
            Console.WriteLine("Press enter to start the math quiz");
            Console.ReadKey();

            Console.WriteLine("Question 1: What is 2+2? ");
            answer = Convert.ToInt32(Console.ReadLine());
            if (answer == 4)
            {
                Console.WriteLine("Correct!");
                 x = x + 1;
                Console.WriteLine("Press Enter to Continue");
            }
            else
            {
                Console.WriteLine("Wrong!");
                Console.WriteLine("Press Enter to Continue");
            }
            Console.ReadKey();
            Console.WriteLine("Question 2: What's 9 * 9?");
            answer = Convert.ToInt32(Console.ReadLine());
            if (answer == 81)
            {
                Console.WriteLine("Correct!");
                Console.WriteLine("Press Enter to Continue");
                x = x + 1;
            }
            else {
                Console.WriteLine("Wrong!");
                Console.WriteLine("Press Enter to Continue");
            }
            Console.ReadKey();
            Console.WriteLine("Question 3: What's 10 divided by 5?");
            answer = Convert.ToInt32(Console.ReadLine());
            if (answer == 2)
            {
                Console.WriteLine("Correct!");
                Console.WriteLine("Press Enter to Continue");
                x = x+ 1;
            }
            else
            {
                Console.WriteLine("Wrong!");
                Console.WriteLine("Press Enter to Continue");
            }
            Console.ReadKey();
            Console.WriteLine("Question 4:What's 500 - 400?");
            answer = Convert.ToInt32(Console.ReadLine());
            if (answer == 100)
            {
                Console.WriteLine("Correct!");
                Console.WriteLine("Press Enter to Continue");
                x = x + 1;
            }
            else {
                Console.WriteLine("Wrong!");
                Console.WriteLine("Press Enter to Continue");
            }
            Console.ReadKey();
            Console.WriteLine("Final question! What's 1,267 x 358?");
            answer = Convert.ToInt32(Console.ReadLine());
            if (answer == 453586)
            {
                Console.WriteLine("Correct!");
                Console.WriteLine("Press Enter to Continue");
                x = x + 1;
            }
            else
            {
                Console.WriteLine("Wrong!");
                Console.WriteLine("Press Enter to Continue");
            }

            Console.Write("You got ");
            Console.Write(x);
            Console.WriteLine(" out of 5 questions correct!");

            if (x >= 5)
            {
                Console.WriteLine("You passed, congratulations!");
            }
            else
            {
                Console.WriteLine("You failed, womp womp!");
            }

                Console.WriteLine("Press Enter to end the application.");
            Console.ReadKey();
        }
    }
}
