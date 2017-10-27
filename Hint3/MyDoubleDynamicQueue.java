package Hint3;
//2017_COMP7035_SDH2_A01_BartoszHofman
public class MyDoubleDynamicQueue<T> implements MyQueue<T> {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------

	private MyDoubleLinkedNode<T> head;
	private MyDoubleLinkedNode<T> tail;
	private int numItems;

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------	
	public MyDoubleDynamicQueue()
	{
		head = null;
		tail = null;
		numItems = 0;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myQueue is empty: isEmpty
	//-------------------------------------------------------------------	
	public boolean isEmpty()
	{
		if(numItems == 0) 
		{
			return true;
		}
		else {
			return false;			
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyQueue: first
	//-------------------------------------------------------------------
	public T first()
	{
		if(numItems > 0) 
		{
			return this.head.getInfo();
		}
		else
		{
			return null;
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: addByFirst 
	//-------------------------------------------------------------------
	public void addByFirst(T element)
	{
		if(numItems > 0) 
		{
			MyDoubleLinkedNode<T> currentHead = head;
			head = new MyDoubleLinkedNode<T>(null, element, currentHead);
			currentHead.setLeft(head);
		} 
		else 
		{
			head = new MyDoubleLinkedNode<T>(null, element, null);
			tail = head;
		}

		this.numItems++;
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: removeByFirst 
	//-------------------------------------------------------------------	
	public void removeByFirst()
	{
		if(numItems > 0) 
		{
			head = head.getRight();
			this.numItems--;
			System.out.println("First item is removed!");
		} 
		else 
		{
			System.out.println("ERROR - Queue is empty");
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyQueue: last
	//-------------------------------------------------------------------
	public T last()
	{
		if(numItems > 0) 
		{
			return tail.getInfo();	
		}
		else {
			return null;
		}
		
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: addByLast 
	//-------------------------------------------------------------------
	public void addByLast(T element)
	{
		if(numItems > 0) 
		{
			MyDoubleLinkedNode<T> currentTail = tail;
			tail = new MyDoubleLinkedNode<T>(tail, element, null);
			currentTail.setRight(tail);

		} 
		else 
		{
			tail = new MyDoubleLinkedNode<T>(null, element, null);
			head = tail;
		}

		this.numItems++;
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: removeByFirst 
	//-------------------------------------------------------------------	
	public void removeByLast()
	{
		if(numItems > 1) 
		{
			tail = tail.getLeft();
			tail.setRight(null);
			this.numItems--;
		} 
		else if(numItems == 1) 
		{
			tail = null;
			head = null;
			this.numItems--;
		}
		else 
		{
			System.out.println("ERROR - Queue is empty");
		}


	}

}
