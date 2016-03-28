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
        
//variable for number of stars storage     
int nStars=9;

//counter variables for while loop
int counter=0;      //star management
int counter2=0;     //space management
int counter3=0;     //line management
int counter4=0;


//loop for bowtie creation
while(counter<nStars){
    
    if(nStars>9){
        break;
    }
    
    while(counter3<counter4){
            System.out.print(" ");
            counter3++;
        }
   
    System.out.print("*");
    counter++;
    
    if(counter==nStars && counter2<4){
        System.out.println();
        counter=0;
        counter2++;
        counter3=0;
        counter4++;
        nStars-=2;
    }

    if(counter==nStars && counter2>=4){
        System.out.println();
        counter=0;
        counter2++;
        counter3=0;
        counter4--;
        nStars+=2;
    }

}


    }
}