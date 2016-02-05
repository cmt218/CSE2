//Cole Tomlinson
//2-5-16
//CSE 002 Lab 2
//Cyclometer Java Program

//Manipulate info about a bike

//defining class
public class Cyclometer {
    
    //required main method
    public static void main(String[] args) {
        //date input
        int secsTrip1=480; //trip1 duration in seconds
        int secsTrip2=3220; //trip2 duration in seconds
        int countsTrip1=1561; //trip1 rotation counts
        int countsTrip2=9037; //trip2 rotation counts
        
        //output data and intermediate variables
        double wheelDiameter=27.0; //diameter of the wheel
        double PI=3.14159; //the number PI
        double feetPerMile=5280; //number of feet in a mile
        double inchesPerFoot=12; //number of inches in a foot
        double secondsPerMinute=60; //number of seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance; //declaring variables for trip distance storage
        
        //output trip data
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+ " minutes and had "+ countsTrip1 + " counts."); //Trip 1 info
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+ " minutes and had "+ countsTrip2 + " counts."); //Trip 2 info
        
        //conduct some calculations and store values
        distanceTrip1=countsTrip1*wheelDiameter*PI; //This will give distance traveled in inches
                                                    //Counts multiplied by circumference of the wheel gives distance
        distanceTrip1/=inchesPerFoot*feetPerMile; //Converts Trip 1 distance into miles
        
        distanceTrip2=countsTrip2*wheelDiameter*PI; //Distance of trip 2 in inches
        
        distanceTrip2/=inchesPerFoot*feetPerMile; //Converting Trip 2 distance into miles
        
        totalDistance=distanceTrip1+distanceTrip2; //computing total distance 
        
        //printing calculated trip data
        System.out.println("Trip 1 was " +distanceTrip1+ " miles"); //prints Trip1 distance
        System.out.println("Trip 2 was " +distanceTrip2+ " miles"); //prints Trip2 distance
        System.out.println("The total distance was " + totalDistance+ " miles"); //prints the total distance 
        
        
        
    }   //closes main method
}  //closes cyclometer class