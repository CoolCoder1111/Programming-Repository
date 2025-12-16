namespace MadLibProject
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string name;
            string color;
            string videogame;
            string weather;
            string place;

            Console.WriteLine("Whats your name?");
            name = Console.ReadLine();

            Console.WriteLine("What's your favorite color?");
            color = Console.ReadLine();

            Console.WriteLine("What's your favorite video game?");
            videogame = Console.ReadLine();

            Console.WriteLine("What type of weather do you hate the most?");
            weather = Console.ReadLine();

            Console.WriteLine("What's your favorite place to go to?");
            place = Console.ReadLine();

            Console.WriteLine("Hi, my name is " + name);
            Console.WriteLine("and my favorite color is " + color);
            Console.WriteLine("I was going to the store to buy my favorite video game: " +  videogame);
            Console.WriteLine("When all of a sudden it started to " + weather);
            Console.WriteLine("Due to the horrible weather, I had to go back to " + place);
        }
    }
}
