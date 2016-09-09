import java.util.Scanner;

public class Mainz
{
    public static void main(String[] args) 
    {
		int k = 1,o = 0;
		Node<Integer> temp;
		Node<Integer> i = new Node<Integer>(5, null, null);
        Scanner scan= new Scanner(System.in);
        while ( k != 0 ) 
        {
            System.out.println( "Enter: \n" );
            k = scan.nextInt();
            i.Add( k );
			//i.Print();
//			System.out.println( "\n" + o + "\n" );
        }
		temp = i;
		while ( temp.prev != null) 
		{
			temp = temp.prev;
			System.out.println( "prev" );
		}
		while ( temp.next != null ) 
		{
			System.out.println( "next" );
			o = temp.Ret();
			System.out.println( "\n" + o + "\n" );
			temp = temp.next;
		}
    }   
}

