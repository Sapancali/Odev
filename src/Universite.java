
public class Universite {
	String isim;
	String soyisim;
	String dogumTarihi;
	String tcKimlikNo;
	String ogrenciNo;
	String bolum;
	int diplomaNot;
	
	public Universite() {
		
	}
	//constructor
	public Universite(String isim, String soyisim, String dogumTarihi, String tcKimlikNo, String ogrenciNo, String bolum,int diplomaNot)
	{
		this.isim= isim;
		this.soyisim=soyisim;
		this.dogumTarihi=dogumTarihi;
		this.tcKimlikNo=tcKimlikNo;
		this.ogrenciNo=ogrenciNo;
		this.bolum=bolum;
		this.diplomaNot=diplomaNot;
	}
	public static void main(String[] args) {
		Universite ogrenci01= new Universite("Mahmut","KILIC","20.02.1998","1234567890","1200","Bilgisayar Ogretmenligi",65);
		Universite ogrenci02= new Universite("Kerim","YALCIN","10.03.1999","1234567891","1201","Kamu Yonetimi",76);
		Universite ogrenci03= new Universite("Ahmet","ABA","22.02.1997","1234567892","1202","Fizik Ogretmenligi",59);
		Universite ogrenci04= new Universite("Saban","KARA","10.02.2000","1234567893","1203","Edebiyat Ogretmenligi",78);
		Universite ogrenci05= new Universite("Mehmet","ALTUN","23.06.1995","1234567894","1204","Bilgisayar Muhendisligi",84);
		Universite ogrenci06= new Universite("Ceyhun","KOCA","11.02.2001","1234567895","1205","Sinif Ogretmenligi",90);
		Universite ogrenci07= new Universite("Yahya","YILMAZ","02.08.2002","1234567896","1206","Makina Muhendisligi",75);
		Universite ogrenci08= new Universite("Deniz","KARADENIZ","28.06.1996","1234567897","1207","Tarih Ogretmenligi",58);
		Universite ogrenci09= new Universite("Erhan","CEBI","21.12.1994","1234567898","1208","Kimya",80);
		Universite ogrenci10= new Universite("Fatih","KURU","19.07.1997","1234567899","1209","Ziraat Muhendisligi",74);
		
		
		Universite[] ogrenciler= {ogrenci01,ogrenci02,ogrenci03,ogrenci04,ogrenci05,ogrenci06,ogrenci07,ogrenci08,ogrenci09,ogrenci10};
		Universite[] siraliDizi = diziyiSirala (ogrenciler);
		
		for(int i=0; i<siraliDizi.length;i++) {
		System.out.println((i+1)+". Ogrenci "+siraliDizi[i].isim+" "+siraliDizi[i].soyisim+" diploma notu "+siraliDizi[i].diplomaNot);
		}
			
		
	}
		public static Universite[] diziyiSirala (Universite[]dizi){
			for(int i=0; i<dizi.length; i++) {
			Universite enBuyuk= dizi[i];
			int enBuyukIndex = i;
				for(int j=i; j<dizi.length; j++) {
					if (dizi[j].diplomaNot>enBuyuk.diplomaNot) {
					enBuyuk=dizi[j];
					enBuyukIndex= j;
					}
				}
			dizi[enBuyukIndex]=dizi[i];
			dizi[i]=enBuyuk;
		}
		return dizi;
	}

}
