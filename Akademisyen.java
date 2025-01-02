public class Akademisyen extends Calisan{
    private String bolum;
    private String unvan;

    public Akademisyen(String adsoyad,String eposta,String telefon,String bolum,String unvan ){
        super(adsoyad,eposta,telefon);
        this.bolum=bolum;
        this.unvan=unvan;

    }
    public String getBolum(){
        return bolum;
    }

    public void setBolum(java.lang.String bolum) {
        this.bolum = bolum;
    }
    public String getUnvan(){
        return unvan;
    }
    public void  setUnvan(java.lang.String unvan ){
        this.unvan=unvan;
    }
    public void derseGir(){
        System.out.println(this.getadsoyad()+ "derse giriş yaptı ");
    }
}
