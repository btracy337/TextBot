package chat.view;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;

import chat.controller.ChatController;

public class ChatPanel extends JPanel
{
private SpringLayout appLayout;
private ChatController appController;
private JButton saveButton;
private JButton loadButton;
private JButton chatButton;
private JButton checkerButton;
private JTextField chatField;
private JTextArea chatArea;
private JScrollPane chatPane;

public ChatPanel(ChatController appController)
{
	super();
	this.appController = appController;
	appLayout = new SpringLayout();
	
	saveButton = new JButton("Save");
	loadButton = new JButton("Load");
	chatButton = new JButton("Chat");
	checkerButton = new JButton("Check Text");
	
	chatField = new JTextField("Talk to the bot Here", 50);
	chatArea = new JTextArea("Chat Area",20, 50);
	chatPane= new JScrollPane();
	
	
	
	
	setupPanel();
	setupLayout();
	setupListeners();
	setupScrollPane();
}
private void setupPanel()
{
	this.setLayout(appLayout);
	this.setPreferredSize(new Dimension(800,600));
	this.setBackground(Color.MAGENTA);
	this.add(chatPane);
	this.add(chatButton);
	this.add(saveButton);
	this.add(loadButton);
	this.add(checkerButton);
	this.add(chatField);
	
	
}
private void setupLayout()
{
	
}
private void setupListeners()
{
	
	
}
private void setupScrollPane()
{
	chatArea.setEditable(false);
	chatArea.setLineWrap(true);
	chatArea.setWrapStyleWord(true);
	
	chatPane.setViewportView(chatArea);
	chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
}
}
