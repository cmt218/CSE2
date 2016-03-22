//Cole Tomlinson
//Homework 7
//Triangles java program

//import scanner
import java.util.Scanner;

//define class
public class Triangles{
//add main method   
    public static void main(String[] args){
        
        
//declare scanner instance
Scanner triInput= new Scanner(System.in);
//variable for triangle value
int triangle;

//prompt user for triangle length and error check
System.out.println("Enter an integer between 5 and 30");
triangle = triInput.nextInt();
while(triangle<5 || triangle>30){
    System.out.println("Your interger must be between 5 and 30 try again");
    triangle = triInput.nextInt();
}

//For Loop 
System.out.println("FOR LOOP:");
for(int i=1;i<=triangle;i++){               //start variable i at 1 and allow it to continue until it is equal to the input value
    for(int j=0;j<i;j++){                   //start nested loop with variable j starting at 1 and continuing until it is equal to i 
        System.out.print(i);                //print the current value of i which will run i amount of times
    }
    System.out.println();                   //start a new line 
if(i==triangle){                            //start running the decreasing loop when the counter reaches triangle input
for(int k=triangle-1;k>0;k--){              //keep track of decreasing value from one less than triangle input
    for(int l=k;l>0;l--){                   //loop outputting the value that amount of times in a line
        System.out.print(k);
    }
    System.out.println();                   //start a new line after each line is completed
}
}
}
System.out.println();                       //line to allow space between for loop and while loop

//While loop
System.out.println("WHILE LOOP");
int counter1=1;                             //counters to control each individual while loop
int counter2=0;
int counter3=triangle-1;
int counter4=triangle-1;

while(counter1<=triangle){                  //first loop incrementing until it reaches triangle input
    counter2=0;                             //make sure the loop resets to zero with each completion
    while(counter2<counter1){               //second loop incrementing until it reaches the value of the outer loop
        System.out.print(counter1);         //display the current value of the variable that amount of times
        counter2++;
    }
    System.out.println();                   //start a new line for each value change
    counter1++;
}
while(counter3>0){                          //loop that decrements from the input value 
    counter4=counter3;                      //reset inner loop counter with each completion
    while(counter4>0){                      //inner loop decrements and displays the current value that amount of times
        System.out.print(counter3);
        counter4--;
    }
    System.out.println();                   //start a new line after each completion
    counter3--;
}
System.out.println();                       //make apace between the while and do while loops 

//Do-While loop
System.out.println("DO-WHILE LOOP");
int counter5=1;                             //conters for each individual do while loop
int counter6=1;
int counter7=triangle-1;
int counter8=triangle-1;

do{
    counter6=0;                             //reset this counter to zero each time it is completed
    do{
        System.out.print(counter5);         //output the current value of the counter that value amount of times incrementing up each time
        counter6++;
    }
    while(counter6<counter5);               //makes the loop run the current value amount of times
    System.out.println();                   //start a new line upon line completion
    counter5++;                             //increment the counter each time the loop is run
}
while(counter5<=triangle);                  //keep the loops running until it reaches the input value

do{
    counter8=counter7;                      //reset the value of the inner loop counter to the value of the outer loop counter each cycle
    do{
        System.out.print(counter7);         //prints the current value of the counter that number of times
        counter8--;
    }
    while(counter8>0);                      //run the loop until it decrements to zero
    System.out.println();                   //start a new line after each line is completed
    counter7--;                             //decrement by one with each completion
}
while(counter7>0);                          //keep the loop running until it reaches zero
    }
}