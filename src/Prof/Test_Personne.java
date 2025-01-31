package Prof;

public class Test_Personne{
	public static void main(String[] args) {
		Personne p1 = new Personne("Laurence", "Ago");
		System.out.println(p1.toString());
		Personne p2 = new Personne("Laurence");
		System.out.println(p2.toString());
	}
}