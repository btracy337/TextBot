package chat.controller;

import javax.swing.JOptionPane;
import chat.model.Chatbot;

public class ChatController
{
	private Chatbot simpleBot;

	public void start()
	{
		
		boolean isDone = false;
		while (!isDone)
		{
			String userInput = JOptionPane.showInputDialog(null, "");
			interactWithChatbot(userInput);
			String quitter = JOptionPane.showInputDialog(null, "Type quit to exit the program.");
			if (quitter.equalsIgnoreCase("quit"))
			{
				isDone = true;
			}
		}
		
	}

	public ChatController()
	{
		simpleBot = new Chatbot();
	}

	public String interactWithChatbot(String userInput)
	{
		String chatbotSays = JOptionPane.showInputDialog(null, "");
		chatbotSays = simpleBot.processText(userInput);
		return chatbotSays;
	}

	public String useChatbotCheckers(String ghjk)
	{
		String asdf = "Halloween";
		return asdf;
	}

	public Chatbot getChatbot()
	{
		return this.simpleBot;
	}

	public void setChatbot(Chatbot simpleBot)
	{

		this.simpleBot = simpleBot;
	}
}
