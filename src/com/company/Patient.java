package com.company;

public class Patient extends Person{
    public String doctor;

    public Patient(String name, int age, String doctor){
        super(name,age);
        this.doctor = doctor;
    }
        public String toString(){
            return name +", "+"age "+ age+". " + doctor+".";
        }
}



