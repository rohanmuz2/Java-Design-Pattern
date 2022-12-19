package singelton.lazyloading;

public class BookSingletonLazy {

    private BookSingletonLazy(){

    }

    private static BookSingletonLazy instance;

    public static BookSingletonLazy getInstance(){
        if(instance == null)
            instance = new BookSingletonLazy();
        return instance;
    }
}
