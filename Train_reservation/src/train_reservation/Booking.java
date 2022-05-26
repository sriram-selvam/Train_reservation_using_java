package train_reservation;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class Booking {
    String passenger_name;
    int train_no;
      Date date;
   Booking()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Your name");
	   this.passenger_name=sc.next();
	   System.out.println("enter train no");
	   train_no=sc.nextInt();
	   System.out.println("Enter date in this foramt dd//mm//yyyy");
	   Scanner ds= new Scanner(System.in);
	   String s=ds.next();
	   SimpleDateFormat dateFormat =new SimpleDateFormat("dd-MM-yyyy");  
	 try {
	   date =dateFormat.parse(s);
	 }
	 catch(ParseException e)
	 {
		 e.printStackTrace();
	 }
	 }

   public boolean isAvailable(ArrayList<Booking> Bookings,ArrayList<train_details> trains)
   {
	  int capacity=0;
	   for(train_details train:trains)
		   if(train.getTrain_no()==train_no)
			   capacity=train.getCapacity();
   int count=0;
   for(Booking b:Bookings)
   {
	   if(b.train_no==train_no && b.date.equals(date))
	   {
		   count++;
	   }
   }
   return count<capacity?true:false;
   }}   

