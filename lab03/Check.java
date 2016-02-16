//Cole Tomlinson
//2-12-16
//CSE 002 Lab 3
//Check java program

//Program for splitting a check that uses inputs

//defining class

//import the scanner utility for inputs

import java.util.Scanner;

public class Check{
    
//main method
    public static void main(String[] args) {
        
//declaring scanner instance
Scanner myScanner=new Scanner(System.in);

//ask for check total
System.out.print("Enter total cost of the check in form xx.xx: ");
//accept user input for check total
double checkCost=myScanner.nextDouble();
//ask for tip percentage
System.out.print("Enter the tip percentage you wish to pay in the form xx: ");
//accept user input for tip percentage
double tipPercent=myScanner.nextDouble();
//convert tip percentage to decimal
tipPercent/=100;
//ask for number of people at dinner
System.out.print("Enter the number of people who went out to dinner: ");
//accept input for number of people
int numPeople=myScanner.nextInt();
//declare variables for data storage and output
double totalCost;
double costPerPerson;
int dollars;
int dimes;
int pennies;
//calculate total cost with tip
totalCost=checkCost*(1+tipPercent);
//calculate cost per person
costPerPerson=totalCost/numPeople;
//get the amount in whole dollars
dollars=(int)costPerPerson;
//use modulus division ot determine amount of dimes owed
dimes=(int)(costPerPerson*10)%10;
//do the same for pennies
pennies=(int)(costPerPerson*100)%10;
//output amount owed by each diner
double amount = dollars+dimes+pennies;
System.out.printf("%.2f", amount);
System.out.println("Each person in the group owes $"+dollars+'.'+(dimes+pennies));
    }
}