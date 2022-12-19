package singelton;

import singelton.eagerloading.BookSingelton;

public class App {

    public static void main(String[] args) {

        BookSingelton bookSingelton = BookSingelton.getBook();
        System.out.println(bookSingelton);

        BookSingelton test = BookSingelton.getBook();
        System.out.println(test);

    }
}
