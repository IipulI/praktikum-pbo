package praktikum1;

import java.util.Scanner;

public class Lathian {
	public static void main(String[] args) {
//		Inisialisasi scanner
		Scanner input = new Scanner(System.in);
		
		String namaDepan, namaBelakang, fullName, npm;
		
		System.out.print("Nama depan : ");
		namaDepan = input.next();
		System.out.print("Nama belakang : ");
		namaBelakang = input.next();
		System.out.print("NPM : ");
		npm = input.next();
		
		fullName = namaDepan + " " + namaBelakang;
		
		System.out.println("\n\nNama depan : " + namaDepan);
		System.out.println("Nama belakang : " + namaBelakang);
		System.out.println("\nNama : " + fullName);
		System.out.println("NPM : " + npm + "\n");
		
//		Inisialisasi variable
		int angka1, angka2, hasil;
		
//		User input
		System.out.print("Masukan angka 1 : ");
		angka1 = input.nextInt();
		System.out.print("Masukan angka 2 : ");
		angka2 = input.nextInt();
		
//		Close scanner
		input.close();
		
//		Perhitungan Hasil
		hasil = angka1 + angka2;
		
//		Output
		System.out.println("Hasilnya : " + hasil);
		
	}
}
