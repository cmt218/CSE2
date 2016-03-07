//Cole Tomlinson
//Homework 6
//Text spinner java program

//define class
public class TextSpinner{
    
//add main method
    public static void main(String[] args){
        
        
//infinite loop condition
int number=1;
while(number>0){
    //loop animation sequence with backspace after each character
    System.out.print("/");
    System.out.print("\b");
    System.out.print("-");
    System.out.print("\b");
    System.out.print("\\");
    System.out.print("\b");
    System.out.print("|");
    System.out.print("\b");
}
    }
}