package chat.controller;

import java.util.Calendar;
import java.util.Scanner;

//import javax.swing.JOptionPane;

import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class IOController
{
	public static void saveText(ChatController app, String path, String textToSave)
	{
		try
		{
			// Creates the Filename for the file that is going to be saved. It should be
			// noted that it will include the date the file was created.
			String filename = path;
			Calendar date = Calendar.getInstance();
			filename += "/" + date.get(Calendar.MONTH) + " " + date.get(Calendar.DAY_OF_MONTH);
			filename += " at" + date.get(Calendar.HOUR) + "-" + date.get(Calendar.MINUTE);
			filename += " chatbot save.txt";
			// This is a scanner that uses a while loop. Basically, it will copy the text
			// from each line of the panel until there is no more lines of text.
			File saveFile = new File(filename);
			Scanner textScanner = new Scanner(textToSave);
			PrintWriter saveText = new PrintWriter(saveFile);
			while (textScanner.hasNext())
			{
				String currentLine = textScanner.nextLine();
				saveText.println(currentLine);
			}
			// Closes the scanner and the saveText methods because the saveText method is
			// static.
			textScanner.close();
			saveText.close();
		}
		catch (IOException error)
		{
			app.handleErrors(error);
		}
		catch (Exception genericError)
		{
			app.handleErrors(genericError);
		}
	}

	public static String loadFile(ChatController app, String path)
	{
		String contents = "";
		try
		{
			File saveFile = new File(path);
			Scanner fileScanner;
			if (saveFile.exists())
			{
				fileScanner = new Scanner(saveFile);
				while (fileScanner.hasNext())
				{
					contents += fileScanner.nextLine() + "\n";
				}
				fileScanner.close();
			}
		}
		catch (IOException e)
		{
			app.handleErrors(e);
		}
		catch (Exception genericError)
		{
			app.handleErrors(genericError);
		}
		return contents;
	}
}
