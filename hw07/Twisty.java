//Cole Tomlinson
//Homework 7
//Twisty java program

//import scanner
import java.util.Scanner;


//define class
public class Twisty{
//add main method
    public static void main(String[] args){

//declare scanner instance
Scanner twistInput=new Scanner(System.in);
//variables for twist length and width
int length;
int width;
//variables for length and height counts
int lineCount=0;
int charCount=0;

//prompt user for length and width with error check
System.out.println("Enter your desired length");
length=twistInput.nextInt();
while(length>80 || length<0){
    System.out.println("Length out of bounds please enter a positive integer less than 80");
    length=twistInput.nextInt();
}

//prompt user for width 
System.out.println("Enter your desired width");
width=twistInput.nextInt();
while(width>length){
    System.out.println("Width cannot exceed length try again");
    width=twistInput.nextInt();
}

while(lineCount<width){                                                         //loop for control of number of lines
    charCount=0;                                                                //set counter for character position with first position 0
    while(charCount<length){                                                    //loop for length control of each line
        if(charCount%width==lineCount && (charCount/width)%2==0){               //if statement with condition for downward right sloping # positions
            System.out.print("#");                          
        }
        else if(charCount%width==lineCount && (charCount/width)%2==1){          //if statement with condition for downward right sloping \ positions
            System.out.print("\\");
        }
        else if(charCount%width==width-1-lineCount && (charCount/width)%2==0){  //if statement with condition for upward left sloping / positions
            System.out.print("/");
        }
        else if(charCount%width==width-1-lineCount && (charCount/width)%2==1){  //if statement with condition for upward left sloping # positions
            System.out.print("#");
        }
        else{
            System.out.print(" ");                                              //print blank spaces where no special character should exist
        }
        charCount++;                                                            //add 1 to the character count variable with each output
}
System.out.println();                                                           //start a new line once the character count limit for the line is met
lineCount++;                                                                    //add 1 to the variable keeping track of the amount of lines at the completion of a line
    }
    }
}