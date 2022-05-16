package linkedlist;

import linked_list.Node;

public class Linkedlist  {
   Node head;
public void insert(int data)
{
    	Node node=new Node();
    	node.data=data;
    	node.next=null;
    	if(head==null)
    	{
    		head=node;
    	}
    	else
    	{
    		Node n=head;
    		while(n.next!=null)
    		{
    			n=n.next;
    		}
    		n.next=node;
    	}
}
public void delete(int data)
{
	Node node=new Node();
	node.data=data;
		if(head.data==node.data)
		{
			head=head.next;
		}
		else
		{
			Node n=head;
			while(n.next.data!=node.data)
			{
				n=n.next;
			}
			n.next=n.next.next;
		}
}
public void insertAtstart(int data)
{
	Node node=new Node();
    node.data=data;
    node.next=null;
    node.next=head;
    head=node;
}
public void insertAtspecific(int pos,int data)
{
	int count=0;
	Node node=new Node();
	node.data=data;
	node.next=null;
	Node temp;
	Node n=head;
	if(pos==0)
	{
		insertAtstart(data);
	}
	else
	{
for(int i=0;i<pos-1;i++)
	{
		n=n.next;
	}
    node.next=n.next;
    n.next=node;
	
	}
}

public void show()
{
	Node n=head;
	while(n.next!=null)
	{
		System.out.println(n.data);
		n=n.next;
	}
	System.out.println(n.data);
}
public void count()
{
	Node n=head;
	int count=0;
	while(n.next!=null)
	{
		count++;
		n=n.next;
	}
	System.out.println("Total Nodes"+" "+count);
}
public void reverse()
{
   Node prev= null;
	Node curr=head;
   Node next=null;	
   while(curr.next!=null)
   {
	   next=curr.next;
	   curr.next=prev;
	   prev=curr;
	   curr=next;
   }
   head=prev;
}
}
