package demo;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import answer.Answer;
import user.User;

public class Question {

	private int id;
	private String name;
	private Map<Answer,User> answer;
	public Question() {}
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
	public Map<Answer, User> getAnswer() {
		return answer;
	}
	public void setAnswer(Map<Answer, User> answer) {
		this.answer = answer;
	}
	public Question(int id, String name, Map<Answer, User> answer) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
	}
	
	public void displayinfo() {
		System.out.println("Id: "+id);
		System.out.println("Name : "+name);
		System.out.println("Answers.......");
		Set<Entry<Answer, User>>set = answer.entrySet();
		Iterator<Entry<Answer, User>>itr = set.iterator();
		while(itr.hasNext())
		{
			Entry<Answer, User>entry= itr.next();
			Answer ans = entry.getKey();
			User user = entry.getValue();
			System.out.println("Answer Information : ");
			System.out.println(ans);
			System.out.println("Posted By : ");
			System.out.println(user);
		}
	}
	
}
