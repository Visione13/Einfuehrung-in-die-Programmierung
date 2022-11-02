import java.util.Scanner;

public class Dosenberechnung {

	public static void main(String[] args) {
		Dosenberechnung Dosenberechnung = new Dosenberechnung();
		Scanner in = new Scanner(System.in);
		System.out.print("Bitte den Radius eingeben: ");
		int radius = in.nextInt();
		System.out.print("Bitte die Höhe eingeben: ");
		int höhe = in.nextInt();
		double umfang = Dosenberechnung.umfangBerechnen(radius);
		double deckelfläche = Dosenberechnung.deckelflächeBerechnen(radius);
		double mantelfläche = Dosenberechnung.mantelflächeBerechnen(umfang, höhe);
		double oberfläche = Dosenberechnung.oberflächeBerechnen(deckelfläche, mantelfläche);
		double volumen = Dosenberechnung.volumenBerechnen(deckelfläche, höhe);
		System.out.println("Umfang: " + umfang);
		System.out.println("Deckelfläche: " + deckelfläche);
		System.out.println("Mantelfläche: " + mantelfläche);
		System.out.println("Oberfläche: " + oberfläche);
		System.out.println("Volumen: " + volumen);
	}
	
	public double umfangBerechnen(int radius) {
		double umfang = radius * Math.PI * Math.PI;
		return umfang;
	}
	
	public double deckelflächeBerechnen(int radius) {
		double deckelfläche = Math.PI * (radius * radius);
		return deckelfläche;
	}
	public double mantelflächeBerechnen(double umfang, int höhe) {
		double mantelfläche = umfang * höhe;
		return mantelfläche;
		
	}
	public double oberflächeBerechnen(double deckelfläche, double mantelfläche) {
		double oberfläche = 2*(deckelfläche+mantelfläche);
		return oberfläche;
	}
	public double volumenBerechnen(double deckelfläche, int höhe) {
		double volumen = deckelfläche * höhe;
		return volumen;
	}
}