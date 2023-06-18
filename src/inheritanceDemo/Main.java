package inheritanceDemo;

public class Main {

	public static void main(String[] args) {

		/*   OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
			ogretmenKrediManager.Hesapla();*/
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());  // BURADA ISTER ASKER ISTER TARIM ISTER OGR KREDISI OLUSTUR
		
		
	}

}
