//Cole Tomlinson
//Homework 11
//linear seach java program

import java.util.Random;

import java.util.Scanner;

public class CSE2Linear{
    
//type check methods
public static void Check(int in){                                                                   //several overloaded methods accepting different types to see what kind the input is
                                                                                                    //do nothing if the type is int 
}
public static void Check(double in){                                                                //display that input is incorrect for the input typed double, float, or string
    System.out.println("Input of wrong type please try again");
}
public static void Check(float in){
    System.out.println("Input of wrong type please try again");
}
public static void Check(String in){
    System.out.println("Input of wrong type please try again");
}


//print list method
public static void Print(int[] list){                                                               //accept an int array as an input
    for(int j=0;j<list.length;j++){                                                                 //cycle for the length of the input array
        System.out.print(list[j] +" ");                                                             //print the int in the current index
    }
}


//linear search method
public static void Search(int[] list,int search){                                                   //accept inputs for an int array as well as a value to search for
    for(int k=0;k<list.length;k++){                                                                 //run this loop for as many elements exist in the array
        if(list[k]==search){                                                                        //check if value of current index matches searched for value
            System.out.println("The grade you entered was found in "+(k+1)+" iterations");          //if value is found say so and how many iterations it took
            break;
        }
        if(k==(list.length-1)){                                                                     //display message if search value was not found
            System.out.println("Sorry the grade you entered was not found");
        }
    }
}


//scrambling array method
public static void Scramble(int[] list){
Random rand = new Random();                                                                         //construct random utility
int ind = 0;                                                                                        //declare ints for value storage during scrambling
int dum = 0;
for(int b=0;b<15;b++){                                                                              //run the loop 15 times
    ind = rand.nextInt(15);                                                                         //generate a random number within the array index
    dum = list[ind];                                                                                //copy value of int at that index
    list[ind] = list[b];                                                                            //set that index equal to the value of the current index
    list[b] = dum;                                                                                  //put the previous value in the current index effectively switching them
}
}

//main method
public static void main(String[] args){
        
//construct scanner
Scanner scan = new Scanner(System.in);

//declare and allocate array of ints
int[] grades;
grades = new int[15]; 

//prompt user for and accept 15 grades with type check, range check, and consecutive value check
System.out.println("Enter 15 ints corresponding to CSE2 final grades");                         
for(int i=0;i<15;i++){                                                                              //run a for loop 15 times accepting int inputs
    grades[i] = scan.nextInt();
    Check(grades[i]);
    while(grades[i]>100 || grades[i]<0){                                                            //check if the inputs are within grade boundaries and accept new input if it is out
        System.out.println("input out of bounds please try again");
        grades[i] = scan.nextInt();
    }
    if(i>0){                                                                                        //check that the input is greater than the last for all but the first input
    while(grades[i]<grades[i-1]){
        System.out.println("input not greater than or equal to last input please try again");
        grades[i] = scan.nextInt();
    }
    }
}


//Prints array
Print(grades);


//prompt user for a grade to be searched for and conduct search
System.out.println("Enter a grade to be searched for in the list");
int choice = scan.nextInt();
Search(grades,choice);


//display scrambled array
System.out.println("Scrambled: ");
Scramble(grades);
Print(grades);

//prompt user for a new grade to be searched for and conduct search
System.out.println("Enter a grade to be searched for in the scrambled list");
choice = scan.nextInt();
Search(grades,choice);


    }
    
}