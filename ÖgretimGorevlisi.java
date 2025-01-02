public class ÖgretimGorevlisi extends Akademisyen {
    public String kapiNo;

    public ÖgretimGorevlisi(String adsoyad, String eposta, String telefon, String bolum, String unvan, String kapiNo) {

        super(adsoyad, eposta, telefon, bolum, unvan);
        this.kapiNo = kapiNo;
    }

    public String getKapiNo() {
return kapiNo;
    }
    public void setKapiNo(String kapiNo){
        this.kapiNo=kapiNo;
    }
}