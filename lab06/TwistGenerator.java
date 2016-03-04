//Cole Tomlinson
//Lab 6
//Twist Generator Java Program

//import scanner utilitly
import java.util.Scanner;

//defining class
public class TwistGenerator{
    
//add main method
    public static void main(String[] args){


//declare scanner instance
Scanner twistInput=new Scanner(System.in);

//prompt user for twist length
System.out.println("Enter a positive integer for twist length");
//store twist length
int twistLength=twistInput.nextInt();
//create a counter to keep track of slash repeats
int slashCounter=0;
//counter to keep track of X repeats
int xCounter=1;
//counter to keep track of second line of slash repeats
int slashTwo=0;

//loop to generate top line of slash pattern only how much it is supposed to with regard to input
while(slashCounter<twistLength){
    System.out.print("\\ ");
    slashCounter+=2; //this print takes up 2 spots of the pattern
    if(slashCounter>=twistLength){  //check again that the pattern isn't going too long
        break;
    }
    System.out.print("/"); 
    slashCounter++;  //this print only takes up 1 spot in the pattern
}

//Switches to next line to begin x pattern
System.out.println("");

//loop to generate midle X line of the pattern
while(xCounter<twistLength){ 
    System.out.print(" X ");
    xCounter+=3; //for each X displayed 3 spots in the pattern are used
}

//X pattern is finished so this switches to the bottom line
System.out.println("");

//loop to generate bottom line of slashes in the pattern
while(slashTwo<twistLength){
    System.out.print("/ ");  
    slashTwo+=2;  //each of these displayed takes up 2 spots in the pattern
    if(slashTwo>=twistLength){  //checking again that the pattern isn't being made too long
        break;
    }
    System.out.print("\\");
    slashTwo++;  //each of these displayed takes up only 1 spot in the pattern
}
System.out.println(""); //moves down to next line at program end
    }
}