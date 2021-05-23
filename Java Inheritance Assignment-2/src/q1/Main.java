package q1;

public class Main
{
	public void Go() {
		Author author = new Author("Ramson Odoi", " ramsonodoi@gmail.com ",false);
		Book   book   = new Book("How to pass Java proramming test. ", author, 100.2, 2);
		
		System.out.println(book.toString());
	}

	public static void main(String[] args)
	{
	 Main x=new Main();
	 
	 x.Go();

	}

}
