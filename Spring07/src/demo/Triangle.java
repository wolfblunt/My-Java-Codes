package demo;

public class Triangle {

	private int length;
	private String type;
	public Triangle(int length, String type) {
		super();
		this.length = length;
		this.type = type;
	}
	public Triangle(int length) {
		super();
		this.length = length;
	}
	public Triangle(String type) {
		super();
		this.type = type;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
