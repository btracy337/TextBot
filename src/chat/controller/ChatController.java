package chat.controller;

import javax.swing.JOptionPane;
import chat.model.Chatbot;
import chat.view.ChatFrame;
public class ChatController
{
	private Chatbot simpleBot;
	private Chatbot frame;

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
		this.frame = frame;
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
	public Chatbot getFrame()
	{
		return this.frame;
	}
}
