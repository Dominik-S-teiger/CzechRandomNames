package Names;

import java.util.Random;

public class Names {

	public static String Fullname() {
		String name = Name();
		String surname = Surname();
		String Full = name + " " + surname;
		if (name.contentEquals(surname)) {
			Full += ":::::::::LULW";
		}
		return Full;
	}

	public static String Surname() {

		String s = "Šteiger";
		Random rs = new Random();
		int i = rs.nextInt(40) + 1;
		switch (i) {

		case 1:
			s = "Dvoøák";
			break;
		case 2:
			s = "Novák";
			break;
		case 3:
			s = "Krejèí";
			break;
		case 4:
			s = "Svoboda";
			break;
		case 5:
			s = "Èernı";
			break;
		case 6:
			s = "Procházka";
			break;
		case 7:
			s = "Veselı";
			break;
		case 8:
			s = "Horák";
			break;
		case 9:
			s = "Nìmec";
			break;
		case 10:
			s = "Kuèera";
			break;
		case 11:
			s = "Pospíšil";
			break;
		case 12:
			s = "Marek";
			break;
		case 13:
			s = "Dítì";
			break;
		case 14:
			s = "Hájek";
			break;
		case 15:
			s = "Rùièka";
			break;
		case 16:
			s = "Beneš";
			break;
		case 17:
			s = "Havel";
			break;
		case 18:
			s = "Jelínek";
			break;
		case 19:
			s = "Fiala";
			break;
		case 20:
			s = "Kováø";
			break;
		case 21:
			s = "Musil";
			break;
		case 22:
			s = "Bartoš";
			break;
		case 23:
			s = "Tùma";
			break;
		case 24:
			s = "Mareš";
			break;
		case 25:
			s = "Polák";
			break;
		case 26:
			s = "Dostál";
			break;
		case 27:
			s = "Šastnı";
			break;
		case 28:
			s = "Vávra";
			break;
		case 29:
			s = "Bureš";
			break;
		case 30:
			s = "Kutina";
			break;
		case 31:
			s = "Topol";
			break;
		case 32:
			s = "Gubala";
			break;
		case 33:
			s = "Tidrich";
			break;
		case 34:
			s = "Èihák";
			break;
		case 35:
			s = "Rais";
			break;
		case 36:
			s = "Hrubı";
			break;
		case 37:
			s = "Èech";
			break;
		case 38:
			s = "Hnízdo";
			break;
		case 39:
			s = "Mašek";
			break;
		case 40:
			s = "Hašek";
			break;
		}

		return s;
	}

	public static String Name() {

		String n = "Dominik";
		Random tn = new Random();
		int i = tn.nextInt(40) + 1;
		switch (i) {
		case 1:
			n = "Adam";
			break;
		case 2:
			n = "Filip";
			break;
		case 3:
			n = "Ondra";
			break;
		case 4:
			n = "Tomáš";
			break;
		case 5:
			n = "Leoš";
			break;
		case 6:
			n = "Marek";
			break;
		case 7:
			n = "Tobiáš";
			break;
		case 8:
			n = "Ivan";
			break;
		case 9:
			n = "František";
			break;
		case 10:
			n = "Jesef";
			break;
		case 11:
			n = "Karel";
			break;
		case 12:
			n = "Jan";
			break;
		case 13:
			n = "Maxim";
			break;
		case 14:
			n = "Milan";
			break;
		case 15:
			n = "Jakub";
			break;
		case 16:
			n = "Jaromír";
			break;
		case 17:
			n = "Milan";
			break;
		case 18:
			n = "Prokop";
			break;
		case 19:
			n = "Vojtìch";
			break;
		case 20:
			n = "Zdenìk";
			break;
		case 21:
			n = "Robert";
			break;
		case 22:
			n = "David";
			break;
		case 23:
			n = "Dalibor";
			break;
		case 24:
			n = "Eliáš";
			break;
		case 25:
			n = "Pavel";
			break;
		case 26:
			n = "Nicolas";
			break;
		case 27:
			n = "Michael";
			break;
		case 28:
			n = "Kryštof";
			break;
		case 29:
			n = "Vladimir";
			break;
		case 30:
			n = "Vincent";
			break;
		case 31:
			n = "Tobias";
			break;
		case 32:
			n = "Erik";
			break;
		case 33:
			n = "Alan";
			break;
		case 34:
			n = "Viktor";
			break;
		case 35:
			n = "Šimon";
			break;
		case 36:
			n = "Luboš";
			break;
		case 37:
			n = "Kristián";
			break;
		case 38:
			n = "Richard";
			break;
		case 39:
			n = "Mikuláš";
			break;
		case 40:
			n = "Daniel";
			break;
		}
		return n;
	}

}
