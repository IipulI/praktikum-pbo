package praktikum5;

public abstract class Hewan {
	protected static String name;
	protected abstract void eat();
}

// Subclass
class Cat extends Hewan {
	String warna;
	int berat;
	
	public void identitas(String namaKucing, String warnaKucing, int beratKucing) {
		Cat.name = namaKucing;
		warna = warnaKucing;
		berat = beratKucing;
	}
	
	public String getName() {
		return Cat.name;
	}
	
	public String getWarna() {
		return warna;
	}
	
	public int getBerat() {
		return berat;
	}
	
	public void eat() {
		System.out.println(Cat.name + " Makan Whiskas");
	}
}
