//Cole Tomlinson
//2-18-16
//CSE 002 Lab 04
//Card Generator Java Program

//Practice magic skills with a random card generating program

//import random number generator

import java.util.Random;
//define class
public class CardGenerator{
//main method
public static void main(String[] args){
//generate a random number from 1-52
int card=(int)(Math.random()*51)+1;
//variable for suit storage
String suit="";
//variable for card identity storage
String identity="";

//begin if statement for suit assignment
if(card <= 13){
    suit = "diamonds";
//switch statement inside the if statement to determine card number or royal
    switch(card){
        case 1:
            identity="ace";
            break;
        case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
            identity=String.valueOf(card);
            break;
        case 11:
            identity="jack";
            break;
        case 12:
            identity="queen";
            break;
        case 13:
            identity="king";
            break;
    }
}
//second case for suit assignment
else if(card > 13 && card <= 26){
    suit="clubs";
//switch statement to determine card number using modulus division
    switch(card%13){
        case 1:
            identity="ace";
            break;
        case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
            identity=String.valueOf(card%13);
            break;
        case 11:
            identity="jack";
            break;
        case 12:
            identity="queen";
            break;
        case 0: //zero is used here because a modulus of zero would be the highest possibility in this case
            identity="king";
            break;
    }
}
//third case for suit assignment
else if(card > 26 && card <= 39){
    suit="hearts";
//switch statement to determine card number using modulus division
    switch(card%13){
        case 1:
            identity="ace";
            break;
        case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
            identity=String.valueOf(card%13);
            break;
        case 11:
            identity="jack";
            break;
        case 12:
            identity="queen";
            break;
        case 0: //zero is used here because a modulus of zero would be the highest possibility in this case
            identity="king";
            break;
        }
}
//fourth case for suit assignment
else if(card > 39){
    suit="spades";
//switch statement to determine card number using modulus division
    switch(card%13){
        case 1:
            identity="ace";
            break;
        case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
            identity=String.valueOf(card%13);
            break;
        case 11:
            identity="jack";
            break;
        case 12:
            identity="queen";
            break;
        case 0: //zero is used here because a modulus of zero would be the highest possibility in this case
            identity="king";
            break;
        }
}
//output result of random card generation 
System.out.println("Your card is the "+identity+" of "+suit);

}
}

