//Cole Tomlinson
//Homework 11
//removing elements java program

import java.util.Scanner;                                               //import scanner utility
import java.util.Random;                                                //import random utility
public class RemoveElements{                                            //start class
    
//print out the array  
public static String listArray(int num[]){                              //accepts array as input and returns string
	String out="{";
	for(int j=0;j<num.length;j++){                                      //add members of array to the string so that array is displayed in a coherent manner
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;                                                         //return the generated string
  }


//generate random ints to populate the array
public static int[] randomInput(){                                      //returns an array with no input
    Random ran  = new Random();                                         //construct random
    int[] array;                                                        //create a new array with size 10
    array = new int[10];
    for(int x=0;x<10;x++){                                              //iterate through loop 10 times assigning a 0-9 random int to each position
        array[x] = ran.nextInt(10);
    }
    return array;                                                       //return generated array 
}

//delete element at given index
public static int[] delete(int[] list,int x){                           //returns an array with an array and number input
    int[] deleted;                                                      //create a new array with length 9 to account for the deleted index
    deleted = new int[9];
    if(x>=0 && x<10){                                                   //copy the array until arriving at the index you want deleted
        for(int y=0;y<x;y++){
            deleted[y] = list[y];
        }
        for(int z=x;z<9;z++){                                           //skip to one position ahead of the deleted index and continue copying
            deleted[z] = list[z+1];
        }
        }
    else{                                                               //if the index was not within bounds this message would be displayed
        System.out.println("Index out of bounds");
}
return deleted;                                                         //return the modified array
}



//remove elements of given value
public static int[] remove(int[] list,int x){                           //return array with array and integer inputs
    int counter = 0;                                                    //declare a couple of counter variables
    int counter2 = 0;
    for(int e=0;e<10;e++){                                              //check how many times the value you don't want is in the loop
        if(list[e] == x){
            counter++;
        }
    }
    int[] removed;                                                      //create a new array that has enough space for original values minus the ones that will be removed
    removed = new int[10-counter];
    for(int f=0;f<10;f++){                                              //assign value to a spot in the new array if it is not the one that should be removed
        if(list[f] != x){
            removed[counter2] = list[f];
            counter2++;
        }
    }
    return removed;                                                     //return the modified array
}


    
public static void main(String [] args){                                //start main method
      
Scanner scan=new Scanner(System.in);                                    //construct scanner

int num[]=new int[10];                                                  //the remaining code was supplied to us
int newArray1[];
int newArray2[];
int index,target;
String answer="";


do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
    System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}
	while(answer.equals("Y") || answer.equals("y"));
}
 

}