package linkedlist;

public class Runner {
	public static void main(String args[])
	{
		Linkedlist list=new Linkedlist();
		list.insert(10);
		list.insert(20);
		list.insert(03);
		list.show();
		list.delete(10);
		System.out.println("After Head Deletion and inserted some elements");
		list.insert(50);
		list.insert(40);
		list.insert(60);
		list.show();
		list.delete(60);
		list.delete(40);
		System.out.println("Element gonna delete 3");
		System.out.println("After in between Deletion of elements");
		list.show();
		list.insertAtstart(900);
		System.out.println("After insert at start "); 
		list.show();
        list.insertAtspecific(2,66);
        list.delete(50);
		System.out.println("After insert at specific position ");
		list.show();
		list.insert(88);
		list.count();
     	list.reverse();
     	System.out.println("After reversing the linkedlist");     	list.show();
		
//        list.reverse();
//        list.show();
 	}
}
