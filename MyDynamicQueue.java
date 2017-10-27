package Hint2;
public class MyDynamicQueue implements MyQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------

	private MyNode head;
	private int numItems;

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------		
	public MyDynamicQueue()
	{
		this.head = null;;
		this.numItems = 0;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: isEmpty
	//-------------------------------------------------------------------	
	public boolean isEmpty()
	{
		if(numItems == 0 )
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyQueue: first
	//-------------------------------------------------------------------
	public int first()
	{
		if(numItems > 0) 
		{
			return this.head.getInfo();
		}
		else
		{
			return 0;
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: add 
	//-------------------------------------------------------------------
	public void add(int element)
	{
		MyNode newNode = new MyNode(element, null);
		if(numItems == 0) 
		{
			head = newNode;
		}
		else
		{
			MyNode current = head;
			for(int i = 1; i < numItems; i++)
			{
				current = current.getNext();
			}
			current.setNext(new MyNode(element, null));
		}
		numItems++;
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: remove 
	//-------------------------------------------------------------------	
	public void remove()
	{
		if (numItems == 0)
		{
			System.out.println("Queue is empty");
		}
		else if(numItems == 1)
		{		 	
			head = null;
		}
		else
		{
			head = head.getNext();
		}
		numItems--;
	}

}
