import java.util.Scanner;

public class Mainz
{
	public static void main(String[] args) {
		int k = 1,o = 0;
		LinkedList<Integer> temp;
		LinkedList<Integer> i =  new LinkedList<Integer>();
		Scanner scan= new Scanner(System.in);
		while ( k != 0 ) {
			System.out.print( "Enter: " );
			k = scan.nextInt();
			i.Add( k );
			// i.Print();
			// System.out.println( "\n" + o + "\n" );
        	}
		
		temp = i;
		/*while ( temp.prev != null) 
		{
			temp = temp.prev;
			System.out.println( "prev\n" );
		}
		// temp.Print();
		while ( temp.next != null ) 
		{
			System.out.println( "next\n" );
			o = temp.Ret();
			System.out.println( "\n" + o + "\n" );
			temp = temp.next;
		}*/
		// temp.Print();
		System.out.println( temp );
	}
}

