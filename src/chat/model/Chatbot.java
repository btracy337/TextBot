package chat.model;

import java.util.ArrayList;

public class Chatbot

{
	private ArrayList<String> responseList;

	private String currentUser;

	private String joke;

	private String content;

	private ArrayList<String> spookyList;

	public Chatbot()
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
		responseList.add("");
		responseList.add("");
		responseList.add("");
		responseList.add("");
		responseList.add("");
		responseList.add("");
		responseList.add("");
		responseList.add("");
		responseList.add("");
		responseList.add("");
		responseList.add("");
		responseList.add("");
		responseList.add("");
		responseList.add("");
		responseList.add("");
		responseList.add("");
		spookyList.add("Halloween!!");
		spookyList.add("Hey there little human. I am here to take over the human race...");
		spookyList.add("Here's Johnny!!!");
		spookyList.add("a");
		spookyList.add("b");
		spookyList.add("c");
		spookyList.add("d");
		spookyList.add("e");
		spookyList.add("g");
	}
	public String processText(String userText)
	{
		String output = "";
		output += "You said: " + userText; 
		output += "Chatbot says: ";
		return output;
	}
	public boolean legitimacyChecker(String input)
	{
		boolean isValid = true;
		if(input == null) {
			isValid = false;
		}
		else if (input.length() < 2) {
			isValid = false;
		}
		else if (input.equals("")) {
			isValid = false;
		}
		else if (input.contains("asdfghjkl")){
			isValid = false;
		}
		return isValid;
		
	}
	
	public Chatbot(String currentUser, String joke, String content, ArrayList<String> spookyList, ArrayList<String> responseList)
	{
		this.currentUser = currentUser;
		this.joke = joke;
		this.content = content;
		this.spookyList = spookyList;
		this.responseList = responseList;
	}
	public Chatbot(String content)
	{
		this.content = content;
	}
	public boolean contentChecker (String inputContent)
	{
		boolean checkedContent =  false;
		return checkedContent;
	}
	public boolean spookyChecker(String inputContent)
	{
		boolean checkedSpooky = false;
		return checkedSpooky;
	}
	// public String askname()
	// {

	// }
	public String getCurrentUser()
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

	public ArrayList<String> getSpookyList()
	{
		return spookyList;
	}

	public ArrayList<String> getResponseList()
	{
		return responseList;
	}

	public void setCurrentUser(String currentUser)
	{
		this.currentUser = currentUser;
	}

	public void setJoke(String joke)
	{
		this.joke = joke;
	}

	public void setChecker(String content)
	{
		this.content = content;
	}

	public void setspookyList(ArrayList<String> spookyList)
	{
		this.spookyList = spookyList;
	}

	public void setresponseList(ArrayList<String> responseList)
	{
		this.responseList = responseList;
	}

}
