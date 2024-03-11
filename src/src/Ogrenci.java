public class Ogrenci {
    private String Ogrencino;
    private int girisYili;
    private String ad;
    private String ogrNo;
    private String bolum;
    private String girisSirasi;
    private double gano;
    private int bolumkodu=104;
    public Ogrenci(){

    }
    public Ogrenci(Ogrenci ogr){

    }
    public Ogrenci(String ad, String bolum){
        this.ad=ad;
        this.bolum=bolum;
    }
    public Ogrenci(int girisYili,double gano) {
        this.girisYili=girisYili;
        if (0>gano || gano>4){
            throw new IllegalArgumentException("Bu nota ait öğrenci bulunamamıştır.");
        }
        this.gano=gano;
    }
    public Ogrenci(String ad, String bolum, double gano, int girisYili,String girisSirasi) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisSirasi=girisSirasi;
        if (0>gano || gano>4){
            throw new IllegalArgumentException("Bu nota ait öğrenci bulunamamıştır.");
        }
        this.gano = gano;
        this.girisYili=girisYili;

    }
    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public double harcHesapla(int derssayisi){
        return derssayisi*80;
    }
    public double harcHesapla(int derssayisi,double dersucreti){
        return derssayisi*dersucreti;
    }
    public String ogrenciNo( ){//giriş yılı+bölüm kodu+giriş sırası
        return this.ogrNo=(girisYili+""+bolumkodu+""+girisSirasi);
    }


}
