class library{
    String[] books;
    int noofbooks;
    library(){
books = new String[100];
noofbooks=0;
    }
    void addbooks(String book){
        books[noofbooks] = book;
        noofbooks++;
        System.out.println(book + "book has been adde");
    }
    void showavilablebooks(){
        System.out.println("available books are:");
        for (String book:books) {
            if (book == null){
                continue;
            }
            System.out.println("*" + book);

        }
    }
    void issuebook(String book){
        for(int i=0;i<books.length;i++){
            if(books[i].equals(book)){
                System.out.println("the book has been issued");
                books[i]=null;
                return;
            }
        }
        System.out.println("this book doesnt exist");
    }
    void returnbok(String book){
        addbooks(book);
    }
}


public class Onlinelibrary61 {
    public static void main(String[] args) {
library li = new library();
li.addbooks("shrimadbhagvatgita");
li.addbooks("ramayan");
li.addbooks("sam");
li.addbooks("anuu");
li.showavilablebooks();
li.issuebook("ramayan");
li.showavilablebooks();
li.returnbok("ramayan");
li.showavilablebooks();
    }
}
