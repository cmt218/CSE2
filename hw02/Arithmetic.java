//Cole Tomlinson
//2-6-16
//Homework 2 
//Arithmetic Program

//setting up the class
public class Arithmetic{
    
//adding a main method 
    public static void main(String[] args){
        
//declare some variables
int numPants=3; //number of pants
double pantsPrice=34.98; //price per pair of pants
int numShirts=2; //number of shirts
double shirtPrice=24.99; //price per shirt
int numBelts=1; //number of belts
double beltPrice=33.99; //price per belt
double paSalesTax=0.06; //pennsylvania tax rate
double totalPantsCost=numPants*pantsPrice; //total cost of pants
double totalShirtsCost=numShirts*shirtPrice; //total cost of shirts
double totalBeltsCost=numBelts*beltPrice; //total cost of belts

double pantsTax=totalPantsCost*paSalesTax; //calculating tax on pants
pantsTax=pantsTax*100; //aiding in decimal restriction
int pantsTax2=(int)pantsTax; //aiding in decimal restriction
double pantsTax3=(double)pantsTax2; //aiding in decimal restriction
pantsTax3=pantsTax3/100; //aiding in decimal restriction

double shirtTax=totalShirtsCost*paSalesTax; //calculating tax on shirts
shirtTax=shirtTax*100; //aiding in decimal restriction
int shirtTax2=(int)shirtTax; //aiding in decimal restriction
double shirtTax3=(double)shirtTax2; //aiding in decimal restriction
shirtTax3=shirtTax3/100; //aiding in decimal restriction

double beltTax=totalBeltsCost*paSalesTax; //calculating tax on belts
beltTax=beltTax*100; //aiding in decimal restriction
int beltTax2=(int)beltTax; //aiding in decimal restriction
double beltTax3=(double)beltTax2; //aiding in decimal restriction
beltTax3=beltTax3/100; //aiding in decimal restriction

double totalCost=totalPantsCost+totalShirtsCost+totalBeltsCost; //calculating the total cost
double totalTax=pantsTax3+shirtTax3+beltTax3; //calculating the total tax
double totalPaid=totalCost+totalTax; //calculating the total paid 


System.out.println("Total cost of pants is $" +totalPantsCost); //output total pants cost
System.out.println("Total cost of shirts is $" +totalShirtsCost); //output total shirts cost
System.out.println("Total cost of belts is $" +totalBeltsCost); //output total belts cost
System.out.println("Total tax on pants is $" +pantsTax3); //output tax on pants
System.out.println("Total tax on shirts is $" +shirtTax3); //output tax on shirts
System.out.println("Total tax on belts is $" +beltTax3); //output tax on belts 
System.out.println("Total cost before tax is $" +totalCost); //output cost of items before tax
System.out.println("Total tax charged is $" +totalTax); //output tax charged on items
System.out.println("Total amount paid including tax is $" +totalPaid); //output total amount paid including taxs
        
    }
}
