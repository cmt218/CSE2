//Cole Tomlinson
//Lab 9
//Random sentence java program

//import random 
import java.util.Random;
//import scanner
import java.util.Scanner;

//define class
public class Sentence{
    
    
//word generation methods are type void and print out a single word for the corresponding category based on a random integer input that can be easily surrounded by other print statements when the method is called to appear as a single line of text
public static void ranAdj(int choice1){
    switch(choice1){
        case 0:
            System.out.print("fast");
            break;
        case 1:
            System.out.print("loud");
            break;
        case 2:
            System.out.print("obnoxious");
            break;
        case 3:
            System.out.print("big");
            break;
        case 4:
            System.out.print("small");
            break;
        case 5:
            System.out.print("smart");
            break;
        case 6:
            System.out.print("amazing");
            break;
        case 7:
            System.out.print("enthusiastic");
            break;
        case 8:
            System.out.print("crippled");
            break;
        case 9:
            System.out.print("determined");
            break;
        
    }
}

public static void ranSub(int choice2){
    switch(choice2){
        case 0:
            System.out.print("president");
            break;
        case 1:
            System.out.print("animal");
            break;
        case 2:
            System.out.print("janitor");
            break;
        case 3:
            System.out.print("car");
            break;
        case 4:
            System.out.print("child");
            break;
        case 5:
            System.out.print("student");
            break;
        case 6:
            System.out.print("plant");
            break;
        case 7:
            System.out.print("businessman");
            break;
        case 8:
            System.out.print("worker");
            break;
        case 9:
            System.out.print("teacher");
            break;
        
    }
    
}

public static void ranVerb(int choice3){
    switch(choice3){
        case 0:
            System.out.print("poked");
            break;
        case 1:
            System.out.print("slashed");
            break;
        case 2:
            System.out.print("broke");
            break;
        case 3:
            System.out.print("flew");
            break;
        case 4:
            System.out.print("drove");
            break;
        case 5:
            System.out.print("scolded");
            break;
        case 6:
            System.out.print("hit");
            break;
        case 7:
            System.out.print("yelled at");
            break;
        case 8:
            System.out.print("observed");
            break;
        case 9:
            System.out.print("kicked");
            break;
        
    }
    
}

public static void ranObj(int choice4){
    switch(choice4){
        case 0:
            System.out.print("ball");
            break;
        case 1:
            System.out.print("computer");
            break;
         case 2:
            System.out.print("tire");
            break;
        case 3:
            System.out.print("pencil");
            break;
        case 4:
            System.out.print("toy");
            break;
        case 5:
            System.out.print("bracelet");
            break;
        case 6:
            System.out.print("shoe");
            break;
        case 7:
            System.out.print("mirror");
            break;
        case 8:
            System.out.print("television");
            break;
        case 9:
            System.out.print("chair");
            break;
        
    }
    
}


//add main method
    public static void main(String[] args){
        
//create random object
Random ranGen = new Random();
//create scanner
Scanner choiceIn = new Scanner(System.in);

//4 random numbers from 0-9 are generated to select a word from the 4 word generation methods
//choice int for query at end to generate another sentence
int ran1 = ranGen.nextInt(9);
int ran2 = ranGen.nextInt(9);
int ran3 = ranGen.nextInt(9);
int ran4 = ranGen.nextInt(9);
int choice;


//Sentence skeleton with methods being called to put appropriate words where they ought to be to make gramatical sense
//each element has its own line for ease of management
System.out.print("The ");
ranAdj(ran1);
System.out.print(" ");
ranAdj(ran2);
System.out.print(" ");
ranSub(ran1);
System.out.print(" ");
ranVerb(ran3);
System.out.print(" the ");
ranAdj(ran3);
System.out.print(" ");
ranObj(ran4);
System.out.print(".");


//query user to find out if they want another sentence generated
System.out.println();
System.out.println("Would you like another sentence? 1 for yes 2 for no");
choice = choiceIn.nextInt();

while(choice == 1){

//generate new random integers for already initiated variables
ran1 = ranGen.nextInt(9);
ran2 = ranGen.nextInt(9);
ran3 = ranGen.nextInt(9);
ran4 = ranGen.nextInt(9);

//same sentence skeleton as previously used
System.out.print("The ");
ranAdj(ran1);
System.out.print(" ");
ranAdj(ran2);
System.out.print(" ");
ranSub(ran1);
System.out.print(" ");
ranVerb(ran3);
System.out.print(" the ");
ranAdj(ran3);
System.out.print(" ");
ranObj(ran4);
System.out.print(".");
System.out.println();

//query user again wether they want another random sentence or not
System.out.println("Would you like another sentence? 1 for yes 2 for no");
choice = choiceIn.nextInt();

}

    }
}