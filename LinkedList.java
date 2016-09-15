public class LinkedList<E>
{
    Node <E> head;
    
    public void AddToBeg( E in ) 
	{
		Node<E> newH = new Node<E>( in, null, null );
		head = newH;
	}

	public void Add( E in ) 
	{
		Node<E> temp = new Node<E>( in, null, head );
		if ( head == null )
		{
			AddToBeg( in );
		}
		else 
		{
			Node<E> curN = head;
			while( curN.next != null ) 
			{
				curN = curN.next;
			}
			curN.next = temp;
			head = curN;
		}
	}

	public E Ret( )
	{
		return head.item;
	}

	public void Print()
	{
		Node<E> temp = head;
		while ( temp.prev != null )
		{
		    System.out.println( "\nItem: " + temp.item + "\n");
			temp = temp.prev;
		}
	}
}
