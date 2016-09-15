import java.util.Scanner;
public class Node<E> 
{
	E item;
	Node<E> next;
	Node<E> prev;

	public Node( E item, Node<E> next, Node<E> prev ) 
	{
		this.item = item;
		this.next = next;
		this.prev = prev;
	}
}
/*
	public void AddToBeg( E in ) 
	{
		Node<E> newH = new Node<E>( in, null, null );
		current = newH;
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
		return item;
	}

	public void Print()
	{
		System.out.println( "\nItem: " + item + "\n");
		Node<E> temp = head;
		while ( temp.next != null )
		{
			temp = temp.next;
			System.out.println( "\nItem: " + temp.item + "\n");
		}
	}
}*/
