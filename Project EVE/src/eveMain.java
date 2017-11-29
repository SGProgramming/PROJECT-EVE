//eve is never capitalized for a reason. If you ask nicely I might tell you why.
/**
 * 
 * eve is a small batch "virus" creator and application launcher.
 * @author Gindeht
 *
 */

public class eveMain 
{

	public static void main(String[] args) 
	{	
		eveMenuMethods.eveLogo();					
		eveMethods.startUp();
		eveMethods.mainSecurity();
		eveMenuMethods.printMenu();
		eveMenuMethods.mainMenu();
	 }		 
}