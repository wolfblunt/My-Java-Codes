package demo;

public class Employee {

	private String name;
	private String id;
	private Addess address;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Addess getAddress() {
		return address;
	}

	public void setAddress(Addess address) {
		this.address = address;
	}

	public Employee()
	{
		System.out.println("show employee");
	}

	public Employee(String name, String id, Addess address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	public void show()
	{
		System.out.println("Name : "+name+" "+"ID : "+id);
		System.out.println("Address : "+address.toString());
	}
}
