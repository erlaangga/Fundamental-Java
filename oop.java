import java.util.Scanner;

class oop{
	public static void main(String[]args){
		System.out.println("Hello");

		keluarga kita = new keluarga();
		System.out.println("isi keluarga: " + kita);
		kita.id = 1;
		kita.nama = "jajang";
		Scanner masukan3= new Scanner(System.in);
		System.out.print("Masukkan nilai pendapatanmu: ");
		kita.pendapatan = masukan3.nextInt();
//		kita.pendapatan = 90000000;
		System.out.println("Id\t\t: "+kita.id);
		System.out.println("Nama\t\t: "+kita.nama);
		System.out.println("Pendapatan\t\t: "+kita.pendapatan);
		
		keluarga kita2 = new keluarga();
		System.out.println("isi keluarga: " + kita2);
//		kita2.id = 1;
//		kita2.nama = "jajang";
//		Scanner masukan4= new Scanner(System.in);
//		System.out.print("Masukkan nilai pendapatanmu: ");
//		kita.pendapatan = masukan4.nextInt();
////		kita.pendapatan = 90000000;
		System.out.println("Id\t\t: "+kita2.get_id());
		System.out.println("Nama\t\t: "+kita2.get_name());
		System.out.println("Pendapatan\t\t: "+kita2.get_pendapatan());
		
		keluarga kita3 = new keluarga(10, "Jajang", 1000000000);
		System.out.println("isi keluarga3: " + kita3);
//		kita.pendapatan = 90000000;
		System.out.println("Id\t\t: "+kita3.id);
		System.out.println("Nama\t\t: "+kita3.nama);
		System.out.println("Pendapatan\t\t: "+kita3.pendapatan);
		
		keluarga kita4 = new keluarga();
		System.out.println("isi keluarga4: " + kita4);
//		kita.pendapatan = 90000000;
		System.out.println("Id\t\t: "+kita4.id);
		System.out.println("Nama\t\t: "+kita4.nama);
		System.out.println("Pendapatan\t\t: "+kita4.pendapatan);
		
		
		keluarga kita5;
		keluarga2 kita52 = new keluarga2();
		
		// kita5 akan mempunyai instance yang sama dengan kita52
		kita5 = kita52;
		
		System.out.println("isi keluarga5: " + kita5);
//		kita.pendapatan = 90000000;
		System.out.println("Id\t\t: "+kita5.id);
		System.out.println("Nama\t\t: "+kita5.nama);
		System.out.println("Pendapatan\t\t: "+kita5.pendapatan);

		belajar asik = new belajar();
		System.out.println(asik.nambah());
		
	}
}