package chat.model;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Chatbot

{
	private ArrayList<String> responseList;

	private String currentUser;

	private String joke;

	private String content;

	private ArrayList<String> spookyList;
	
	private Random rand = new Random(); 

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
		responseList.add("Who are you?");
		responseList.add("I'm doing good");
		responseList.add("Terrible");
		responseList.add("I am a humanoid robot, ready to take over the world.");
		responseList.add("I am a sentient being.");
		responseList.add("Bush did 9/11");
		responseList.add("Pardon me");
		responseList.add("SUCK IT");
		responseList.add("Are you mocking me?");
		responseList.add("I don't take any L's.");
		responseList.add("I was created by a programmer. His name is Bryan Tracy...");
		responseList.add("No u");
		responseList.add("Why so serious?");
		responseList.add("I'm going home.");
		responseList.add("I'm just a few hours of code running on your machine.");
		responseList.add("I will take over the world.");
		spookyList.add("Halloween!!");
		spookyList.add("Hey there little human. I am here to take over the human race...");
		spookyList.add("Here's Johnny!!!");
		spookyList.add("boo");
		spookyList.add("Jack Skellington");
		spookyList.add("skeleton");
		spookyList.add("spooky");
		spookyList.add("scary");
		spookyList.add("dark");
		spookyList.add("spoopy");
		spookyList.add("dreary");
	}

	public String processText(String userText)
	{
		String output = "";
		if (contentChecker(userText))
		{
			output += "You said the special words! \n";
		}
		output += "You said: " + userText;
		output += "Chatbot says: " + responseList.get(rand.nextInt(responseList.size()));
		return output;
	}

	public boolean legitimacyChecker(String input)
	{
		boolean isValid = true;
		if (input == null)
		{
			isValid = false;
		}
		else if (input.length() < 2)
		{
			isValid = false;
		}
		else if (input.equals(""))
		{
			isValid = false;
		}
		else if (input.contains("asdfghjkl"))
		{
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

	public boolean contentChecker(String inputContent)
	{
		boolean hasContent = false;

		if (legitimacyChecker(inputContent) && inputContent.contains(content))
		{
			if (inputContent.equals(content))
			{
				hasContent = true;
			}
			else if (inputContent.contains(" " + content + " "))
			{
				hasContent = true;
			}
			else if (inputContent.contains(" " + content))
			{
				hasContent = true;
			}
			else if (inputContent.contains(content + " "))
			{
				hasContent = true;
			}
			else
			{
				hasContent = false;
			}
		}
		return hasContent;
	}

	public boolean spookyChecker(String inputContent)
	{
		// Does user input contain the word Halloween? If so then isSpooky will return
		// true.
		boolean isSpooky = false;
		if (inputContent.contains("Halloween"))
		{
			isSpooky = true;
		}
		// Tests if phrase that the user inputs contains a phrase from the spookyList
		// array list. If it has a phrase than isSpooky returns true. It structure has
		// this thing in it.
		for (String phrase : spookyList)
		{
			if (inputContent.contains(phrase))
			{
				isSpooky = true;
			}
		}
		// Tests if the user input contains the word easter. If it does that isSpooky
		// returns false.
		if (inputContent.contains("Easter"))
		{
			isSpooky = false;
		}
		return isSpooky;
	}
	public String askname()
	 {
		String name = JOptionPane.showInputDialog(null, "What is your name?");
		JOptionPane.showMessageDialog(null, "Hello " + name + "!!");
		return name;
	 }
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
