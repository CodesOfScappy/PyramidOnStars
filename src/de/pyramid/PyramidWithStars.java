package de.pyramid;

import java.util.Scanner;

/**
 * Ein Programm, das ein gleichschenkliges Dreieck aus Sternen auf der Konsole
 * zeichnet.
 * 
 * @author David Maurin
 * @version 1.0
 */
public class PyramidWithStars {

	/**
	 * Die Hauptmethode des Programms, die die Benutzereingabe für die Höhe des
	 * Dreiecks verarbeitet und dann das Dreieck auf der Konsole zeichnet.
	 *
	 * @param args Die Befehlszeilenargumente. Werden in diesem Programm nicht
	 *             verwendet.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("####################");
		System.out.println("# Sternen Pyramide #");
		System.out.println("####################");

		System.out.print("Bitte geben Sie die Höhe des gleichschenkligen Dreiecks ein: ");

		int height = scanner.nextInt();

		/**
		 * Diese Schleifenstruktur erzeugt die Darstellung eines gleichschenkligen
		 * Dreiecks aus Sternen auf der Konsole. Die äußere Schleife iteriert durch die
		 * Zeilen des Dreiecks basierend auf der eingegebenen Höhe. In jeder Zeile
		 * werden Leerzeichen und Sterne in einer bestimmten Anordnung ausgegeben, um
		 * das Dreieck zu formen.
		 *
		 * @param height Die Höhe des gleichschenkligen Dreiecks, die vom Benutzer
		 *               eingegeben wurde.
		 */
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		scanner.close();
	}
}