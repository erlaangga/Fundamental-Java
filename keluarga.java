
class keluarga {
	int id;
	String nama;
	long pendapatan;
	
	keluarga(){
		id = 123;
		nama = "Aselole!";
		pendapatan = 9348;
	}
	
	//tambahin konstruktor biar bisa multi input :D
	keluarga(int idx, String namanya, long pendapatannya){
		id = idx;
		nama = namanya;
		pendapatan = pendapatannya;
	}
	
	//	enkapsulasi
	// ada 2 jenis method enkapsulasi, kita sebut getter (mengembalikan nilai) dan setter (menetapkan sesuatu yang tidak memerlukan balikan).
	// di bawah adalah method getter semua
	public int get_id(){
		return id;
	}
	
	public String get_name(){
		return nama;
	}
	
	public long get_pendapatan(){
		return pendapatan;
	}
}

class keluarga2 extends keluarga{
	int id;
	int umur;
	
}
