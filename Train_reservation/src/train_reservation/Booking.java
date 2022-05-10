package train_reservation;

import java.util.Scanner;

import java.text.SimpleDateFormat;

public class Booking {
   private String passenger_name;
   private int train_no;
   private Date date;
   Booking()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Your name");
	   this.passenger_name=sc.next();
	   System.out.println("enter train no");
	   train_no=sc.nextInt();
	   System.out.println("Enter date in this foramt dd//mm//yyyy");
	   String dateInput=sc.next();
	   SimpleDateFormat dateFormat =new SimpleDateFormat("dd-MM-YYYY");
	 try {
	   date=dateFormat.parse(dateInput);
	 }
	 catch(ParseException e)
	 {
		 e.printStackTrace();
	 }
   }
   public boolean isAvailable(ArrayList<Booking> Bookings,ArrayList<trains> trains)
   {
	   int capacity=0;
	   for(trains train:trains)
		   if(trains.getTrain_no()==train_no)
			   capacity=trains.getCapacity();
   }
   int count=0;
   for(Booking b:Bookings)
   {
	   if(b.train_no==train_no && b.date.equals(date))
	   {
		   count++;
	   }
   }
   return count<capcity?true:false;
   
}
