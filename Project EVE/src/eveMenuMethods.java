import java.awt.Desktop;
import java.io.IOException;
import java.net.URL;

/**
 * The main menu options as well as the options menu.
 * @author Nate&Jojo
 *
 */

public class eveMenuMethods 
{
	
	/////////////////////////////////////////////////////////
	
	public static void eveLogo()	//eve's logo, this the one exception to the capitalization rule. Make sure to change the version number.
	{
		 System.out.println("//===============================================//"); 
		 System.out.println("// ######  ##     ##  #######    ############### //");
		 System.out.println("// ##      ##     ##  ##           #         #   //");
		 System.out.println("// ##      ##     ##  ##             # # # #     //");
		 System.out.println("// ######  ##     ##  #######    ###### # ###### //");
		 System.out.println("// ##       ##   ##   ##             # # # #     //");
		 System.out.println("// ##        ## ##    ##           #         #   //");
		 System.out.println("// ######      #      #######    ############### //");
		 System.out.println("//==========Version 1.0==========================//");
	}
	
	/////////////////////////////////////////////////////////
	
	public static void optionsMenu()	//Options menu, basic "settings" for eve. <Still in development>
	{
		System.out.println("//==================//");					
 		System.out.println("// Menu:            //");
 		System.out.println("// 9: Terminate EVE //");
 		System.out.println("// 8: TBD           //");
 		System.out.println("//==================//");
 		System.out.println();
 		int restart = 0;
 		
 		System.out.println();
 		
 		do
 		{
 			
 		int optionsChoice = Expo.enterInt(); 
 		restart = 0;
 		switch (optionsChoice)
 		{
 		
 			case 9:		//Terminates eve
 			{
 				System.out.println();
 				System.out.println("*-Terminating EVE");
 				Expo.delay(250);
 				System.out.println("*-Shutdown Initiated");
 				Expo.delay(500);
 				System.exit(0);
 				break;
 			}
 			
 			case 8:		//TBD
 			{
 				System.out.println();
 				System.out.println("*-This feature has not been enabled yet, please select another option.");
 				restart = 1;
 				break;
 			}
 			
 			default:		//The idiot sequence
 			{
 				System.out.println("*-That is not one of the choices. Please select an option on the list.");
 				restart = 1;
 				break;
 			}
 		}
 		}
 		while (restart != 0);

	}
	
	/////////////////////////////////////////////////////////
	
	public static void mainMenu()	//Main menu selection, add virus writer and selection.
	{
		int restart = 0;	
		do
		{
			 int menuChoice = Expo.enterInt();
			 restart = 0;
			 System.out.println();
			 switch (menuChoice)													
			 {
			 
			 	case 1:		//Norse Attack Map
			 	{
			 		System.out.println("*-Starting Norse Attack Map");		
			 		String urlString = new String("http://map.norsecorp.com/#/");
			 		try {
				        Desktop.getDesktop().browse(new URL(urlString).toURI());
				    } catch (Exception e) {
				        e.printStackTrace();
				    }
			 		restart = 1;
			 		break;
			 	}
			 	
			 	case 2:		//Notepad (Rename or move this soon)
			 	{
			 		eveMenuMethods.openNotepad();
			 		restart = 1;
			 		break;
			 	}
			 	
			 	case 3:		//Soon to be virus library
			 	{
			 		eveWriter.virusMenu();
			 		restart = 1;
			 		break;
			 	}
			 	
			 	case 4:		//Options menu
			 	{
			 		restart = 1;
			 		eveMenuMethods.optionsMenu();
			 		break;
			 	}
			 	
			 	default:		//The idiot sequence
			 	{
			 		System.out.println("*-That is not one of the choices. Please select an option on the list.");
			 		restart = 1;
			 	}	 	
			 	
			 }
		}
		while (restart != 0); 
	}
	
	/////////////////////////////////////////////////////////
	
	public static void printMenu()	//Prints the main menu.
	{
		 System.out.println("//=======================//");
		 System.out.println("// Menu:                 //");
		 System.out.println("// 1: Norse_Attack_Map   //");
		 System.out.println("// 2: New_Program        //");
		 System.out.println("// 3: Print_Virus        //");
		 System.out.println("// 4: Options            //");
		 System.out.println("//=======================//");
		 System.out.println();
	}
	
	/////////////////////////////////////////////////////////
	
		public static void openNotepad()	//Opens and closes notepad, this allows for eve to print viruses not in the library.
	{
		System.out.println("*-Starting Secure Files Vault");
 		try 
           { 
              System.out.println("*-Opening notepad");
		         Runtime runTime = Runtime.getRuntime();
		         Process process = runTime.exec("notepad");
              
		      System.out.println("*-Enter 0 to close NotePad");
           int wordClose = Expo.enterInt();
           if (wordClose == 0)
           {
	         System.out.println("*-Closing notepad");
	   	   process.destroy();
           }
           else
           {
           
           }
           
	         }   
           
           catch (IOException e) 
           {
	   	   e.printStackTrace();
           }
	}
		
		/////////////////////////////////////////////////////////
		
		
}
