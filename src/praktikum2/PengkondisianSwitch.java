package praktikum2;

import java.util.Scanner;

public class PengkondisianSwitch {
	public static void main(String[] args) {
		// insialisasi angka
		int angka1, angka2, hasil;
		String perhitungan;
		
		// Scanner
		Scanner input = new Scanner(System.in);
		
		// angka1
		System.out.print("Masukan angka : ");
		angka1 = input.nextInt();
		
		// angka2
		System.out.print("Masukan angka : ");
		angka2 = input.nextInt();

		// list perhitungan
		System.out.print("List Perhitungan : "
				+ "\n + Pertambahan"
				+ "\n - Pengurangan"
				+ "\n * Perkalian"
				+ "\n / Pembagian"
				+ "\n Masukan angka perhitungan : ");
		perhitungan = input.next();
		input.close();
				
		// kondisi switch
		switch(perhitungan) {
		case "+" :
			hasil = angka1 + angka2;
			System.out.println("Hasilnya adalah : " + hasil);
			break;
		case "-" :
			hasil = angka1 - angka2;
			System.out.println("Hasilnya adalah : " + hasil);
			break;
		case "*" :
			hasil = angka1 * angka2;
			System.out.println("Hasilnya adalah : " + hasil);
			break;
		case "/" :
			hasil = angka1 / angka2;
			System.out.println("Hasilnya adalah : " + hasil);
			break;
		default :
			System.out.println("Simbol yang dimasukan salah");
			break;
		}
	}
}
