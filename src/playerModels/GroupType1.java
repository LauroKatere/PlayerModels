package playerModels;

public class GroupType1 {
	
	String GroupName;
	PlayerModelType1 [] PlayerList;
	int NumberofMembers;
	int NumberofTotalMembers;
	
	public GroupType1(){
		GroupName = new String("No Name set");
		PlayerList = new PlayerModelType1[10];
		NumberofMembers =0;
		NumberofTotalMembers= 10;
	}
	
	public GroupType1(String Name) {
		GroupName = new String(Name);
		PlayerList = new PlayerModelType1[10];
		NumberofMembers = 0;
		NumberofTotalMembers= 10;
	}
	
	public GroupType1(int NumberofpossibleMembers) {
		GroupName = new String("No Name set");
		PlayerList = new PlayerModelType1[NumberofpossibleMembers];
		NumberofMembers = 0;
		NumberofTotalMembers = NumberofpossibleMembers;
	}
	
	public GroupType1(String Name ,int NumberofpossibleMembers) {
		GroupName = new String(Name);
		PlayerList = new PlayerModelType1[NumberofpossibleMembers];
		NumberofMembers = 0;
		NumberofTotalMembers = NumberofpossibleMembers;
	}
	
	public GroupType1(String Name, PlayerModelType1 Player) {
		GroupName = new String(Name);
		PlayerList = new PlayerModelType1[10];
		NumberofMembers = 0;
		NumberofTotalMembers= 10;
		this.addPlayer(Player);
	}
	
	public GroupType1(int NumberofpossibleMembers, PlayerModelType1 Player) {
		GroupName = new String("No Name set");
		PlayerList = new PlayerModelType1[NumberofpossibleMembers];
		NumberofMembers = 0;
		NumberofTotalMembers = NumberofpossibleMembers;
		this.addPlayer(Player);
	}
	
	public GroupType1(String Name ,int NumberofpossibleMembers, PlayerModelType1 Player) {
		GroupName = new String(Name);
		PlayerList = new PlayerModelType1[NumberofpossibleMembers];
		NumberofMembers = 0;
		this.addPlayer(Player);
	}
	
	public GroupType1(PlayerModelType1 Player) {
		GroupName = new String("No Name set");
		PlayerList = new PlayerModelType1[10];
		NumberofMembers =0;
		NumberofTotalMembers= 10;
		this.addPlayer(Player);
	}

	public boolean addPlayer(PlayerModelType1 Player) {
		
		if(NumberofMembers==NumberofTotalMembers) {
			System.out.println("Group can not contain more Players");
			return false;
		}
			else{
			PlayerList[NumberofMembers] = Player;
			Player.setGroup(getGroupname());
			NumberofMembers = +1;
			System.out.println("Player added");
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
				System.out.println("Player removed");
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


