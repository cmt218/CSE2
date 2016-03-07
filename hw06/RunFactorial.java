//Cole Tomlinson
//Homework 6
//Factorial calculator java program

//import scanner
import java.util.Scanner;

//define class
public class RunFactorial{
//add main method
    public static void main(String[] args){

//declare scanner instance
Scanner userInput=new Scanner(System.in);
//variables for factorial storage and display
int factorial=1;
int number;

//prompt user for factorial input and store
System.out.println("Please enter an integer that is between 9 and 16");
int facNum=userInput.nextInt();
//keep this number handy to display later
number=facNum;

//error check
while(facNum>16 || facNum<9){
    System.out.println("Invalid input, enter again!");
    facNum=userInput.nextInt();
}
//calculating the factorial
System.out.println("Input accepted: ");
while(facNum>0){
    factorial=factorial*facNum; //multiply factorial term by incrementally lower number 
    facNum--;
}
//displaying the factorial
System.out.println(number+"! = "+factorial);
    }
}