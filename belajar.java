
@interface nyobainah{boolean keren();}


class meongin{
	int id;
	String nama;
	meongin next;
	perlindungan meong = new perlindungan();
	
}

class perlindungan{
	protected int id;
	protected String nama;
	private boolean meongkita;
	
}

class cobaencapsulate{
	private int id;
	
	private String nama;
	
	int setid(int id){
		this.id = id;
		return id;
	}
	// kalau tidak dedefinisikan public atributnya sudah otomatis public
	public cobaencapsulate setnama(String nama){
		this.nama = nama;
		return this;
	}
	
	String getnama(){
		return nama;
	}
	
	void printthis(){
		System.out.println("Isi this cobaencapsulate: "+this);
	}
	
}
class belajar{
	public static void main(String[] args){
		System.out.println("Yiihaa");
		
		
		String meong = "meongin";
		System.out.println("meong adalah "+ !(meong.compareTo("meongin")!=0));
		int an = 341;
//		CharSequence an = "aasd";
		System.out.println(an);
		if (an == 1){
			System.out.println("" + an);
			
		}
		
		keluarga meongpanda=null;
		if (meongpanda==null){
			System.out.println("meongpandameongpanda");
		}
		
		// statis ngga ya? kalo statis harus akses pake konstruktor
		belajar kalostatis = new belajar();
		int a = kalostatis.nambah(1);
		System.out.println(a);
		
		// overloading
		// kalo statis pake konstruktor juga boleh
		int b = kalostatis.nambah();
		System.out.println(b);
		
		//sekarang harus ngoding di atas meongin biar ngga kena infinity loop
		perlindungan dokter = new perlindungan();
		System.out.println(dokter.id);
		
		
//		meongin
		meongin panda = new meongin();
		panda.id = 10;
		panda.nama="meongin aja";
//		panda.next = panda;
		System.out.println("The new meong panda is " + panda.id);
		System.out.println("The new meong panda is " + panda.nama);
		panda.meong.id = 1230;
		System.out.println("The new meong panda is " + panda.meong.id);
//		while(panda.next != null){
//		System.out.println("The new meong panda is " + panda.next.next.next.next.next.next.next.nama);
//		panda.next = panda.next.next.next.next.next.next.next;
//		}
		
		oop dimeongin = new oop();
		dimeongin.main(args);
		
		System.out.println("Panjang args: "+args.length);
		
		belajar meongku = new belajar(); // harus membuat instance baru jika static ingin memanggil member (variabel, fungsi, dll) milik instance
		kucing asd= meongku.new kucing();
		System.out.println(asd.id);
		
		
		
		int []arrayan = {1,5,7,8,4,3123,656};
		for (int i=0; i<arrayan.length; i++){
			System.out.println("Ini loh isi arrayan ke"+i+": " + arrayan[i]);
		}
		
		System.out.println("The new for");
		// the new for
		for (int i : arrayan){
			System.out.println("Ini loh isi arrayan: " + i);
		}
		
		System.out.println("Bagian Enkapsulasi");
		cobaencapsulate cobaencape = new cobaencapsulate();
		System.out.println(cobaencape);
		System.out.println(cobaencape.setid(123));
		// Dibawah ini adalah contoh method chaining. Fungsi mengembalikan instans kelas sendiri agar dapat memanggil field di dalamnya
		System.out.println(cobaencape.setnama("Erlangga").getnama().concat(" Indra Permana"));
		String teks ="Pisang";
		System.out.println(teks.substring(1));
	}
	
	int nambah(int a){
		if (a<5){
			a++;
			a = nambah(a);
		}
		System.out.println("Isi this: "+this);
		System.out.println("Isi belajar.this: "+belajar.this); // mengembalikan nilai instance
		meongngomong();
		this.meongngomong(); // menggunakan this
		return a;
	}
	
	// sebuah kelas lain tidak perlu mempunyai referensi ke kelas ini untuk memanggil field yang mempunyai atribut static
	static int nambah(){
		return 5;
	}
	
	void meongngomong(){
		System.out.println("Meong terpanggil.");
	}
	
	// wow classception.
	public class kucing{
		int id;
		String nama;
		int umur;
		
		kucing(){
			
		}
	}
}
