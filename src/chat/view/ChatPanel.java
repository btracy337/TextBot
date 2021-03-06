package chat.view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

import chat.controller.ChatController;
import chat.controller.IOController;

public class ChatPanel extends JPanel
{
	private SpringLayout appLayout;
	private ChatController appController;
	private JButton saveButton;
	private JButton loadButton;
	private JButton chatButton;
	private JButton checkerButton;
	private JButton quitButton;
	private JTextField chatField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private final Action action = new SwingAction();

	public ChatPanel(ChatController appController)
	{
		super();
		this.appController = appController;
		appLayout = new SpringLayout();

		saveButton = new JButton("Save");
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 533, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, -73, SpringLayout.SOUTH, this);

		loadButton = new JButton("Load");
		appLayout.putConstraint(SpringLayout.SOUTH, loadButton, -73, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, loadButton, -193, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, saveButton, -95, SpringLayout.WEST, loadButton);

		chatButton = new JButton("Chat");
		appLayout.putConstraint(SpringLayout.NORTH, chatButton, 533, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, chatButton, -73, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, chatButton, -700, SpringLayout.EAST, this);

		checkerButton = new JButton("Check Text");
		appLayout.putConstraint(SpringLayout.SOUTH, checkerButton, -73, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, checkerButton, -442, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, loadButton, 29, SpringLayout.EAST, checkerButton);
		appLayout.putConstraint(SpringLayout.WEST, checkerButton, 38, SpringLayout.EAST, chatButton);
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 124, SpringLayout.EAST, checkerButton);

		chatField = new JTextField("", 50);
		appLayout.putConstraint(SpringLayout.NORTH, checkerButton, 24, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.NORTH, loadButton, 24, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.EAST, chatField, 0, SpringLayout.EAST, loadButton);
		appLayout.putConstraint(SpringLayout.WEST, chatField, 0, SpringLayout.WEST, chatButton);
		appLayout.putConstraint(SpringLayout.SOUTH, chatField, -24, SpringLayout.NORTH, chatButton);

		chatPane = new JScrollPane();

		setupPanel();
		setupLayout();
		setupListeners();
		setupScrollPane();
	}

	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(1024, 768));
		this.setBackground(Color.MAGENTA);
		this.add(chatPane);
		this.add(chatButton);
		this.add(saveButton);
		this.add(loadButton);
		this.add(checkerButton);
		this.add(chatField);
		chatArea = new JTextArea("Hello there stranger! \n", 20, 50);
		
		quitButton = new JButton("Quit");
		appLayout.putConstraint(SpringLayout.WEST, quitButton, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, quitButton, -61, SpringLayout.NORTH, chatField);
		appLayout.putConstraint(SpringLayout.EAST, quitButton, -676, SpringLayout.EAST, this);

		add(quitButton);

	}

	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.WEST, chatButton, 104, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, chatArea, -96, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, chatArea, 67, SpringLayout.NORTH, this);
	}
	private String getpath(String choice)
	{
		String path = ".";
		int result = -99;
		JFileChooser fileChooser = new JFileChooser();
		if(choice.equals("save"))
		{
			fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			result = fileChooser.showSaveDialog(this);
			if(result == JFileChooser.APPROVE_OPTION)
			{
				path = fileChooser.getCurrentDirectory().getAbsolutePath();
			}	
		}
		return path;
	}

	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userText = chatField.getText();
				String response = "";
				response = appController.interactWithChatbot(userText);
				chatArea.append(response);
				chatArea.setCaretPosition(chatArea.getDocument().getLength());
				chatField.setText("");
			}
		});
		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String chatText = chatArea.getText();
				String path = ".";
				IOController.saveText(appController, path, chatText);
				chatArea.setText("Chat saved");
			}

		});
		loadButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{

			}
		});
		checkerButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
			chatArea.setText(appController.useChatbotCheckers(chatField.getText()));
			}

		});
		quitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				System.exit(0);
			}

		});
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
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
