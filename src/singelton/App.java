package singelton;

import singelton.eagerloading.BookSingelton;
import singelton.lazyloading.BookSingletonLazy;

public class App {

    public static void main(String[] args) {

        BookSingelton bookSingelton = BookSingelton.getBook();
        System.out.println(bookSingelton);

        BookSingelton test = BookSingelton.getBook();
        System.out.println(test);


        BookSingletonLazy  bookSingletonLazy = BookSingletonLazy.getInstance();
        System.out.println(bookSingletonLazy);

        BookSingletonLazy  bookSingletonLazy1 = BookSingletonLazy.getInstance();
        System.out.println(bookSingletonLazy1);



    }
}
