package model;

public class Enquiry {
	
	private String from;
	private String to;
	private String depart;
	private String return1;
	public Enquiry(String from, String to, String depart, String return1) {
		super();
		this.from = from;
		this.to = to;
		this.depart = depart;
		this.return1 = return1;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public String getReturn1() {
		return return1;
	}
	public void setReturn1(String return1) {
		this.return1 = return1;
	}
	
	
	
	
	

}
