//Cole Tomlinson
//lab 11
//search arrays java program 

import java.util.Random;            //import random

import java.util.Scanner;           //import scanner

public class Search{        //declare class

public static void main(String[] args){     //declare main method
    
Scanner scan = new Scanner(System.in);      //construct scanner

Random ran = new Random();      //construct random

int max1 = 0;                   //integers for max and min storage of first array

int min1 = 100;

int[] array1;                   //allocate space for 2 integer arrays of size 50
array1 = new int[50];

int[] array2;
array2 = new int[50];

for(int i=0;i<50;i++){                      //populate the array with random numbers from 0 to 100
    array1[i]=ran.nextInt(100);
}

for(int x=0;x<50;x++){                      //linearly search for the max and min within the aray
    if(array1[x] > max1){
        max1 = array1[x];
    }
    if(array1[x] < min1){
        min1 = array1[x];
    }
}

System.out.println("The maximum of array1 is: "+max1);                  //display the found maximum and minimum of array1
System.out.println("The minimum of array2 is: "+min1);

int rand = ran.nextInt(100);                        //create a random number between 0 and 100
int max2 = 0;
int min2 = 100;                                     //integers for max and min value storage

array2[0]=rand;                                 //assign first array value between 0 and 100

for(int y=1;y<50;y++){                          //populate array with increasing random numbers
    rand=ran.nextInt(100);
    array2[y]=array2[y-1]+rand;
}

for(int z=0;z<50;z++){                      //linearly search for the maximum and minimum within the array
    if(array2[z]>max2){
        max2=array2[z];
    }
    if(array2[z]<min2){
        min2=array2[z];
    }
}

System.out.println("The maximum of array2 is: "+max2);              //display the found maximum and minimum of the array
System.out.println("The minimum of array2 is: "+min2);

int userIn;
System.out.println("Enter a number greater than or equal to zero");         //create integer called userin and ask for a in int greater than or equal to zero
userIn = scan.nextInt();

while(userIn<0){                                                    //error check for value of user input
    System.out.println("Your value was less than zero try again");
    userIn=scan.nextInt();
}

if(array2[25] > userIn){                                        //decide with binary search which half of the array to search
    for(int a=0;a<25;a++){                                          //go through each element of the first half
         if(array2[a]==userIn){
             System.out.println("Your number was found!");              //seach for actual value
             break;
         }   
         else if(array2[a]>userIn){                                         //halt loop if a value greater than input is found
             System.out.println(userIn+" was not found in list");
             System.out.println("The number above the key was "+array2[a]);
             System.out.println("The number below the key was "+array2[a-1]);
             break;
         }
    }
}
else if(array2[25] < userIn){
        for(int b=25;b<50;b++){                                                 //binary seach for second half of loop if the  user input is high enough
            if(array2[b]==userIn){
                System.out.println("Your number was found!");
                break;                                                              //seach for the actual value
            }
            else if(array2[b]>userIn){                                                          //halt the loop if a value higher than input was found
                System.out.println(userIn+" was not found in the list");
                System.out.println("The number above the key was "+array2[b]);
                System.out.println("The number below the key was "+array2[b-1]);
                break;
            }
        }
}

}
}    
