import java.security.acl.Group;

public class MainTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group HeißeSchnecken = new Group("Heiße Schnecken", 4);	
		PlayerModelType1 Julia = new PlayerModelType1("Julia", HeißeSchnecken);
		PlayerModelType2 Niklas = new PlayerModelType2("Niklas", HeißeSchnecken);
		PlayerModelType3 Viola = new PlayerModelType3("Viola");
		
		HeißeSchnecken.addPlayer(Viola);
		HeißeSchnecken.re
		}

}
