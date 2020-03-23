package playerModels;
 public class PlayerModelType2 extends PlayerModelType1{
	 
	 int lifepoints,attackpoint,defensivepoint;
	 
	 public PlayerModelType2(String Name) {
		 super(Name);
		 lifepoints = 0;
		 attackpoint = 0;
		 defensivepoint = 0;
	 }
	 
	 public PlayerModelType2(String Name, int Lifepoints, int Attackpoints, int defensivepoints) {
		 super(Name);
		 lifepoints = Lifepoints;
		 attackpoint = Attackpoints;
		 defensivepoint = defensivepoints;
	 }
	
	 
	 public PlayerModelType2(String Name, GroupType1 x) {
		 super(Name,x);
		 lifepoints = 0;
		 attackpoint = 0;
		 defensivepoint = 0;
	 }
	 
	 public PlayerModelType2(String Name, GroupType1 x, int Lifepoints, int Attackpoints, int defensivepoints) {
		 super(Name,x);
		 lifepoints = Lifepoints;
		 attackpoint = Attackpoints;
		 defensivepoint = defensivepoints;
	 }
	
	 
		public void setattackpoints(int Attackpoints) {
			attackpoint= Attackpoints;
		}
		public void setlifepoints(int Lifepoints) { 
			lifepoints= Lifepoints;
		}
		
		public void setdefensivepoints(int Defensivepoints) {
			defensivepoint = Defensivepoints;
		}
		
		public int getlifepoints() { 
			return lifepoints;
		}
		
		public int getattackpoints(){ 
			return attackpoint;
		}
		
		public int getdefensivepoints() {
			return defensivepoint;
		}
	 
	 
 }