//Cole Tomlinson
//lab 11
//search arrays java program 

import java.util.Random;            //import random

import java.util.Scanner;           //import scanner

public class RaggedArray{                                               //construct class
    public static void main(String[] args){                             //main method
        
Scanner scan = new Scanner(System.in);                                      //construct scanner and random

Random ran = new Random();

System.out.println("Please enter the size of the main array");                  //prompt and accept ragged array size
int size = scan.nextInt();

int[][] ragged;                                                             //initialize and allocate multidimensional ragged array
ragged = new int[size][];

int rand=0;                                                                 //integer for random number storage

for(int x=0;x<size;x++){
    rand=ran.nextInt(size);                                                 //Populate ragged array with sub arrays of random length
    ragged[x]=new int[rand+1];
}


for(int y=0;y<size;y++){                                                //populate sub arrays with random integers
    for(int z=0;z<ragged[y].length;z++){
        rand=ran.nextInt(20)+1;
        ragged[y][z]=rand;
    }
}

System.out.println("Here is your unsorted array:");                                 //display the user's array in its ragged, unsorted state
for(int a=0;a<size;a++){
    for(int b=0;b<ragged[a].length;b++){
        System.out.print(ragged[a][b]+", ");
    }
    System.out.println();
}

int temp=0;                                                                 //integer for temporary value storage
//insertion sort
for(int c=0;c<size;c++){                                                        
    for(int d=1;d<ragged[c].length;d++){
        while(ragged[c][d]<ragged[c][d-1]){
            temp=ragged[c][d];                                              //sort values within each subarray by insertion sorting
            ragged[c][d]=ragged[c][d-1];                                    //replace lower value on right with higher value on left
            ragged[c][d-1]=temp;                                            //make left array index equal to the temporarily stored lower value
            d--;                                                            //lower the current index to check again
            if(d==0){
                break;                                                      //break the loop if lowest index is reached
            }
        }
    }
}

System.out.println("Here is your sorted array:");
for(int e=0;e<size;e++){                                                    //display the modified array sorted in ascending integer value, but still ragged
    for(int f=0;f<ragged[e].length;f++){
        System.out.print(ragged[e][f]+", ");
    }
    System.out.println();
}


int[] temparray;                                                            //array for temporary value storage
for(int g=1;g<size;g++){
    while(ragged[g].length<ragged[g-1].length){
        temparray=new int[ragged[g-1].length];                              //same concept as insertion sort before but this time using arrays of varying length
        temparray=ragged[g-1];
        ragged[g-1]=ragged[g];
        ragged[g]=temparray;
        g--;
        if(g==0){
            break;
        }
    }
}

System.out.println("Here is your sorted array:");                               //print out array that is now sorted by array length and integer value
for(int h=0;h<size;h++){
    for(int i=0;i<ragged[h].length;i++){
        System.out.print(ragged[h][i]+", ");
    }
    System.out.println();
}


int found=0;                                                                        //integer to signify success of search in order to stop the search when necessary
System.out.println("What number would you like to search for?");
int searchnum=scan.nextInt();                                                       //prompt for and accept user search value
for(int k=0;k<size;k++){
    for(int l=0;l<ragged[k].length;l++){
        if(ragged[k][l]==searchnum){                                                            //conduct search for each index within the multidimensional array
            System.out.println("Your number was found on column "+(l+1)+" row "+(k+1));             //if found output where this happened
            found=1;                                                                            //cease the search if the value has been found
            break;
        }
    }
    if(k==size-1){                                                                          //if the end of the array is reached then say the value is not contained within the array
        System.out.println("Not in the array.");
    }
    if(found==1){                                                                           //break out of the entirety of the search if it is successful
        break;
    }
    
}
    }   
}