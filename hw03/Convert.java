//Cole Tomlinson
//2-15-16
//CSE 002 Homework 3
//Conversion java program

//program for converting meters to inches

//import scanner utility to accept inputs

import java.util.Scanner;
//define the class
public class Convert{
//main method 
    public static void main(String[] args) {
//declare scanner instance
Scanner meterScan=new Scanner(System.in);
//declare double for value storage
double amtInches;
//ask for meters to be converted
System.out.print("Enter the meters you wish converted to inches: ");
//store user input
double amtMeters=meterScan.nextDouble();
//convert meters to inches
amtInches=amtMeters*39.3701;
//output the converted quantity
System.out.println(amtMeters+" meters is "+amtInches+" inches.");
    }
}


