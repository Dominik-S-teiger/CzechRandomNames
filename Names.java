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

		String s = "�teiger";
		Random rs = new Random();
		int i = rs.nextInt(40) + 1;
		switch (i) {

		case 1:
			s = "Dvo��k";
			break;
		case 2:
			s = "Nov�k";
			break;
		case 3:
			s = "Krej��";
			break;
		case 4:
			s = "Svoboda";
			break;
		case 5:
			s = "�ern�";
			break;
		case 6:
			s = "Proch�zka";
			break;
		case 7:
			s = "Vesel�";
			break;
		case 8:
			s = "Hor�k";
			break;
		case 9:
			s = "N�mec";
			break;
		case 10:
			s = "Ku�era";
			break;
		case 11:
			s = "Posp�il";
			break;
		case 12:
			s = "Marek";
			break;
		case 13:
			s = "D�t�";
			break;
		case 14:
			s = "H�jek";
			break;
		case 15:
			s = "R��i�ka";
			break;
		case 16:
			s = "Bene�";
			break;
		case 17:
			s = "Havel";
			break;
		case 18:
			s = "Jel�nek";
			break;
		case 19:
			s = "Fiala";
			break;
		case 20:
			s = "Kov��";
			break;
		case 21:
			s = "Musil";
			break;
		case 22:
			s = "Barto�";
			break;
		case 23:
			s = "T�ma";
			break;
		case 24:
			s = "Mare�";
			break;
		case 25:
			s = "Pol�k";
			break;
		case 26:
			s = "Dost�l";
			break;
		case 27:
			s = "��astn�";
			break;
		case 28:
			s = "V�vra";
			break;
		case 29:
			s = "Bure�";
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
			s = "�ih�k";
			break;
		case 35:
			s = "Rais";
			break;
		case 36:
			s = "Hrub�";
			break;
		case 37:
			s = "�ech";
			break;
		case 38:
			s = "Hn�zdo";
			break;
		case 39:
			s = "Ma�ek";
			break;
		case 40:
			s = "Ha�ek";
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
			n = "Tom�";
			break;
		case 5:
			n = "Leo�";
			break;
		case 6:
			n = "Marek";
			break;
		case 7:
			n = "Tobi�";
			break;
		case 8:
			n = "Ivan";
			break;
		case 9:
			n = "Franti�ek";
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
			n = "Jarom�r";
			break;
		case 17:
			n = "Milan";
			break;
		case 18:
			n = "Prokop";
			break;
		case 19:
			n = "Vojt�ch";
			break;
		case 20:
			n = "Zden�k";
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
			n = "Eli�";
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
			n = "Kry�tof";
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
			n = "�imon";
			break;
		case 36:
			n = "Lubo�";
			break;
		case 37:
			n = "Kristi�n";
			break;
		case 38:
			n = "Richard";
			break;
		case 39:
			n = "Mikul�";
			break;
		case 40:
			n = "Daniel";
			break;
		}
		return n;
	}

}
