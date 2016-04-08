//Cole Tomlinson
//lab 10
//array java program

import java.util.Random;                                                        //import random number generation utility

import java.util.Scanner;                                                       //import user input utility

public class Arrays{                                                            //create class
    
public static void main(String[] args){                                         //main method
        
Scanner scan = new Scanner(System.in);                                          //construct new scanner
Random ran = new Random();                                                      //contruct new random number generator

int random = ran.nextInt(5)+5;                                                  //generate integer between 5 and 10

String[] students;                                                              //start new array storing strings
students = new String[random];                                                  //array is as large as the random number

int[] midterm;                                                                  //start an array storing ints
midterm = new int[random];                                                      //array is also as large as the random number

System.out.println("Enter "+random+" student names");                           //prompt user for that many names

for(int i=0;i<random;i++){                                                      //for loop cycling for random number amount of cycles asking for name input
    students[i]=scan.nextLine();                                                //assigning names to spots in the array
}

for(int x=0;x<random;x++){                                                      //for loop creating exam scores to populate midterm array
    midterm[x]=ran.nextInt(100);                                                //assign each spot in the array an exam grade
}
    
System.out.println("Here are the midterm grades of the 5 students above:");     //says what is about to be displayed
for(int j=0;j<random;j++){                                                      //loop cycles for the length of the student name and midterm arrays 
    System.out.println(students[j]+" : "+midterm[j]);                           //display the name of each student as well as their exam grade
}
    }
}