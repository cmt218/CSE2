


import java.util.Random;

import java.util.Scanner;

public class practice{
    
    public static void printList(int[] Array){
        for(int x=0;x<Array.length;x++){
            System.out.println(Array[x]);
        }
    }
    
    public static void changeList(int[] Array){
        Random ran = new Random();
        for(int y=0;y<Array.length;y++){
            Array[y]=ran.nextInt(10);
        }
    }
    
    public static void main(String[] args){
    
int one = 2;
char letter = (char)(one + 'a');
int two = Character.getNumericValue(letter);

System.out.println(two);
    
   

}
}