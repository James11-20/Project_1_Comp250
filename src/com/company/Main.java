package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();
        Patient g = new Patient("Benjamin Thomas",13,"Dr.LesliePark");
        people.add(g);
        new Scanner(System.in);
        System.out.println(people);
    }
}
