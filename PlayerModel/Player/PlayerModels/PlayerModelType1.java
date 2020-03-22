package PlayerModels;

public class PlayerModelType1 {
	
	String Playername, Group;
	boolean visibility, active;
	
	public PlayerModelType1(String Name) {
		Playername = new String(Name);
		Group = new String ("No Group set");
		visibility = true;
		active = false;
	}
	
	public PlayerModelType1(String Name, Group x) {
		Playername = new String(Name);
		Group = new String ();
		visibility = true;
		active = false;
		if(x.addPlayer(this)==false)
			Group = "No Group set";
			
	}
	
	public String getPlayername() {
		return Playername;
	}
	
	public boolean getvisibility() {
		return visibility;
	}
	
	public boolean getactive() {
		return active;
	}
	
	public String getGroup() {
		return Group;
		
	}
	
	public void changePlayername(String Name) {
		Playername = Name;
	}
	
	public boolean changevisibility() {
		
		if(visibility==true)
			visibility=false;
		else
			visibility=true;
		
	return visibility;
	}
	
	public void setvisibility(boolean Visibility) {
		visibility = Visibility;
				
	}
	
	public boolean changeactive() {
		if(active==true)
			active=false;
		else
			active=true;
		
	return active;
		
	}
	
	public void setactive(boolean Active) {
		active = Active;	
	}
	
	public boolean setGroup(String Groupname) {
		Group = Groupname;
		return true;
	}
	
}
