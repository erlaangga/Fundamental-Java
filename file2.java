import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

class File3{

 public static void main(String[] args) { 
   File f;
   f = new File("Latihan.txt");

   try{
	 OutputStream fs = new FileOutputStream(f);
     String s = "ini adalah file latihan";
     System.out.print(s+"JKDSFHJKDSHF");
    byte b[] = new byte[s.length()];
    for(int i=0;i<s.length();i++){
	  b[i] = (byte)s.charAt(i);
    }
    fs.write(b, 0, s.length());
    fs.close();
   }catch(Exception e){
   }
   
      File f2;
      f2 = new File("Latihan.txt");

      try{
       InputStream fs = new FileInputStream(f2);
       byte b[] = new byte[3000];
       fs.read(b);
       String str = new String(b,0,b.length);
       System.out.println("isi file : " + str);
       fs.close();
      }catch(Exception e){
      }   
     }
    


  }
