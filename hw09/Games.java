//Cole Tomlinson
//Homework 9
//Java games

//import scanner
import java.util.Scanner;
//import random
import java.util.Random;

//define class
public class Games{
    

static Random rand=new Random();                                                                                //for random number generation within methods

//guess the box game
public static void guessTheBox(int choice, int prizebox){                                                       //accept inputs for user's selected box and computer selected box
    if(choice==prizebox){                                                                                       //user wins if values are equal
        System.out.println("Congratulations! You have won a hundred bucks");
    }
    else{                                                                                                       //user does not win if values are not equal
        System.out.println("Sorry you are not a winner");
    }
}

//spin the wheel game
public static void spinTheWheel(int playerNum, int playerColor, int wheelNum, int wheelColor){                  //accept inputs for user number and color as well as wheel color and number
    if(playerNum == wheelNum && playerColor == wheelColor){                                                     //player wins if values match up
        System.out.println("Congratulations you have won!");
    }
    else{                                                                                                       //player does not win in other cases
        System.out.println("Sorry you did not win");
    }
    
}

//word scramble game
public static void scrambler(String playerWord){                                                                //accept players word as input
    int length=playerWord.length();                                                                             //store length of players word
    int length2=0;                                                                                              //modifyable version of length for use later
    int randNum;                                                                                                //variable for random number
    char letter;                                                                                                //variable for character storage
    String newWord="";                                                                                          //blank string for scrambled word construction
    
    for(int i=0;i<length;i++){                                                                                  //for loop running for as many characters as the input word
        length2=playerWord.length();                                                                            //make this length variable equal to current length of modified input
        randNum=rand.nextInt(length2);                                                                          //make random number in the range of current length of input
        letter=playerWord.charAt(randNum);                                                                      //select character corresponding to random int
        playerWord=playerWord.substring(0,randNum)+playerWord.substring(randNum+1);                             //reconstruct input word removing the selected letter   
        newWord=newWord+letter;                                                                                 //add the selected random character to the scrambled string
    }
    
    System.out.println("Your scrambled word is: "+newWord);                                                     //display scrambled word once loop has completed
    
}
    
//add main method
    public static void main(String[] args){
        
//declare scanner instance
Scanner gameIn=new Scanner(System.in);
//declare random instance
Random gameRan=new Random();

System.out.println("Welcome to CSE 002 game center");                                                           //welcome

System.out.println("Enter 1 for guess the box, 2 for spin the wheel, or 3 for scrambler");                      //prompt user for input
int choice=gameIn.nextInt();

while(choice<1 || choice>3){                                                                                    //game selection error check
    System.out.println("We do not have that game sorry");
    break;
}

if(choice==1){                                                                                                  //when user chooses box guessing game
    System.out.println("Choose box 1 2 or 3");                                                                  //prompt user for choice
    int choice2=gameIn.nextInt();
    
    while(choice2<1 || choice2>3){                                                                              //choice error check
        System.out.println("Try again");
        choice2=gameIn.nextInt();
    }
    
    int prize=gameRan.nextInt(2)+1;                                                                             //random number for prize box 
    System.out.println("The box with the prize is: "+prize);                                                    //display prize box
    guessTheBox(choice2,prize);                                                                                 //run box game with prize box and user guess inputs
}

//if user selects wheel spin game
if(choice==2){
                                                                                                                
    int pColorNum;                                                                                              //variable for number corresponding to player color choice
    int wColorNum=gameRan.nextInt(1)+1;                                                                         //random number for wheel color choice
    int wNum=gameRan.nextInt(4)+1;                                                                              //random number for wheel number choice
    String pColor;                                                                                              //string for user color input
    
    System.out.println("Welcome to spin the wheel, input a color (red or black) and a number from 1-5");        //welcome
    System.out.println("Enter your color");                                                                     //prompt user for input
    pColor=gameIn.nextLine();                                                                                   //2 inputs because java doesn't like just one
    pColor=gameIn.nextLine();
        
    while(!pColor.equals("Red")&&!pColor.equals("red")&&!pColor.equals("Black")&&!pColor.equals("black")){      //error check to verify color validity
        System.out.println("Invalid color input please try again");
        pColor=gameIn.nextLine();                                                                               //give user another chance if they mess up
    }
    
    if(pColor.equals("Red")||pColor.equals("red")){                                                             //assign the user color a number for easier math
        pColorNum=1;
    }
    else{
        pColorNum=2;    
    }
    
    System.out.println("Enter your number");                                                                    //accept user number input
    int pNum=gameIn.nextInt();  
    while(pNum>5||pNum<1){                                                                                      //number input error check
        System.out.println("Invalid number input please try again");
        pNum=gameIn.nextInt();
    }
    
    if(wColorNum==1){                                                                                           //output what the wheel color and number were
        System.out.println("The wheel spun a red "+wNum);
    }
    else if(wColorNum==2){
        System.out.println("The wheel spun a black "+wNum);
    }
    
    spinTheWheel(pNum,pColorNum,wNum,wColorNum);                                                                //run wheel spin method with player and wheel selections
}

//if user selects word scramble
if(choice==3){
   
    String pWord;                                                   //variable for player word input
    
    System.out.println("Enter a single word to be scrambled");      //ask user for word
    pWord=gameIn.nextLine();                                        //java won't let the input run unless I have it twice
    pWord=gameIn.nextLine();
    scrambler(pWord);                                               //run scrambler method on the player's word

}
}
}