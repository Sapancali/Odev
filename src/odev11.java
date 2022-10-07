/*import java.util.Scanner;
public class odev11 {

	public static void main(String[] args) {
		Scanner klavye = new Scanner (System.in);
		System.out.println("Lutfen yasinizi ve cinsiyetinizi girin");
		int yas = klavye.nextInt();
		char cinsiyet = klavye.next().toUpperCase().charAt(0);
		
		System.out.println(cinsiyet=='E'||cinsiyet=='K'?(cinsiyet=='E'?( yas>65 ? "emekli":"calismali"):( yas>60?"emekli":"calismali")):"Yanlis bilgi girdiniz");
		
	}

}
import java.util.Scanner;
public class odev11 {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Ters yazilacak bir metin giriniz");
		
		String girilenMetin = klavye.nextLine();
		
		for(int i=girilenMetin.length()-1; i>=0; i-- )
		
		{
			System.out.print(girilenMetin.charAt(i));
		}
		

	}
}	*/

import java.util.Scanner;
public class odev11{
	public static void main(String[]args) {
		Scanner klavye= new Scanner(System.in);
		System.out.println("lutfen bir karakter girin");
		char karakter= klavye.next().charAt(0);
		int aski = karakter;
		System.out.println(karakter+" karakterin ASCII degeri "+aski);
		// 
	}
	
}


