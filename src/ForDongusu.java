import java.util.Scanner;
public class ForDongusu {

	public static void main(String[] args) {
		Scanner klavye = new Scanner (System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = klavye.nextInt();
		
		for(int i=0; i<sayi; i++)
			{
			for(int j=1; j<sayi-i; j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			
			for(int k=0; k<i*2-1; k++)
				
			{
				System.out.print(" ");
			}			
			System.out.println("*");
			}		
			
	}

}
