package train_reservation;

import java.util.ArrayList;
import java.util.Scanner;

public class reservation_medium {
    public static void main(String args[]) 
    {
    	System.out.println("Welcome to IRCTC");
    	
    	ArrayList<train_details> trains=new ArrayList<train_details>(4);
        trains.add(new train_details(169,true,2));
        trains.add(new train_details(56,false,29));
    	trains.add(new train_details(91,true,20));
    	for(train_details train:trains)
    	{
    		train.displayTrains();
    	}
    	ArrayList<Booking> Bookings=new ArrayList<Booking>(4);
//            pass.add(new passenger_details("ram",7398,250));
//            pass.add(new train_details("janani",43243,29));
//            pass.add(new train_details("jeevesh",4238743,20));
     	 
     	
    	
    	
    	int user_opt=1;
    	Scanner us_op=new Scanner(System.in);
    	
    	while(user_opt==1)
    	{
    		System.out.println("Choose 1 to booking train");
    		user_opt=us_op.nextInt();
    		if(user_opt==1)
    		{
    			System.out.println("Thanks for choosing us..please provide further travelling details");
    		     Booking booking=new Booking();
    		     if(booking.isAvailable(Bookings,trains))
    		     {
    		    	 Bookings.add(booking);
    		    	 System.out.println("Your booking is confirmed");
    		     }
    		     else
    		     {
    		    	 System.out.println("Seats Not available");
    		     }
    		}
//    	    if(user_opt!=1 && user_opt!=2)
//    	    {
//    			System.out.println("Veliya poda boomer");
//    	    }
    	}
    			
    }
}
