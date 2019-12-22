package demo1;

import java.util.Iterator;
import java.util.List;

import demo2.Answer;

public class Question {

	private int id;
	private String name;
	private List<Answer>answer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	
	
	public Question(int id, String name, List<Answer> answer) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
	}
	
	public void Display()
	{
		System.out.println(id);
		System.out.println(name);
		Iterator<Answer>itr = answer.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	

	
}
