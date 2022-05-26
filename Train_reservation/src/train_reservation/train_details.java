package train_reservation;

public class train_details {
            private int train_no;
            private boolean sleeper;
            private int capacity;
            train_details(int no,boolean slp,int cap)
           {
        	   this.train_no=no;
        	   this.sleeper=slp;
        	   this.capacity=cap;
           }
           public int getCapacity()
           {
        	   return capacity;
           } 
           public void setCapacity(int cap)
           {
        	   capacity=cap;
           }
            public int getSleeper()
           {
        	   return sleeper;
           }
           public void setSleeper(boolean slp)
           {
        	   sleeper=slp;
           }
           public void displayTrains()
           {
        	   System.out.println("Train no:" + train_no +" Sleeper:" + sleeper +" Capacity:"+capacity);
           }
           public int getTrain_no()
           {
        	   return train_no;
           }
          
}
