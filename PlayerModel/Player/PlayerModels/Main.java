package PlayerModels;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GroupType1 HeißeSchnecken = new GroupType1("Heiße Schnecken", 4);	
		PlayerModelType1 Julia = new PlayerModelType1("Julia", HeißeSchnecken);
		PlayerModelType2 Niklas = new PlayerModelType2("Niklas", HeißeSchnecken);
		PlayerModelType3 Viola = new PlayerModelType3("Viola");
		
		HeißeSchnecken.addPlayer(Viola);
		HeißeSchnecken.removePlayer(Julia);
		HeißeSchnecken.searchPlayer(Niklas);
		}

}
