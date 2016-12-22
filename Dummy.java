
public class Dummy {
	public static void main(String[] args) {
		for(int i=1000;i>=12;i-=10){
			System.out.println("Ini adalah nilai ke: "+i);
		}
		
		int tes     = 100;
		for (int i = 100; i >= 0; i--){
			tes+=i;
			System.out.println("Nilai tes: " +      tes);
		}
		
		System.out.print(tes == 5150);
	}
}
