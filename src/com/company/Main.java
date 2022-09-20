package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner file;
        Scanner keyBoard = new Scanner(System.in);
        System.out.print("Enter File name: ");
        String inPut = keyBoard.nextLine();
        ArrayList<Person> people = new ArrayList<>();
        Patient g = new Patient("Benjamin Thomas", 13, "Dr.LesliePark");
        try {
            file = new Scanner(new File("C:\\Users\\jcarr\\IdeaProjects\\Project_1_Comp250\\src\\com\\company\\patients.txt"));
        }
        catch (Exception e){
            System.out.println("File Not Found!");
            return;
        }
        while (file.hasNextLine()) {
            String fileData = file.toString();
            String[] Person = fileData.split(",");
            String name = Person[0];
            System.out.println(name);
          //  Patients.add(age[1]);
          //  Patients.add(doctor[2]);
            System.out.print("Placeholder");
        }/*
        while (true){
            switch (inPut){
                case 1: people.toString();  //printall
                break;
                case 2: if(people.getAge()<40){ //print if peoples age is under 40
                    System.out.println(people);
                    break;
                } 
         //       case 3: if(people.getAge()>40){   // print if people age above 40
                    System.out.println(people);
                    break;
                }
           //     case 4: System.exit(0);
            }*/

        }
  //  }
}

