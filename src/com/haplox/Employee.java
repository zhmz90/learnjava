package com.haplox.Employee;
/*public*//*
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello World!");
    }
}*//*
class FreshJuice {

    enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
    FreshJuiceSize size;
}

public class Main {

    public static void main(String args[]){
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
        System.out.println("Size: " + juice.size);
    }
}

public class Dog{
    String breed;
    int ageC
    String color;

    void barking(){
    }

    void hungry(){
    }

    void sleeping(){
    }
*/
/*
public class Puppy{

    int puppyAge;

    public Puppy(String name){
        // This constructor has one parameter, name.
        System.out.println("Name chosen is :" + name );
    }

    public void setAge( int age ){
        puppyAge = age;
    }

    public int getAge( ){
        System.out.println("Puppy's age is :" + puppyAge );
        return puppyAge;
    }

    public static void main(String []args){
      */
/* Object creation *//*

        Puppy myPuppy = new Puppy( "tommy" );

      */
/* Call class method to set puppy's age *//*

        myPuppy.setAge( 2 );

      */
/* Call another class method to get puppy's age *//*

        myPuppy.getAge( );

      */
/* You can access instance variable as follows as well *//*

        System.out.println("Variable Value :" + myPuppy.puppyAge );
    }
}*/



import java.io.*;

public class EmployeeA{

    String name;
    int age;
    String designation;
    double salary;

    // This is the constructor of the class Employee
    public Employee(String name){
        this.name = name;
    }
    // Assign the age of the Employee  to the variable age.
    public void empAge(int empAge){
        age =  empAge;
    }

/* Assign the designation to the variable designation.*/

    public void empDesignation(String empDesig){
        designation = empDesig;
    }

/* Assign the salary to the variable	salary.*/

    public void empSalary(double empSalary){
        salary = empSalary;
    }

// Print the Employee details

    public void printEmployee(){
        System.out.println("Name:"+ name );
        System.out.println("Age:" + age );
        System.out.println("Designation:" + designation );
        System.out.println("Salary:" + salary);
    }

}



public class Employee{

    public static void main(String args[]){
      /* Create two objects using constructor */
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");

        // Invoking methods for each object created
        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}