public class Memur extends Calisan{
    private String departman;
    private String mesai;
    public Memur(String adsoyad,String eposta,String telefon,String departman,String mesai) {
        super(adsoyad, eposta, telefon);
        this.departman = departman;
        this.mesai = mesai;
    }
    public String getDepartman(){
        return getDepartman();
    }
    public void setDepartman(String departman){
        this.departman=departman;
    }
    public String getMesai(){
        return mesai;
    }
    public void setMesai(String mesai){
        this.mesai=mesai;
    }
    public void calisma(){
        System.out.println(this.getadsoyad()+ " Çalışma yerinde görevinin başında ");
    }
}
