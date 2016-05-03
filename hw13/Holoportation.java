//Cole Tomlinson
//CSE 2 Homework 13
//Holoportation

import java.util.Random;
//imports random utility

import java.util.Scanner; 
//imports scanner utility


public class Holoportation{
//define the class

public static String[][][] soRandom(){
//method for 3d array generation
    Random ran = new Random();
//construct random
        
    String[][][] array = new String[ran.nextInt(10)+1][][];
//declare 3d array of random length 1-10
        
    for(int x=0;x<array.length;x++){
        array[x]=new String[ran.nextInt(10)+1][];
        for(int y=0;y<array[x].length;y++){
            array[x][y]=new String[ran.nextInt(10)+1];
        }
    }
//use nested for loop to populate the members of the 3d array with 3d arrays and the 2d arrays with 1d arrays
    return array; 
//return the 3d array
}

public static String coder(){
//method for assigning codes to each array member
    Random rand = new Random();
//construct random 
    String coded = "";
//empty string for generated code storage
    char one = (char)(rand.nextInt(26) + 'A');
    char two = (char)(rand.nextInt(26) + 'A');
//generate 2 random numbers for use in code assignment
    coded+=one;
    coded+=two;
//add the random letters to the string
    int uno = rand.nextInt(10);
    int dos = rand.nextInt(10);
    int tres = rand.nextInt(10);
    int quatro = rand.nextInt(10);
//generate 4 random digits for use in the code
    coded+=uno;
    coded+=dos;
    coded+=tres;
    coded+=quatro;
//add these random digits to the code
    return coded;
//return the generated code
}

public static void print(String[][][] in){
//method for printing the array and codes
    for(int d=0;d<in.length;d++){
        for(int e=0;e<in[d].length;e++){
            System.out.print("[");
//prints opening bracket to contain each 1 dimensional array
            for(int f=0;f<in[d][e].length;f++){
                if(f==in[d][e].length-1){
                    System.out.print(in[d][e][f]);
                    break;
                }
                System.out.print(in[d][e][f]+ ",");
//separate codes with commas and print them
            }
            System.out.print("]");
            if(e==in[d].length-1){
                break;
            }
            System.out.print("|");
//close and separate brackets of 1 dimensional arrays
        }
        if(d==in.length-1){
            break;
        }
        System.out.print("---");
//separate outermost dimension with dashes
    }
}
    
public static void holoport(String[][][] og, String[][][] holo){
//void method for copying array to another 3d array
    for(int g=0;g<holo.length;g++){
        for(int h=0;h<holo[g].length;h++){
            for(int i=0;i<holo[g][h].length;i++){
                if(g > og.length-1 || h > og[g].length-1 || i > og[g][h].length-1){
                    holo[g][h][i] = "$$$$$$";
                }
                else{
                    holo[g][h][i] = og[g][h][i];
                }
            }
//goes through and copies elements from one array to the other, truncating and substituting where necessary
        }
    }
}

public static void unique(String[][][] input){
 //make sure that no two codes within the array are the same
int counter=0;
//counter for reassignment storage
for(int a=0;a<input.length-1;a++){
    for(int b=0;b<input[a].length-1;b++){    
        for(int c=0;c<input[a][b].length-1;c++){
//Cycles through whole array selecting one member to be compared
            for(int x=a+1;x<input.length-2;x++){
                for(int y=b+1;y<input[x].length-2;y++){
                    for(int z=c+1;z<input[x][y].length-2;z++){
//cycles through the whole array following that value for comparison
                while(input[a][b][c].equals(input[x][y][z])){
                    input[a][b][c]=coder();
                    counter++;
                }
//generate a new code for a member with a duplicate code
            }
        }
    }
}
}
}  
System.out.println();
if(counter==0){
    System.out.println();
    System.out.println("No duplicates found");
}
else if(counter>0){
    System.out.println();
    System.out.println(counter+" Duplicates found, updated array:");
    print(input);
}
//display changes made from search
}

public static void sampling(String[][][] array,String code){

int found=0;
    
for(int a=0;a<array.length;a++){
    for(int b=0;b<array[a].length;b++){    
        for(int c=0;c<array[a][b].length;c++){
//Cycles through whole array selecting one member to be compared
        if(array[a][b][c].equals(code)){
            found=1;
            System.out.println("Code was found at ("+a+","+b+","+c+")");
            break;
        }
}
if(found==1){
    break;
}
}
if(found==1){
    break;
}
}
if(found == 0){
    System.out.println("Code not found");
}
}

public static void percentage(String[][][] original,String[][][] holoported){
//method for determining how effective the holoportation was
    double ogcount=0.0;
    double holocount=0.0;
//
for(int a=0;a<original.length;a++){
    for(int b=0;b<original[a].length;b++){
        for(int c=0;c<original[a][b].length;c++){
            ogcount+=1.0;
        }
    }
}
//count the number of members in the original array

for(int x=0;x<holoported.length;x++){
    for(int y=0;y<holoported[x].length;y++){
        for(int z=0;z<holoported[x][y].length;z++){
            holocount+=1.0;
        }
    }
}
//count the number of members in the holoported array

if(holocount<ogcount){
    System.out.println("Holoportation was -"+(((ogcount - holocount)/ogcount)*100)+"% effective");
}
if(holocount>ogcount){
    System.out.println("Holoportation was "+(((holocount-ogcount)/ogcount)*100)+"% effective");
}
//display how effective the holoportation was
}


public static void frankenstein(String[][][] array){
//method that orders elements in alphabetical then numeric order
    int a=0;
    String temp="";
//temporarily stores codes to be rearranged
    for(int x=0;x<array.length;x++){
        for(int y=0;y<array[x].length;y++){
            for(int z=1;z<array[x][y].length;z++){
                a=0;
                while(Character.getNumericValue(array[x][y][z].charAt(a)) == Character.getNumericValue(array[x][y][z-1].charAt(a))){
                    a+=1;
                }
//compare each member in the strings to see which comes first alphabetically
                while(Character.getNumericValue(array[x][y][z].charAt(a)) < Character.getNumericValue(array[x][y][z-1].charAt(a)) && z>0){
                    temp=array[x][y][z-1];
                    array[x][y][z-1]=array[x][y][z];
                    array[x][y][z]=temp;
                    if(z>1){
                    z--;
                    }
                }
//keep shuffling the code to the left until it is in the right spot
            }
        }
    }
//next part arranges 2d arrays in order of length
    String tem[];
//temporary array for storage during rearrangement
    for(int e=0;e<array.length;e++){
        for(int f=1;f<array[e].length;f++){
            while(array[e][f].length<array[e][f-1].length){
                tem=array[e][f-1];
                array[e][f-1]=array[e][f];
                array[e][f]=tem;
                if(f>1){
                    f--;
                }
            }
//compare lengths of and rearrange appropriately the member arrays 
        }
    }
}


public static void main(String[] args){
//main method

Scanner scan=new Scanner(System.in);
//construct scanner

String[][][] threed = soRandom();
//use sorandom method to create 3d string array
for(int a=0;a<threed.length;a++){
    for(int b=0;b<threed[a].length;b++){
        for(int c=0;c<threed[a][b].length;c++){
            threed[a][b][c]=coder();
        }
    }
}
//nested for loops that assign each member of threed a code

System.out.println("3D array:");
print(threed);
//prints the generated 3 d array and codes

unique(threed);
//checks array for duplicate codes

String[][][] container = soRandom();
//create a new random 3d array container

holoport(threed,container);
//holoport original array to container

System.out.println();
System.out.println("Container:");
print(container);
System.out.println();
//print the holoported container

System.out.println();
percentage(threed,container);
//display efficiency of holoportation

String code="";
//string for input code storage
System.out.println("Please enter a code to be searched for in the form XXYYYY");
System.out.println("Enter the first letter");
char first=scan.next().charAt(0);
code+=first;
System.out.println("Enter the second letter");
char second=scan.next().charAt(0);
code+=second;
System.out.println("Enter the four digits");
int one=scan.nextInt();
while(one>9999||one<1000){
    System.out.println("Out of bounds try again");
    one=scan.nextInt();
}
code+=one;
//prompt user for and accept inputs for the desired search code
sampling(container,code);
//conduct the search for the user input code
System.out.println();
System.out.println("Frankensteined 3D array:");
frankenstein(threed);
print(threed);
//outputs the array after being put through frankenstein method
    }
}