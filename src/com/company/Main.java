package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner file;
        Scanner keyBoard = new Scanner(System.in);
        System.out.print("Enter File name to load data: ");
        String inPut = keyBoard.nextLine();
        ArrayList<Person> people = new ArrayList<>();
        try {
            file = new Scanner(new File("C:\\Users\\jcarr\\IdeaProjects\\Project_1_Comp250\\src\\com\\company\\patients.txt"));
            }
        catch (FileNotFoundException e){
            System.out.println("File Not Found!");
            return;
        }
            while (file.hasNextLine()) {
                try {
                    String fileData = file.nextLine();
                    String[] Person = fileData.split(",");
                    String name = Person[0];
                    String age = (Person[1]);
                    String doctor = (Person[2]);
                    int iAge = Integer.parseInt(age);
                    people.add(new Patient(name,iAge,doctor));
                }
            catch (NumberFormatException i) {
                    break;
                }
            }
        while (true) {
            Scanner keyBoard2 = new Scanner(System.in);
            System.out.println("1| Display all Patients.");
            System.out.println("2| Display all under 40.");
            System.out.println("3| Display all above 40.");
            System.out.println("4| Quit");
            System.out.print("Enter Number to display Patients or Quit!: ");
            int inPut2 = keyBoard2.nextInt();

            switch (inPut2) {
                case 1 -> {         //Print all Patients
                    for (Person list : people) {
                        System.out.println(list);
                    }
                    System.out.println("");
                }
                case 2 -> {
                    for (Person list : people) {   //print if peoples age is under 40
                        if (list.age <= 40) {
                            System.out.println(list);
                        }
                    }
                    System.out.println("");
                }
                case 3 -> {
                        for (Person list : people) {   // print if people age above 40
                            if (list.age > 40) {
                                System.out.println(list);
                            }
                        }
                        System.out.println("");
                    }
                case 4 -> System.exit(0);
            }
        }
    }
}
