package PlayerModels;

public class MainTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GroupType1 Hei�eSchnecken = new GroupType1("Hei�e Schnecken", 4);	
		PlayerModelType1 Julia = new PlayerModelType1("Julia", Hei�eSchnecken);
		PlayerModelType2 Niklas = new PlayerModelType2("Niklas", Hei�eSchnecken);
		PlayerModelType3 Viola = new PlayerModelType3("Viola");
		
		Hei�eSchnecken.addPlayer(Viola);
		Hei�eSchnecken.removePlayer(Julia);
		Hei�eSchnecken.searchPlayer(Niklas);
		}

}
