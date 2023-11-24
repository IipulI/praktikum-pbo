package praktikum5;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Cat kucingSaya = new Cat();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan Nama Kucingmu = ");
		String namaKucing = input.next();
		
		System.out.print("Masukan Warna Kucingmu = ");
		String warnaKucing = input.next();
		
		System.out.print("Masukan Berat Kucingmu = ");
		int beratKucing = input.nextInt();
		input.close();
		
		kucingSaya.identitas(namaKucing, warnaKucing, beratKucing);
		
		System.out.println("\n" + kucingSaya.getName() + " si kucing, "
				+ "warnanya " + kucingSaya.getWarna()
				+ " beratnya " + kucingSaya.getBerat() + "kg.");
		kucingSaya.eat();
	}
}
