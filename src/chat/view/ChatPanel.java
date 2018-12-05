package chat.view;

public class ChatPanel
{
private SpringLayout appLayout;
private ChatController appController;
private JButton chatButton;
private JTextField inputField;
private JTextArea chatArea;
private JScrollPane chatPane;

public ChatPanel(ChatController appController)
{
	super();
	this.appController = new appController;
	
	chatButton = new JButton();
	inputField = new JTextField();
	chatArea = new JTextArea();
	chatPane= new JScrollPane();
	appLayout = new SpringLayout();
	
	
	
	setupPanel();
	setupLayout();
	setupListeners();
}
private void setupPanel()
{
	
}
private void setupLayout()
{
	
}
private void setupListeners()
{
	
	
}
private void setupScrollPane()
{
	
}
}
