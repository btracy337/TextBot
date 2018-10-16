package chat.controller;

import javax.swing.JOptionPane;
import chat.model.Model;

public class Controller
{
	private Model simpleBot;
	public void start()
	{
		boolean isDone = false;
		while (!isDone)
		{
			String quitter = JOptionPane.showInputDialog(null, "Type quit to exit the program.");
			if (quitter.equalsIgnoreCase("quit"))
			{
				isDone = true;
			}
		}
	}
	public Controller()
	{
		simpleBot = new Model();
	}
	


	public String interactWithChatbot(String botText)
	{
		String chatbotSays = JOptionPane.showInputDialog(text);
		chatbotSays = simpleBot.processText(userInput);
		return chatbotSays;
	}
}
