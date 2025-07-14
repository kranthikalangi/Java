class Book{
    private String bookName;
    private String bookAuthor;
    private int bookCount;
    public Book(String bookName, String bookAuthor, int bookCount)
    {
        this.bookName=bookName;
        this.bookAuthor=bookAuthor;
        this.bookCount=bookCount;
    }
    
    public void displayBookDetails()
    {
        System.out.println("bookName:"+bookName);
        System.out.println("bookAuthor:"+bookAuthor);
        System.out.println("bookCount:"+bookCount);
    }
    public void booksell()
    {
        if(bookCount>0){
        System.out.println("book sold successfully:");
        bookCount--;
        }
        else{
            System.out.println("book is out of stack");
        }

    }

    public void sellBook() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sellBook'");
    }
}
class Customer
{
    private int CustomerId;
    private String CustomerName;
    public Customer(int CustomerId, String CustomerName,String CustomerAddress)
    {
        this.CustomerId=CustomerId;
        this.CustomerName=CustomerName;
    }
    public void buyBook(Book book)
    {
        System.out.println("coustomer"+CustomerName+"with Id"+ CustomerId+ "is buying the book");
        book.booksell();
    }
}
class EbookSell
{
    public static void main(String args[])
    {
        Book textbook=new Book("introductin to java","rama",3);
        System.out.println("book befor purchasse");
        textbook.displayBookDetails();
        Customer customer1=new Customer(1,"kranthi","kranthi");
        customer1.buyBook(textbook);
        System.out.println("book after purchase");
        textbook.displayBookDetails();
    }
}