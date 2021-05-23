package q1;

public class Author
{
	private String name;
	private String email;
	private boolean gender; //male =false:female=true;
	
	public Author(String name,String email,boolean gender) {
		this.name =new String(name);
		this.email=new String(email);
		this.gender=gender;
	}
	
public String getName() {
	return(name);
}
public String getEmail() {
	return(email);
}
public boolean getGender() {
	return(gender);
	
}

public Author(Author author) {
	this.name = new String(author.getName());
	this.email=new String(author.getEmail());
	this.gender=author.getGender();
}
public void setName(String name) {
	this.name=new String(name);
	
}
public void setEmail(String email) {
	this.email=new String(email);
}
public void setGenderMale() {
	this.gender=false;
}
public void setGenderFemale() {
	this.gender=true;
}

 public String toString() {
	char chGender=(this.gender)?'F':'M';
	
	return(new String(this.name +"("+chGender + ")at" + this.email
			)
			);
}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
