//Cole Tomlinson
//Homework 9
//Rectangularize Java Program

//import scanner
import java.util.Scanner;

//define class 
public class Rectangularize{
    
public static void makeRectangle(String word){        //method for printing word length amount of times
    int length=word.length();                       //get length of word input
    for(int x=0;x<length;x++){                      //print the word on a new line the amount of times its length is
        System.out.println(word);                   //print the word
    }
}
    
public static void makeRectangle(int number){            //method for printing % symbol in a square defined by input
    int a=0;                                        //counter for while loop
    int y;                                          //variable for use inside for loop
    
    while(a<number){                                //run the line printing loop for an amount of times equal to the input
    for(y=0;y<number;y++){                          //for loop running for the length of the output
    System.out.print("%");                          //print that many copies of the % symbol on the same line
    }
    
    System.out.println();                           //start a new line once the line is completed
    y=0;                                            //reset print counter
    a++;                                            //increment line counter
    }
    
}
    
//add main method  
    public static void main(String[] args){
        
Scanner userIn=new Scanner(System.in);
        
System.out.println("Enter a word");                 //prompt user for word input
String uWord=userIn.nextLine();                     //store word input
makeRectangle(uWord);                                 //run method with word input

System.out.println("Enter a number");               //prompt user for number input
int uInt=userIn.nextInt();                          //store number input
makeRectangle(uInt);                                     //run method with number input
    }
}