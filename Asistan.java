public class Asistan extends Akademisyen{
    private String ofisSaati;

    public Asistan(String adsoyad,String eposta,String telefon,String bolum,String unvan){
        super(adsoyad,eposta,telefon,bolum,unvan);
        this.ofisSaati=ofisSaati;

    }

    public String getOfisSaati() {
        return ofisSaati;
    }
    public void setOfisSaati(String ofisSaati){
        this.ofisSaati=ofisSaati;
    }
    public void quizyap(){
        System.out.println(this.getadsoyad()+" Asistanı quiz yapmaktadır ");
    }
}
