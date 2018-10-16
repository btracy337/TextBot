package chat.model;

import java.util.ArrayList;

public class Model

{
	private ArrayList<String> responseList;

	private String currentUser;

	private String joke;

	private String content;

	private ArrayList<String> spookyList;

	public Model()
	{
		this.joke = "Why did the chicken cross the road? To get to the other side!!!!!!!!";
		this.currentUser = "default user --- boring";
		this.content = "Empty of all content but not null.";
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		buildTheLists();
	}
	private void buildTheLists()
	{
		responseList.add("Hello! How are you?");
		responseList.add("Yes");
		responseList.add("No");
		responseList.add("That ain't it chief.");
		responseList.add("Maybe");
		responseList.add("YASSSSSSSSSSSS!");
		responseList.add("Goodbye-- No more talking.");
		spookyList.add("Boo!!");
		spookyList.add("Hey there little human. I am here to take over the human race...");
		spookyList.add("Here's Johnny!!!");
	}
	
	public Model(String currentUser, String joke, String content, ArrayList<String> spookyList, ArrayList<String> responseList)
	{
		this.currentUser = currentUser;
		this.joke = joke;
		this.content = content;
		this.spookyList = spookyList;
		this.responseList = responseList;
	}
	// public String askname()
	// {

	// }
	public String getcurrentUser()
	{
		return currentUser;
	}

	public String getJoke()
	{
		return joke;
	}

	public String getContent()
	{
		return content;
	}

	public ArrayList<String> getspookyList()
	{
		return spookyList;
	}

	public ArrayList<String> getresponseList()
	{
		return responseList;
	}

	public void setcurrentUser(String currentUser)
	{
		this.currentUser = currentUser;
	}

	public void setJoke(String joke)
	{
		this.joke = joke;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public void spookyList(ArrayList<String> spookyList)
	{
		this.spookyList = spookyList;
	}

	public void responseList(ArrayList<String> responseList)
	{
		this.responseList = responseList;
	}

}
