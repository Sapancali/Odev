import java.util.Scanner;

public class Hesapisleri{

	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
				
		System.out.println("Bir sayi giriniz");
		int ilkSayi = klavye.nextInt();
		
		System.out.println("Bir sayi daha giriniz");
		int ikinciSayi = klavye.nextInt();
				
		System.out.println("Isleminizi giriniz");
		String islem = klavye.next();
		
		if(islem.equals("+"))
		{
			System.out.println(ilkSayi+ikinciSayi);
		}
		else if(islem.equals("-"))
		{
			System.out.println( + ilkSayi-ikinciSayi);
		}
		else if(islem.equals("*"))
		{
			System.out.println(ilkSayi*ikinciSayi);
		}
		else if(islem.equals("/"))
		{
			System.out.println(ilkSayi/ikinciSayi);
		}
		else if(islem.equals("%"))
			System.out.println(ilkSayi%ikinciSayi);
		}
		
		
}
