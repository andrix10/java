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
		System.out.println();
		System.out.print("[ ");
		while ( temp.prev != null )
		{
			System.out.print( temp.item + " ");
			temp = temp.prev;
		}
		System.out.println("]");
	}

	public String toString() {
		StringBuilder result = new StringBuilder();

		Node<E> temp = head;
		result.append("[ ");
                while ( temp.prev != null )
                {
			result.append( temp.item.toString() + " ");
                        temp = temp.prev;
                }
		result.append("]");
		
		return result.toString();
	}
}
