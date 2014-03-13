public class Book extends Product
{
    private String author;

    public Book()
    {
        super();
        author = "";
        addCount();
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public String getAuthor()
    {
        return author;
    }
    public String toString()
    {
        return super.toString() +
            "Author:      " + author + "\n";
    }
    
    public void displayContent()
    {
    	System.out.println("Author:      " + author + "\n");
    }
}