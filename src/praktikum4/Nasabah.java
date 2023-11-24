package praktikum4;

public class Nasabah {
	public String namaDepan, namaBelakang;
	public Tabungan tabungan;
	
	public Nasabah(String namaDepan, String namaBelakang) {
		this.namaDepan = namaDepan;
		this.namaBelakang = namaBelakang;
	}
	
	public String getNamaDepan() {
		return namaDepan;
	}
	
	public String getNamaBelakang() {
		return namaBelakang;
	}
	
	public Tabungan getTabungan() {
		return tabungan;
	}
	
	public void setTabungan(Tabungan tabungan) {
		this.tabungan = tabungan;
	}
}
