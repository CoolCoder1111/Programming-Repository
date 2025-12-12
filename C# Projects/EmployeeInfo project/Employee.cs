using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Employeeinfo
{
    internal class Employee
    {
        private string name;
        private string department;
        private int salary;

        public Employee(string name, string department, int salary)
        {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public void Raise()
        {
            salary = salary + 1000;
        }

        public void Raise(int raisePassed)
        {
            salary = salary + raisePassed;
        }

        public void changeDepartment(string depart)
        {
            department = depart;

        }

        public string getInfo()
        {
            return name + " works at " + department + " and has a salary of " + salary + " dollars";

        }



    }
}
