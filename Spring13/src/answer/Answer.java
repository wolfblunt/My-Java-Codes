package answer;

import java.sql.Date;

public class Answer {

	private int id;
	private String answer;
	private String postedDate;
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getAnswer() {
		return answer;
	}



	public void setAnswer(String answer) {
		this.answer = answer;
	}



	public String getPostedDate() {
		return postedDate;
	}



	public void setPostedDate(String postedDate) {
		this.postedDate = postedDate;
	}



	public Answer() {}
	
	public Answer(int id, String answer, String postedDate) {
		super();
		this.id = id;
		this.answer = answer;
		this.postedDate = postedDate;
	}


	public String toString()
	{
		return "ID: "+id+" Answer : "+answer+" Posted Date : "+postedDate; 
	}
	
}
