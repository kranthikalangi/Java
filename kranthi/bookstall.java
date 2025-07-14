class book
{
    private String bookName;
    private String bookAuthor;
    private int bookCount;
    public book(String bookAuthor,String bookName,int bookCount)
    {
        this.bookName=bookName;
        this.bookAuthor=bookAuthor;
        this.bookCount=bookCount;
    }
    public String getbookName()
    {
        return bookName;
    }
    public String getbookAuthor()
    {
        return bookAuthor;
    }
    public int getbookCount()
    {
        return bookCount;
    }
    public void displayBookDetails()
    {
        System.out.println("bookname:"+bookName);
        System.out.println("bookauthor:"+bookAuthor);
        System.out.println("bookcount:"+bookCount);
    }
    public void sellBook()
    {
        if(bookCount>0){
        System.out.println("book sold successfully:");
        bookCount--;
        }
        else
        {
        System.out.println("book is out of stack:");
        }
    }
}
class Customer
{
    private int customerId;
    private String customername;
    private String customerAddress;
    public Customer(int customerId,String customername,String customerAddress)
    {
        this.customerId=customerId;
        this.customername=customername;
        this.customerAddress=customerAddress;
    }
    public void buyBook(Book book)
    {
        System.out.println("customername:"+customername+"withId"+customerId+"is buying the book"+"customeraddress"+customerAddress );
        book.sellBook();
    }
}
class bookstall
{
    public static void main(String args[])
    {
       Book textbook=new Book("introduction to java:","jyothi",3);
       System.out.println("book details before parchaus:");
       textbook. displayBookDetails();
       Customer customer1= new Customer(1,"uma","khammam");
       customer1.buyBook(textbook);
       System.out.println("book details after parchaus:");
       textbook.displayBookDetails();
    }
}