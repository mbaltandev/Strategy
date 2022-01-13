public class Eleman {
public IzinHesap izinHesap;
public  MaasHesap maasHesap;
public  SigortaHesap sigortaHesap;

    public Eleman(IzinHesap izinHesap, MaasHesap maasHesap) {
        this.izinHesap = izinHesap;
        this.maasHesap = maasHesap;
    }

    public Eleman(IzinHesap izinHesap, MaasHesap maasHesap, SigortaHesap sigortaHesap) {
        this.izinHesap = izinHesap;
        this.maasHesap = maasHesap;
        this.sigortaHesap=sigortaHesap;
    }
    public void Hesapla(){
        System.out.println("izin hakkı "+izinHesap.izinHesapla()+" maaş miktarı "+maasHesap.maasHesapla());
    }
    public int izinHesapla(){
        return izinHesap.izinHesapla();
    }
    public int maasHesapla(){
        return maasHesap.maasHesapla();
    }

    public int sigortaHesapla(){
        return sigortaHesap.sigortaHesapla();
    }


}
