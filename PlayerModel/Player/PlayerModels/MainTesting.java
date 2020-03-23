import java.security.acl.Group;

public class MainTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group HeiﬂeSchnecken = new Group("Heiﬂe Schnecken", 4);	
		PlayerModelType1 Julia = new PlayerModelType1("Julia", HeiﬂeSchnecken);
		PlayerModelType2 Niklas = new PlayerModelType2("Niklas", HeiﬂeSchnecken);
		PlayerModelType3 Viola = new PlayerModelType3("Viola");
		
		HeiﬂeSchnecken.addPlayer(Viola);
		HeiﬂeSchnecken.re
		}

}
