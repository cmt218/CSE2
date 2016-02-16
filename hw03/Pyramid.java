//Cole Tomlinson
//2-15-16
//CSE 002 Homework 3
//Pyramid Java Program

//Program for giving the volume of a pyramid 

//import scanner utility to accept inputs
import java.util.Scanner;

//define the class

public class Pyramid{
    
//main method
    public static void main(String[] args) {
        
//declaring scanner 
Scanner pyramidInput=new Scanner(System.in);

//variable for volume storage
double pyramidVolume;

//prompt for square base length
System.out.print("The square side of the pyramid is (input length): ");
//store square base length
double squareBase=pyramidInput.nextDouble();
//prompt for height
System.out.print("The height of the pyramid is (input length): ");
//store the height
double pyramidHeight=pyramidInput.nextDouble();
//conversion of dimensions to volume
pyramidVolume=squareBase*squareBase*pyramidHeight;
//further conversion of dimensions to volume
pyramidVolume=pyramidVolume/3;
//output volume 
System.out.println("The volume inside the pyramid is: "+pyramidVolume);

    }
}