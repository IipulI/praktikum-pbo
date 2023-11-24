package praktikum2;

import java.util.Scanner;

public class PengkondisianIF {
	public static void main(String[] args) {
		// insialisasi angka
		int angka1, angka2, hasil, perhitungan;
		
		// Scanner
		Scanner input = new Scanner(System.in);
		
		// angka1
		System.out.print("Masukan angka 1 : ");
		angka1 = input.nextInt();
		
		// angka2
		System.out.print("Masukan angka 2 : ");
		angka2 = input.nextInt();

		// list perhitungan
		System.out.print("List Perhitungan : "
				+ "\n 1. Pertambahan"
				+ "\n 2. Pengurangan"
				+ "\n 3. Perkalian"
				+ "\n 4. Pembagian"
				+ "\n Masukan angka perhitungan : ");
		perhitungan = input.nextInt();

		input.close();
		
		// Kondisi if 2
		if(perhitungan == 1) {
			hasil = angka1 + angka2;
			System.out.println("Hasilnya adalah : " + hasil);
		} else if (perhitungan == 2){
			hasil = angka1 - angka2;
			System.out.println("Hasilnya adalah : " + hasil);
		} else if (perhitungan == 3){
			hasil = angka1 * angka2;
			System.out.println("Hasilnya adalah : " + hasil);
		} else if (perhitungan == 4){
			hasil = angka1 / angka2;
			System.out.println("Hasilnya adalah : " + hasil);
		} else {
			System.out.println("Angka perhitungan salah!");
		}
		
		
				
		// Kondisi if 1
//		if(angka1 > 5) {
//			System.out.println("Angka yang dimasukan lebih dari 5");
//		} else {
//			System.out.println("Angka yang dimasukan kurang dari 5");
//		}
	}
}
