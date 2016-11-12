// LinkListOne.java

package chap20_505;

import java.util.*;

public class LinkListOne {
    public static void main ( String [] args )  {
        LinkedList<String> bucs = new LinkedList<String>();
        bucs.add("Jameis Winston");
        bucs.add("Doug Martin");
        bucs.add("Vincent Jackson");

        ListIterator<String> iter = bucs.listIterator(bucs.size());
        
        //process in reverse order (for fun)
        while ( iter.hasPrevious() )  {
            System.out.println( iter.previous() );
        }
        bucs.add( 1,"Mike Glennon"); //try another location, too
      
        ListIterator<String> iter2 = bucs.listIterator();
        iter2.add("Mike Evans");
        // now display all bucs in list
        System.out.println( "All bucs in list in order from start" );   
        while ( iter2.hasNext() )  {
            System.out.println( iter2.next() );
        }
        
        System.out.println("All bucs in list, now backwards");
        while ( iter2.hasPrevious() )  {
            System.out.println( iter2.previous());
        }      
        System.out.println(bucs.size());
    }
}
