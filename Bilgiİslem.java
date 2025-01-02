public class Bilgiİslem extends Memur{
    private String gorev;
    public Bilgiİslem(String adsoyad,String eposta,String telefon,String departman,String mesai,String gorev){
        super(adsoyad,eposta,telefon,departman,mesai);
        this.gorev=gorev;
    }
    public String getgorev(){
        return getgorev();
    }
    public void networkKurulum(){
        System.out.println(this.getadsoyad()+ " Görevlisi şu anda kurulum yapmaktadır ");
    }
}
