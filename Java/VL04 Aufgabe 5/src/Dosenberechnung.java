import java.util.Scanner;

public class Dosenberechnung {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Bitte den Radius eingeben:");
		int radius = in.nextInt();
		System.out.println("Bitte die Höhe eingeben:");
		int höhe = in.nextInt();
		
		
	}
	
	public double umfangBerechnen(int radius) {
		double umfang = radius * Math.PI * Math.PI;
		return umfang;
	}
	
	public double deckelflächeBerechnen(int radius) {
		double deckelfläche = Math.PI * (radius * radius);
		return deckelfläche;
	}
	public double mantelflächeBerechnen(int umfang, int höhe) {
		int mantelfläche = umfang * höhe;
		return mantelfläche;
		
	}
	public double oberflächeBerechnen(double deckelfläche, int mantelfläche) {
		double oberfläche = 2*(deckelfläche+mantelfläche);
		return oberfläche;
	}
	public double volumenBerechnen(double deckelfläche, int höhe) {
		double volumen = deckelfläche * höhe;
		return volumen;
	}
}