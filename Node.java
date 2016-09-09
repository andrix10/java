import java.util.Scanner;
public class Node<E> 
{
	E item;
	Node<E> next;
	Node<E> prev;
	Node<E> first;

	public Node( E item, Node<E> next, Node<E> prev ) 
	{
		this.item = item;
		this.next = next;
		this.prev = prev;
	}

	public void AddToBeg( E in ) 
	{
		Node<E> newH = new Node<E>( in, null, null );
		first = newH;
	}

	public void Add( E in ) 
	{
		Node<E> temp = new Node<E>( in, null, first );
		if ( first == null )
		{
			AddToBeg( in );
		}
		else 
		{
			Node<E> curN = first;
			while( curN.next != null ) 
			{
				curN = curN.next;
			}
			curN.next = temp;
			first = curN;
		}
	}

	public E Ret( )
	{
		return item;
	}

	public void Print()
	{
		System.out.println( "\nItem: " + item + "\n");
	}
}
