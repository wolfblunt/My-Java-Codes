package p1;

public class Student {
	private String id;
	private String name;
	private String author;
	public Student()
	{
		this.id="";
		this.name="";
		this.author="";
	}
	public Student(String id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/*public String toString() {
		return id +name +author;
	}*/
}
