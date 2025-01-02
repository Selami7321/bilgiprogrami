public class Calisan {
    private String adsoyad;
    private String eposta;
    private String telefon;
    public Calisan(String adsoyad,String eposta,String telefon){
        this.adsoyad=adsoyad;
        this.eposta=eposta;
        this.telefon=telefon;

    }
    public String getadsoyad(){
        return adsoyad;
    }

    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }

    public String getEposta(){
        return eposta;

    }
    public void setEposta(String eposta){
        this.eposta=eposta;

    }
    public String getTelefon(){
        return telefon;
    }


    public void setTelefon(java.lang.String telefon) {
        this.telefon = telefon;
    }
    public void giris(){
        System.out.println(this.adsoyad + " Üniversiteye giriş yaptı");
    }
    public void cikis(){
        System.out.println(this.adsoyad + "Üniversiteden çıkış yaptı");
    }
    public void yemekhane(){
        System.out.println(this.adsoyad + " Yemekhaneye giriş yaptı");
    }
}
