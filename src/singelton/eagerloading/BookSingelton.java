package singelton.eagerloading;

public class BookSingelton {
    private static BookSingelton instance = new BookSingelton();
    private BookSingelton(){

    }
    public static BookSingelton getBook(){
        return instance;
    }
}
