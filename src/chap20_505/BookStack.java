// BookStack.java

package chap20_505;

import java.util.*;

public class BookStack {
    public static void main(String[] args) {
        Stack<String> books = new Stack<String>();
        books.push( "Introduct to Java" );
        books.push( "Java in a Nutshell" );
        books.push( "Core Java 2" );  // Last In but First Out (LIFO)
        
        System.out.println( books.peek() );
        System.out.println( books.search("Java in a Nutshell"));
        
        for( int i = 0; i < 3; i++ )  {
            System.out.println( books.pop() );
        }
        System.out.println( books.empty());
    }
}
