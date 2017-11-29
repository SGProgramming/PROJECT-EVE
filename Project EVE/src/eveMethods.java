import java.awt.Desktop;
import java.net.URL;

/**
 * This class contains the miscellaneous methods.
 * @author Nate&Jojo
 *
 */

public class eveMethods 
{
	
	/////////////////////////////////////////////////////////	

	public static void softtextClear()	//Soft text clear, insert to get text our of the way for readability. 
	{
		for (int count = 0; count <= 3; count++)
		 {
			 System.out.println();
		 }
		
	}
	
	/////////////////////////////////////////////////////////
	
	public static void textClear()	//Hard text clear, insert to get text out of the way for readability.
	{
		for (int count = 0; count <= 30; count++)
		 {
			 System.out.println(""); 
		 }
		
	}
	
	/////////////////////////////////////////////////////////
	
	public static void mainSecurity()	//eve's security method, a simple do-while statement. Not much security is needed as not much important information is stored in eve.
	{
		int secureCode = 0;
		do
		 {
			 System.out.println("*-Please enter your security passcode.");
			 System.out.println();
			 secureCode = Expo.enterInt();
			 System.out.println();
		 }
		 while (secureCode != 90011727);	
	}
	
	/////////////////////////////////////////////////////////
	
	public static void startUp()	//Startup code for eve, mostly decorative at the moment.
	{
		 Expo.delay(250);													
		 System.out.println("*-Starting up");
		 Expo.delay(2000);
		 eveMethods.softtextClear();
		 
	}
	
	/////////////////////////////////////////////////////////
	
	public static void openWebpage(String urlString)	//This is not being used at the moment, but you can use it in other methods.
	{ 
	    try {
	        Desktop.getDesktop().browse(new URL(urlString).toURI());
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	/////////////////////////////////////////////////////////
	
}

