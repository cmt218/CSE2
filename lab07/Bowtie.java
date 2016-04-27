//Cole Tomlinson
//Lab 07
//Bowtie java lab program



//import scanner utility
import java.util.Scanner;


//define class
public class Bowtie{
    


//add main method
public static void main(String[] args){
        
//create scanner instance
Scanner starInput = new Scanner(System.in);
        
//variabls for use in loops   
int nStars=0;
int counter = 0;
int buildup = 0;
int spacecounter = 0;
String userin="y";


System.out.println("Enter an odd integer between 3 and 33");            //prompt user for the size of the loop
nStars = starInput.nextInt();                                           //store input
while(nStars < 3 || nStars > 33 || nStars%2==0){                        //error check for being odd and within bounds
    System.out.println("Invalid input try again");
    nStars = starInput.nextInt();                                       //let them try again if they need
    
}

int original = nStars;                                                  //keep the original input stored in a variable original


while(userin.equals("y")||userin.equals("Y")){                          //loop to allow the program to run again if desired


/*
while(counter<nStars && nStars<=original){                              //print out lines of stars for the first half of the bowtie
    System.out.print("*");
    counter++;                                                      
    while(counter==nStars){                                             //Start a new line if the counter hits the current value of nstars
        if(nStars>2 && buildup==0){
            System.out.println();                                       //reset counter and decrement nstars by 2 for next line
            counter=0;
            nStars-=2;  
            while(counter<(original-nStars)/2){                         //insert an appropriate amount of spaces on the next line
                System.out.print(" ");
                counter++;
            }
            counter=0;                                                  //reset counter
        }
        if(buildup==1){                                                 //if statement dealing with second half of bowtie case
            System.out.println();
            counter=0;                                                  //reset counter and increment number of stars
            nStars+=2;
            while(counter<(original-nStars)/2){                         //loop inserting appropriate amount of spaces
                System.out.print(" ");
                counter++;
            }
            counter=0;                                                  //reset the counter
        }
        if(nStars==1){                                                  //catch bowtie at the middle and change variable so different if statement is triggered
            buildup=1;
        }
    }
}



//Using For Loop

for(int x=0;x<nStars+1;x++){                                            //using a for loop to print out stars in a line
    if(x==nStars){                                                      //catch the end of the line and start a new one, then space an appropriate amount of times
        System.out.println();
        spacecounter++;
        for(int b=0;b<((original-nStars)/2)+1;b++){
            System.out.print(" ");
        }
        x=0;                                                            //reset counter and decrement stars
        nStars-=2;
    }
    System.out.print("*");                                              //print statement for stars
    if(nStars==1){                                                      //catch bowtie at midpoint when it needs to start incrementing again
        for(int y=3;y<=original;y+=2){
            System.out.println();                                       //begin incrementing with each line with spacecounter keeping track of lines
            spacecounter++;
            for(int a=0;a<(original-y)/2;a++){                          //insert an appropriate amount of spaces at the beginning of each line
                System.out.print(" ");
            }
            for(int z=0;z<y;z++){                                       //print statement for stars
                System.out.print("*");
            }
        }
    }
    if(spacecounter>=original-1){                                       //if there are too many lines break the loop
        break;
    }
}
*/


//using do while loop
do{
    
do{
    System.out.print("*");                                              //print statement for the stars with counter variable
    counter++;
}while(counter<nStars);                                                 //keep the loop going until an appropriate number of stars has printed

if(nStars==1){                                                          //catch loop at midpoint and change variable to trigger a different if statement
    buildup=1;
}

if(counter==nStars && buildup==0){                                      //case where loop is decrementing
    System.out.println();
    counter=0;
    nStars-=2;
}

if(counter==nStars && buildup==1){                                      //case where loop is incrementing
    System.out.println();
    counter=0;
    nStars+=2;
}

if(nStars != original){                                                 //insert the correct amount of spaces at a new line
do{
    System.out.print(" ");
    counter++;
}while(counter<(original-nStars)/2);
}

counter=0;                                                              //reset the counter

}while(nStars<=original);                                               //condition keeping the outer loop running




System.out.println();
System.out.println("Press y to continue or anything else to leave the loop");   //challenge the user to run the loop again with input
userin=starInput.next();

nStars=original;                                                        //if the bowtie is going to be generated again reset the counter and if statement trigger as well as returning nstars to its original value
buildup=0;
spacecounter=0;
counter=0;
}
}
}