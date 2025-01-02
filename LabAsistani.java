public class LabAsistani extends Asistan{
    public LabAsistani(String adsoyad,String eposta,String telefon,String bolum,String unvan ){
        super(adsoyad,eposta,telefon,bolum,unvan);

    }
    public void labaGir(){
        System.out.println(this.getadsoyad()+ " Asistanımız laboratuvara giriş yaptı " );
    }
    public void derseGir(){
        System.out.println(this.getadsoyad()+ "Asistanımız derse giriş yaptı ");
    }
}
