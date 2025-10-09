class book
{
public String bookname;
public String author;
public String genre;
public int price;
public book(String bookname, String author, String genre, int price)
{
this.bookname=bookname;
this.author=author;
this.genre=genre;
this.price=price;
}
public void display()
{
System.out.println("the book name : " + bookname);
System.out.println("author: "+author);
System.out.println("genre of the book: "+genre);
System.out.println("price: rs"+ price);
}
}
public class bookss
{
public static void main(String args[])
{
book b=new book("meluha", "amish tripathi", "fantasy mythology",499);
b.display();
}
}		 
	