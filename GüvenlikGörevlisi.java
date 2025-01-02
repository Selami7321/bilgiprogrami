public class GüvenlikGörevlisi extends Memur  {
    private String belge;
    public GüvenlikGörevlisi(String adsoyad,String eposta,String telefon,String departman,String mesai,String belge){
        super(adsoyad,eposta,telefon,departman,mesai);
        this.belge=belge;
    }
    public String getBelge(){
        return belge;
    }
    public void setBelge(String belge){
        this.belge=belge;
    }
    public void nobetTutma(){
        System.out.println(this.getadsoyad()+ "Görevlisi şu anda nöbettedir");
    }
}
