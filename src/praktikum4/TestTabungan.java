package praktikum4;

import java.util.Scanner;

public class TestTabungan {
	public static void main(String[] args) {
		int saldo, tarikTunai;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan Saldo : ");
		saldo = input.nextInt();		
		
		Tabungan atm = new Tabungan(saldo);
		
		System.out.println("\nSaldo Anda 			: " + atm.saldo);
		System.out.print("Masukan Nominal tarik tunai	: ");
		tarikTunai = input.nextInt();
		atm.ambilUang(tarikTunai);
		
		System.out.println("Jumlah Saldo yang diambil 	: " + tarikTunai);
		System.out.println("Saldo Saat ini 			: " + atm.saldo);
		
	}
}
