package PlayerModels;

public class Group {
	
	String GroupName;
	PlayerModelType1 [] PlayerList;
	int NumberofMembers;
	int NumberofTotalMembers;
	
	public Group(){
		GroupName = new String("No Name set");
		PlayerList = new PlayerModelType1[10];
		NumberofMembers =0;
		NumberofTotalMembers= 10;
	}
	
	public Group(String Name) {
		GroupName = new String(Name);
		PlayerList = new PlayerModelType1[10];
		NumberofMembers = 0;
		NumberofTotalMembers= 10;
	}
	
	public Group(int NumberofpossibleMembers) {
		GroupName = new String("No Name set");
		PlayerList = new PlayerModelType1[NumberofpossibleMembers];
		NumberofMembers = 0;
		NumberofTotalMembers = NumberofpossibleMembers;
	}
	
	public Group(String Name ,int NumberofpossibleMembers) {
		GroupName = new String(Name);
		PlayerList = new PlayerModelType1[NumberofpossibleMembers];
		NumberofMembers = 0;
	}
	
	public Group(String Name, PlayerModelType1 Player) {
		GroupName = new String(Name);
		PlayerList = new PlayerModelType1[10];
		NumberofMembers = 0;
		NumberofTotalMembers= 10;
		addPlayer(Player);
	}
	
	public Group(int NumberofpossibleMembers, PlayerModelType1 Player) {
		GroupName = new String("No Name set");
		PlayerList = new PlayerModelType1[NumberofpossibleMembers];
		NumberofMembers = 0;
		NumberofTotalMembers = NumberofpossibleMembers;
		addPlayer(Player);
	}
	
	public Group(String Name ,int NumberofpossibleMembers, PlayerModelType1 Player) {
		GroupName = new String(Name);
		PlayerList = new PlayerModelType1[NumberofpossibleMembers];
		NumberofMembers = 0;
		addPlayer(Player);
	}
	
	public Group(PlayerModelType1 Player) {
		GroupName = new String("No Name set");
		PlayerList = new PlayerModelType1[10];
		NumberofMembers =0;
		NumberofTotalMembers= 10;
		addPlayer(Player);
	}

	public boolean addPlayer(PlayerModelType1 Player) {
		
		if(NumberofMembers==NumberofTotalMembers)
			return false;
		else {
			PlayerList[NumberofMembers] = Player;
			Player.setGroup(getGroupname());
			NumberofMembers = +1;
			return true;
		}
	}
	
	public boolean removePlayer(PlayerModelType1 Player) {
		int x=0;
		do {
			if(Player.equals(PlayerList[x])) {
				
				do {
				PlayerList[x]= PlayerList[x+1];
				x = +1;
				}while(x<=NumberofMembers);
				Player.setGroup("No Group set");
				NumberofMembers = -1;
				return true;
			}
			else {
				x = +1;	
			}
			
		}while(x<=NumberofMembers);
		return false;
	}
	
	
	public boolean searchPlayerinGroup(PlayerModelType1 Player) {
		int x = 0;
		do {
			if(Player.equals(PlayerList[x]))
				return true;
		}while(x<=NumberofMembers);
		return false;
	}

	public String getGroupname() {
		return GroupName;
	}
	public void setGroupname(String Groupname) {
		GroupName= Groupname;
	}
}
