package demo;

public class Triangle {
	
	private int height;
	private String type;
	public Triangle(int height, String type) {
		super();
		this.height = height;
		this.type = type;
	}
	
	public Triangle(String type) {
		super();
		this.type = type;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
