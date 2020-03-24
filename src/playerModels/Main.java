package playerModels;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GroupType1 HeiﬂeSchnecken = new GroupType1("Heiﬂe Schnecken", 4);	
		PlayerModelType1 Julia = new PlayerModelType1("Julia", HeiﬂeSchnecken);
		PlayerModelType2 Niklas = new PlayerModelType2("Niklas", HeiﬂeSchnecken);
		PlayerModelType3 Viola = new PlayerModelType3("Viola");

		HeiﬂeSchnecken.addPlayer(Viola);
		HeiﬂeSchnecken.removePlayer(Julia);
		if(true==HeiﬂeSchnecken.searchPlayerinGroup(Niklas))
			System.out.println("Player is in the Group");
		else
			System.out.println("Player is not in this Group"); 
	}

}
