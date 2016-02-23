//Cole Tomlinson
//2-21-16
//CSE 002 Homework 04
//Hexidecimal Conversion Java Program

//Convert RGB inputs to hexidecimal form

//import scanner utility to accept RGB input
import java.util.Scanner;

//define class
public class ToHex{
    
//main method
    public static void main(String[] args){
        
//declare scanner
Scanner colorInput=new Scanner(System.in);
//strings for hexidecimal storage
String hexVal="";
//the following hex values are assigned 0 initially because the first digit will be zero if the input is less than 16
String redHex="0";
String greenHex="0";
String blueHex="0";
char redChar=' ';
char greenChar=' ';
char blueChar=' ';
//prompt user for input of 3 RGB values
System.out.println("Please enter three numbers representing RGB values: ");
//store red value with boundary check
int redVal=colorInput.nextInt();
if(redVal < 0 || redVal > 255){
    System.out.println("Sorry, you must enter values between 0-255");
}
//store green value with boundary check
int greenVal=colorInput.nextInt();
if(greenVal < 0 || greenVal > 255){
    System.out.println("Sorry, you must enter values between 0-255");
}
//store blue value with boundary check
int blueVal=colorInput.nextInt();
if(blueVal < 0 || blueVal > 255){
    System.out.println("Sorry, you must enter values between 0-255");
}
//conversion of red value to hexidecimal
//handles cases where red is less than 10
if(redVal < 10){
    redHex=redHex+String.valueOf(redVal);
}
//handles cases where red is between 9 and 16
else if(redVal > 9 && redVal < 16){
    switch(redVal){
        case 10:
            redChar='A';
            break;
        case 11:
            redChar='B';
            break;
        case 12:
            redChar='C';
            break;
        case 13:
            redChar='D';
            break;
        case 14:
            redChar='E';
            break;
        case 15:
            redChar='F';
            break;
    }
//adds the character to string redHex
    redHex=redHex+redChar;
}
//handles first hexidecimal digit for cases where red value is more than 16
else if(redVal > 16){
    switch(redVal/16){
        case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:
            redHex=String.valueOf(redVal/16);
            break;
        case 10:
            redHex="A";
            break;
        case 11:
            redHex="B";
            break;
        case 12:
            redHex="C";
            break;
        case 13:
            redHex="D";
            break;
        case 14:
            redHex="E";
            break;
        case 15:
            redHex="F";
            break;
    }
//handles second hexidecimal digit for cases where red value is more than 16 using modulus
    switch(redVal%16){
        case 0:case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:
            redHex=redHex+String.valueOf(redVal%16);
            break;
        case 10:
            redHex=redHex+"A";
            break;
        case 11:
            redHex=redHex+"B";
            break;
        case 12:
            redHex=redHex+"C";
            break;
        case 13:
            redHex=redHex+"D";
            break;
        case 14:
            redHex=redHex+"E";
            break;
        case 15:
            redHex=redHex+"F";
            break;
    }
}
//conversion of green value to hexidecimal
//handles cases where green is less than 10
if(greenVal < 10){
    greenHex=greenHex+String.valueOf(greenVal);
}
//handles cases were green is between 9 and 16
else if(greenVal > 9 && greenVal < 16){
    switch(greenVal){
        case 10:
            greenChar='A';
            break;
        case 11:
            greenChar='B';
            break;
        case 12:
            greenChar='C';
            break;
        case 13:
            greenChar='D';
            break;
        case 14:
            greenChar='E';
            break;
        case 15:
            greenChar='F';
            break;
    }
//adds character to string greenHex
    greenHex=greenHex+greenChar;
}
//handles the first hexidecimal digit for cases where green is more than 16
else if(greenVal > 16){
    switch(greenVal/16){
        case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:
            greenHex=String.valueOf(greenVal/16);
            break;
        case 10:
            greenHex="A";
            break;
        case 11:
            greenHex="B";
            break;
        case 12:
            greenHex="C";
            break;
        case 13:
            greenHex="D";
            break;
        case 14:
            greenHex="E";
            break;
        case 15:
            greenHex="F";
            break;
    }
//handles the second hexidecimal digit for cases where green is more than 16 using modulus
    switch(greenVal%16){
        case 0:case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:
            greenHex=greenHex+String.valueOf(greenVal%16);
            break;
        case 10:
            greenHex=greenHex+"A";
            break;
        case 11:
            greenHex=greenHex+"B";
            break;
        case 12:
            greenHex=greenHex+"C";
            break;
        case 13:
            greenHex=greenHex+"D";
            break;
        case 14:
            greenHex=greenHex+"E";
            break;
        case 15:
            greenHex=greenHex+"F";
            break;
    }
}

//handles conversion of blue input to hexidecimal
//deals with cases where blue is less than 10
if(blueVal < 10){
    blueHex=blueHex+String.valueOf(blueVal);
}
//handles cases where blue is between 9 and 16
else if(blueVal > 9 && blueVal < 16){
    switch(blueVal){
        case 10:
            blueChar='A';
            break;
        case 11:
            blueChar='B';
            break;
        case 12:
            blueChar='C';
            break;
        case 13:
            blueChar='D';
            break;
        case 14:
            blueChar='E';
            break;
        case 15:
            blueChar='F';
            break;
    }
//adds the second character to the string blueHex
    blueHex=blueHex+blueChar;
}
//handles the first hexidecimal digit for cases where blue is more than 16
else if(blueVal > 16){
    switch(blueVal/16){
        case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:
            blueHex=String.valueOf(blueVal/16);
            break;
        case 10:
            blueHex="A";
            break;
        case 11:
            blueHex="B";
            break;
        case 12:
            blueHex="C";
            break;
        case 13:
            blueHex="D";
            break;
        case 14:
            blueHex="E";
            break;
        case 15:
            blueHex="F";
            break;
    }
//handles the second hexidecimal digit for cases where blue is greater than 16 using modulus
    switch(blueVal%16){
        case 0:case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:
            blueHex=blueHex+String.valueOf(blueVal%16);
            break;
        case 10:
            blueHex=blueHex+"A";
            break;
        case 11:
            blueHex=blueHex+"B";
            break;
        case 12:
            blueHex=blueHex+"C";
            break;
        case 13:
            blueHex=blueHex+"D";
            break;
        case 14:
            blueHex=blueHex+"E";
            break;
        case 15:
            blueHex=blueHex+"F";
            break;
    }
}
//adding the red, green,and blue hexidecimal values together in a string called hexVal
hexVal=redHex+greenHex+blueHex;
//output the final converted hexidecimal RGB value 
System.out.println("The decimal numbers R:"+redVal+", G:"+greenVal+", B:"+blueVal+", is represented in hexidecimal as: "+hexVal);
    }
}