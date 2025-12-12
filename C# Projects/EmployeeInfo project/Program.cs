using Employeeinfo;
using System;
using System.ComponentModel;

public class Program
{
    public static void Main()
    {
        //Create three employee objects
        //You can completely make up the names, departments, and salaries of each employee
        Employee employee1 = new Employee("Tom" , "Construction", 100);
        Employee employee2 = new Employee("Finn", "Helpdesk", 200);
        Employee employee3 = new Employee("Abigail", "Packaging", 300);

        //Display the 'info' for each employee

        Console.WriteLine(employee1.getInfo());
        Console.WriteLine(employee2.getInfo());
        Console.WriteLine(employee3.getInfo());

        //Give the first employee a generic raise

        employee1.Raise(1000);

        //Give change the second employee's department to... something different

        employee2.changeDepartment("Demolition");

        //Give the third employee a raise of 5000

        employee3.Raise(5000);

        //Display the 'info' for each employee again
        Console.WriteLine();
        Console.WriteLine(employee1.getInfo());
        Console.WriteLine(employee2.getInfo());
        Console.WriteLine(employee3.getInfo());

    }
}