package chat.controller;

import javax.swing.JOptionPane;
import chat.model.Chatbot;
import chat.view.ChatFrame;
public class ChatController
{
	private Chatbot simpleBot;
	private Chatbot frame;
	private ChatFrame appFrame;
	

	public void start()
	{			
	}

	public ChatController()
	{
		simpleBot = new Chatbot();
		appFrame = new ChatFrame(this);
	}

	public String interactWithChatbot(String userInput)
	{
		String chatbotSays =  "";
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
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame, error.getMessage());
	}
	public ChatFrame getAppFrame()
	{
		return appFrame;
	}
	private void close()
	{
		System.exit(0);
	}

}

