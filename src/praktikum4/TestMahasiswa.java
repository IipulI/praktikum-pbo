package praktikum4;

import java.util.Scanner;

public class TestMahasiswa {
	public static void main(String[] args) {
		Mahasiswa murid = new Mahasiswa();
		Scanner input = new Scanner(System.in);

		String nama;
		int npm;
		
		System.out.print("Masukan Nama	: ");
		nama = input.next();
		System.out.print("Masukan NPM 	: ");
		npm = input.nextInt();
		input.close();
		
		murid.setNama(nama);
		murid.setNpm(npm);
		
		System.out.println("\nNama Mahasiswa 	: " + murid.nama 
				+ "\nNPM Mahasiswa 	: " + murid.npm);
	}
}
