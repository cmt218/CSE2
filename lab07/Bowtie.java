//Cole Tomlinson
//Lab 07
//Bowtie java lab program

//define class
public class Bowtie{
    
//add main method
    public static void main(String[] args){
        
//variable for number of stars storage     
int nStars=9;
//counter variables for while loop
int counter=0;


//loop for bowtie creation
while(counter<nStars){
    System.out.print("*");
    counter++;
    if(counter==nStars){
        nStars-=2;
        counter=0;
        System.out.println("");
        while(counter<((9-nStars)/2)){
            System.out.print(" ");
            counter++;
        }
        counter=0;
    }
   
}


    }
}