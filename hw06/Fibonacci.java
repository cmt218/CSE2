//Cole Tomlinson
//Homework 6
//Fibonacci number sequence java program

//import scanner
import java.util.Scanner;

//define class
public class Fibonacci{
    
//add main method
    public static void main(String[] args){
        
//declare scanner instance
Scanner numInput=new Scanner(System.in);

//variables for loop count and number storage
int counter=0;
int fibThree;
//prompt user for and accept first number in the sequence
System.out.println("Enter the first number in the sequence: ");
int fibOne=numInput.nextInt();
//error check
while(fibOne<=0){
    System.out.println("Number must be positive try again");
    System.out.println("Enter the first number in the sequence: ");
    fibOne=numInput.nextInt();
}
//prompt user for an accept second number in the sequence
System.out.println("Enter the second number in the sequence: ");
int fibTwo=numInput.nextInt();
//error check
while(fibTwo<=0){
    System.out.println("Number must be positive try again");
    System.out.println("Enter the second number in the sequence: ");
    fibTwo=numInput.nextInt();
}
//prompt user for sequence length
System.out.println("How many custom Fibonacci numbers should be printed?");
int fibLength=numInput.nextInt();
//error check
while(fibLength<=0){
    System.out.println("Number must be positive try again");
    System.out.println("How many custom Fibonacci numbers should be printed?");
    fibLength=numInput.nextInt();
}
//output first two numbers in the sequence
System.out.print(fibOne+", "+fibTwo);
//output numbers according to fibonacci sequencing
while(counter<fibLength-2){
    fibThree=fibOne+fibTwo;
    //catch last loop cycle to put period
    if(counter == fibLength-3){
        System.out.println(", "+fibThree+".");
        break; //escape loop since it is the last number 
    }
    System.out.print(", "+fibThree); //output next number in the sequence
    fibOne=fibTwo; //bump up variable positions by one in the sequence
    fibTwo=fibThree;
    counter++; //add to counter to control loop
}
    }
}