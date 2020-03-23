package playerModels;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


@SuppressWarnings("unused")
public class PlayerModelType3 extends PlayerModelType1 {

	
	File logo;
	
	public PlayerModelType3(String Name) {
		super(Name);
		logo = new File("..\\Player\\PlayerModels\\DefaultFiles\\Defaultuserlogo.png");
				
	}
	
	public PlayerModelType3(String Name, GroupType1 Groupname) {
		super(Name,Groupname);
		logo = new File("..\\Player\\PlayerModels\\DefaultFiles\\Defaultuserlogo.png");
	}
	
	public PlayerModelType3(String Name, GroupType1 Groupname, File userlogo) {
		super(Name,Groupname);
		logo = userlogo;
	}
	
	public void changeUserlogo(File Userlogo) {
		logo= Userlogo;
	}
	
	public void changetoDefault() {
		File logo2=new File("..\\Player\\PlayerModels\\DefaultFiles\\Defaultuserlogo.png");
		logo = logo2;
	}
}
