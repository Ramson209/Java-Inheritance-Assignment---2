package q1;

public class Book
{
	private String title;
	private Author author;
	private double price;
	private int qty;
	
	Book(String title,Author author,double price,int qty){
		this.title=new String(title);
		this.author=new Author(author);
		this.price=price;
		this.qty=qty;
	}
	public String getTitle() {
		return(title);
	}
	
	public Author getAuthor() {
		return new Author(this.author);	
	}
	public double getPrice() {
		return (price);
	}
	public int getQty() {
		return (qty);
	}
	
	Book(Book book){
		this.title=book.getTitle();
		this.author=new Author(book.getAuthor());
		this.price=book.getPrice();
		this.qty=book.getQty();
	}
	public void setPrice(double price) {this.price=price;}
	public void setQty(int qty) {this.qty=qty;}
	
	public String toString() {
		return(
				new String(
						"book title :" + this.title + "by Author "+ this.author.toString()+"price = " + this.price + ": qty =" + this.qty) );
	}
	


	public static void main(String[] args)
	{

	}

}
