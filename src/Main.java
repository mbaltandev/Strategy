public class Main {

    public static void main(String[] args) {
	Eleman muhendis1=new Eleman(new DepartmanAIzınHesap(),new Yonetici());

    int yonetici1Maas= muhendis1.maasHesapla();
    int yonetici1Izin= muhendis1.izinHesapla();

    Eleman muhendis=new Eleman(new DepartmanBIZınHesap(),new Muhendis(),new SigortaSirketiA());


    Eleman calisan=new Eleman(new DepartmanCIzınHesap(),new Calisan());
    calisan.Hesapla();
    
    muhendis.Hesapla();
    }
}
