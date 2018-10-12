package chat.controller;

import javax.swing.JOptionPane;
//import chat.model.Model;

public class Controller
{
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


	public String interactWithChatbot(String botText)
	{
		String something = "";
		return something;
	}
}
