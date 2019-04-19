package chat.view;
import javax.swing.*;

import chat.view.ChatPanel;
import chat.controller.ChatController;

public class ChatFrame extends JFrame
{
private ChatPanel myPanel;
private ChatController appController;

public ChatFrame(ChatController appController)
	{
	super();
	this.appController = appController;
	this.myPanel =  new ChatPanel (appController);
	
	setupFrame();
	}
private void setupFrame()
	{
	this.setContentPane(myPanel);
	this.setSize(1024,768);
	this.setTitle("Chatbot and Twitter 3.0");
	this.setResizable(false);
	this.setVisible(true);
	}
}

