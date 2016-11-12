// ArrayListOne.java

package chap20_505;

import java.util.*;

public class ArrayListOne {

    public static void main(String[] args) {
        
        ArrayList <String> coll = new ArrayList <String>();
        coll.add("COP2251 ");
        coll.add("Java 2 ");
        coll.add("This course rocks");
        
        // An unsophisticated snippet
        for( int i = 0; i < coll.size(); i++ )  {
            System.out.print(coll.get(i));
        }
        System.out.println();
        
        //Can do this now, too
        for ( String s : coll ) {
            System.out.print(s);
        }
        System.out.println();
        
        // Here is the CF Way
        ListIterator<String> it = coll.listIterator();
        System.out.println("Using ListIterator");
        while ( it.hasNext()) {
            System.out.print(it.next());
        }
        System.out.println();        
        //and now backwards through the list
        System.out.println("Now backwards");
        while( it.hasPrevious()) {
            System.out.println(it.previous());            
        }
     }
}
