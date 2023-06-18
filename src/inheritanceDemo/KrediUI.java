package inheritanceDemo;
                        // ARAYUZ  BUTONLAR TEXTBOXLAR BİRBİRİNE BAGLICAN
public class KrediUI {

/*	public void KrediHesapla(OgretmenKrediManager ogretmenKrediManager)
	{
		ogretmenKrediManager.Hesapla();// yapabilirim
	}*/
	
	
	// 2. yol 
	public void KrediHesapla(BaseKrediManager baseKrediManager)   // bu sayede ister ogretmenredı ıster tarım veya farklı
	{                                                             // sey gondderebilirsin
		baseKrediManager.Hesapla();                               // bunun sebeı refereans tıplı olmasıdır . MAIN E GEC
	}
	
}
