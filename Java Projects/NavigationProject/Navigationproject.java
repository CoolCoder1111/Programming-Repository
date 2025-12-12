package com.mycompany.navigationproject;

import java.util.ArrayList;
import java.util.Scanner;

public class Navigationproject {

    public static void main(String[] args) {

        Scanner UserInput = new Scanner(System.in);
        ArrayList<Location> e = new ArrayList();

        e.add(new Location("Cleveland", 0, 0, true));
        e.add(new Location("North Pole", 500, 100, true));
        e.add(new Location("Campbell Hill", -50, -50, false));
        e.add(new Location("Tokyo", -100, 1000, true));
        e.add(new Location("Chicago", -200, 75, true));
        e.add(new Location("Erie PA", 150, 0, true));
        e.add(new Location("Allegheny Nation Forest", 300, -75, false));
        e.add(new Location("Teufort", 200, -1000, false));

        System.out.println("Welcome to the Navigation Game! Please start by creating your vehicle.");
        System.out.println("What should the max fuel capacity be? Please enter a number.");

        int MFC = UserInput.nextInt();

        System.out.println("What should the Miles Per Gallon be? Please enter a number.");
        int MPG = UserInput.nextInt();

        Vehicle v1 = new Vehicle(e.get(0), MFC, 100, MPG);

        while(true){
            System.out.println("you are in: " + v1);
            System.out.println("What would you like to do?");
            System.out.println("1: Drive / 2: Refuel / 3: Quit");
            int choice = UserInput.nextInt();
            
                switch (choice) {
                    case 1 -> {
                        System.out.println("Where would you like to drive to? Please pick a number");
                        for (int i = 0; i < e.size(); i++) {
                            Location location = e.get(i);
                            System.out.println((i + 1) + ":" + location.getLocationName());
                        }
                        int choice2 = UserInput.nextInt();
                        choice2 = choice2 - 1;

                        v1.Drive(e.get(choice2));
                }

                    case 2 -> v1.refuel(true);
                    
                    case 3 -> System.exit(0);
                }
            }
        }
}
        

