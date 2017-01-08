
public class Dummy {
	public static void main(String[] args) {
		// perulangan dengan for
		for(int i=1000;i>=12;i-=10){
			System.out.println("Ini adalah nilai ke: "+i);
		}
		
		int tes     = 100;
		
		
		for (int i = 100; i >= 0; i--){
			tes+=i;
			System.out.println("Nilai tes: " +      tes);
		}
		
		System.out.print(tes == 5150);
		
		double a = 5.8;
		System.out.println("Isi nilai a: "+a);
		int b = (int) a;
		System.out.println("Isi nilai b: "+b);
		double c = Math.floor(a);
		System.out.println("Isi c: " + c);
		int d = (int)c;
		System.out.println("Isi d: "+d);
		
		// di bawah adalah contoh if satu baris
		// spasi atau enter tidak berpengaruh pada Java
		if(a == 5.8) System.out.printf("Isi a adalah: %d ditambah %.1f \n",(int) a, a-5.0);
		if(a == 5.8)
		System.out.printf("Isi a adalah: %d ditambah %.1f \n",(int) a, a-5.0);
		
	}
}
